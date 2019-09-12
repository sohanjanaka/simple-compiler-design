%{
#include <stdlib.h>
#include "doorlock.h"
#include "y.tab.h"
void yyerror(char *);
%}

%%

[0-3] 		{
                yylval.iValue = atoi(yytext);
                return NO;
            }

";" 		{
                return *yytext;
             }

"door"			return DOOR;
"check"			return CHECK;

"lock"			return LOCK;
"unlock"		return UNLOCK;

[ \t\n]+        ;       /* ignore whitespace */

.               yyerror("Unknown character");
%%
int yywrap(void) {
    return 1;
}
