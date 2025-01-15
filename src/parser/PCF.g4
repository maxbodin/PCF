grammar PCF;

// règles syntaxiques.
program : (term (WS* LINE_COMMENT? WS* MULTI_COMMENT? WS* term)*) EOF ; // Permet plusieurs termes.
term : cond                                # Condi
     | addition                            # Add
     ;

cond : 'ifz' term 'then' term 'else' term ; // Conditionnelle

addition : multiplication (('+' | '-') multiplication)* ; // Priorité pour + et -
multiplication : atom (('*' | '/') atom)* ;               // Priorité pour * et /
atom : LIT                                   # Lit
     | '(' term ')'                         # Parens
     ;


// règles lexicales.

OP  : '+' | '-' | '*' | '/' ;
LIT : '0' | [1-9][0-9]* ;

// Gestion des espaces et des commentaires.

WS : [ \t\r\n]+ -> skip ;               // Ignore les espaces, tabulations et sauts de ligne.
LINE_COMMENT : '//' .*? '\n' -> skip ;
MULTI_COMMENT : '/*' .*? '*/' -> skip ;
