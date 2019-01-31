grammar XQuery;

ap  : doc '/' rp            #apSingleSlash
    | doc '//' rp           #apDoubleSlash
    ;

doc : 'doc(' FILENAME ')'   #docName
    ;

rp  : Identifier            #rpTag
    | '*'                   #rpWildcard
    | '.'                   #rpCurr
    | '..'                  #rpPrev
    | 'text()'              #rpText
    | '@' Identifier        #rpAttribute
    | '(' rp ')'            #rpParentheses
    | rp '/' rp             #rpSingleSlash
    | rp '//' rp            #rpDoubleSlash
    | rp '[' f ']'          #rpSquare
    | rp ',' rp             #rpPair
    ;

f   : rp                    #fRelativePath
    | rp ('=' | 'eq')       #fEqual
    | rp ('==' | 'is' )     #fSame
    | '(' f ')'             #fParentheses
    | f 'and' f             #fAnd
    | f 'or' f              #fOr
    | 'not' f               #fNot
    ;


FILENAME: '"' (~'"')* '"';

Identifier: Letter (Letter | Digit | '-')*;

fragment Letter: [a-zA-Z];

fragment Digit: [0-9];

// Ignore White Space
WhiteSpace: [ \n\t\r]+ -> skip;


