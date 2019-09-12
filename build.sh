bison -y -d doorlock.y
flex doorlock.l
gcc -c y.tab.c lex.yy.c
gcc y.tab.o lex.yy.o doorlock.c -o doorlock_exec