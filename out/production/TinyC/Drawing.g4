grammar Drawing;

drawing : canvas figures
        ;
canvas  : 'canvas' ':' INT 'x' INT
        ;
figures : '--drawing--' figure ';' (figure ';')*
        ;
figure : rectangle | triangle | circle
        ;
rectangle : 'rec' INT 'x' INT '@' center
        ;
triangle : 'tri' INT 'x' INT '@' center
        ;
circle : 'cir' INT '@' center
        ;
center : '(' INT ',' INT ')'
        ;

INT : [0-9]+;
WS : [ \r\n\t] -> skip ;
