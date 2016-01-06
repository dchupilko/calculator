grammar CalcGrammar;

eval
    :   expression
    ;

expression
    :   add_expr
    |   sub_expr
    |   mult_expr
    |   div_expr
    |   let_expr
    ;

add_expr
    :   ADD LPAREN expr_or_num COMMA expr_or_num RPAREN
    ;

sub_expr
    :   SUB LPAREN expr_or_num COMMA expr_or_num RPAREN
    ;

mult_expr
    :   MULT LPAREN expr_or_num COMMA expr_or_num RPAREN
    ;

div_expr
    :   DIV LPAREN expr_or_num COMMA expr_or_num RPAREN
    ;

let_expr
    :   LET LPAREN VARIABLE COMMA expr_or_num COMMA expression RPAREN
    ;

expr_or_num
    :   expression
    |   NUMBER
    |   VARIABLE
    ;

ADD  : 'add' ;
SUB  : 'sub';
MULT : 'mult';
DIV  : 'div';
LET  : 'let';

LPAREN : '(' ;
RPAREN : ')' ;
COMMA : ',' ;

NUMBER : [0-9]+ ;
VARIABLE : [a-zA-Z]+ ;

WS : [ ]+ -> skip ;
