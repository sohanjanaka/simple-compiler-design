#include <stdio.h>

#include "doorlock.h"
#include "y.tab.h"

int ex(nodeType *p) {
    int lbl1, lbl2;

    if (!p) return 0;
    switch(p->type) {
    case typeCon:
        printf("%d", p->con.value);
        break;
    case typeId:
    	if (p->id.i == 1) {
    		printf("50'\n");
		} else if (p->id.i == 2) {
			printf("-50'\n");
		}
        break;
    case typeOpr:
        switch(p->opr.oper) {

        case DOOR:	printf("\nDATA P1 090H\n");
        			printf("DATA P2 0A0h\n");
                	printf("ORG 30H\n\n");
        			printf("\tCLR P1.7\n");
					printf("\tMOV P2, #");
        			ex(p->opr.op[0]);
        			printf("\n");
					printf("\tMOV DPTR, #100h\n");
					printf("\tMOV R1, #11\n\n");
					printf("LOOP:   CLR A\n");
					printf("\tMOVC A,@A+DPTR\n");
					printf("\tMOV SBUF,A\n");
					printf("\tJNB TI, $\n");
					printf("\tCLR TI\n");
					printf("\tINC DPTR\n");
					printf("\tDJNZ R1, LOOP\n\n");
					printf("\tORG 100H\n");
					printf("\tDB '@01 RMOV ");
					ex(p->opr.op[1]);
					printf("END\n\n");
                    break;

        case CHECK:	printf("\nDATA P1 090H\n");
        			printf("ORG 30H\n\n");
					printf("\tSETB P1.7\n");
					printf("\tJB P1.");
					ex(p->opr.op[0]);
					printf(", LOCK\n\n");
					printf("UNLOCK: MOV DPTR, #100H\n\n");
					printf("\tMOV R1, #6\n");
					printf("\tSJMP LOOP\n");
					printf("LOCK:   MOV DPTR, #103H\n\n");
					printf("\tMOV R1, #4\n");
					printf("\tSJMP LOOP\n");
					printf("LOOP:   CLR A\n");
					printf("\tMOVC A,@A+DPTR\n");
					printf("\tMOV SBUF,A\n");
					printf("\tJNB TI, $\n");
					printf("\tCLR TI\n");
					printf("\tINC DPTR\n");
					printf("\tDJNZ R1, LOOP\n\n");
					printf("\tORG 100H\n");
					printf("\tDB 'UNLOCK'\n");
					printf("END\n\n");
					break;

        default:	printf("Unknown command\n");
            		break;
            }
        }
    return 0;
}


