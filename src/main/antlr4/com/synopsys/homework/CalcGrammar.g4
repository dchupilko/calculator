grammar CalcGrammar;

@header {
    import java.util.Map;
    import java.util.HashMap;
}

@members {
    private Map<String, Integer> vars = new HashMap<>();
}

eval returns [int value]
    :   exp = expression {$value = $exp.value;}
    ;

expression returns [int value]
    :   exp1 = add_expr   {$value = $exp1.value;}
    |   exp2 = sub_expr   {$value = $exp2.value;}
    |   exp3 = mult_expr  {$value = $exp3.value;}
    |   exp4 = div_expr   {$value = $exp4.value;}
    |   exp5 = let_expr   {$value = $exp5.value;}
    ;

add_expr returns [int value]
    :   ADD LPAREN a1 = expr_or_num COMMA a2 = expr_or_num RPAREN {$value = $a1.value + $a2.value;}
    ;

sub_expr returns [int value]
    :   SUB LPAREN s1 = expr_or_num COMMA s2 = expr_or_num RPAREN {$value = $s1.value - $s2.value;}
    ;

mult_expr returns [int value]
    :   MULT LPAREN m1 = expr_or_num COMMA m2 = expr_or_num RPAREN {$value = $m1.value * $m2.value;}
    ;

div_expr returns [int value]
    :   DIV LPAREN d1 = expr_or_num COMMA d2 = expr_or_num RPAREN {$value = $d1.value / $d2.value;}
    ;

let_expr returns [int value]
    :   LET LPAREN set_variable COMMA exp = expression RPAREN {$value = $exp.value;}
    ;

set_variable
    :   bind = VARIABLE COMMA value = expr_or_num {vars.put($bind.text, $value.value);}
    ;

expr_or_num returns [int value]
    :   exp = expression  {$value = $exp.value;}
    |   n = NUMBER        {$value = Integer.parseInt($n.text);}
    |   var = VARIABLE    {$value = vars.get($var.text);}
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
