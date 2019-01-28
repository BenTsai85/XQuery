grammar XPath;

ap  : doc '/' rp            #apSingleSlash
    | doc '//' rp           #apDoubleSlash
    ;

doc : '(' fileName ')'      #docName
    ;

rp  : tagName               #rpTag
    | '*'                   #rpWildcard
    | '.'                   #rpCurr
    | '..'                  #rpPrev
    | 'text()'              #rpText
    | '@' attName           #rpAtt
    | '(' rp ')'            #rpParentheses
    | rp '/' rp             #rpSingleSlash
    | rp '//' rp            #rpDoubleSlah
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

fileName: FILENAME;
FILENAME: [a-zA-Z0-9._]+;

tagName: Letter (Letter | Digit | '-')*;

attName:  Letter (Letter | Digit | '-')*;

fragment Letter: [a-zA-Z];

fragment Digit: [0-9];

WhiteSpace: [ \n\t\r ]+ -> skip;
