grammar Inquerito;

question returns [int N, int M]
        : cabec { $question.N=0; $question.M=$cabec.M;}
        ( questao[$cabec.M] {$question.N += 1;} )+ ','
        { if($question.N > 20) System.out.println("ERRO:..." + $question.N) ; }
        ;

cabec returns [int M]
        : 'Local' TEXT 'Data' DATA 'Respondentes' NUM
        { $cabec.M = $NUM.int; }
        ;

questao [int M]
        : 'Questao' ID '(' r1=resp[0] ( ',' r2=resp[$r1.sum] {$r1.sum=$r2.sum;} )* ')'
        {System.out.println("Media das resposta a Questao "+$ID.text+" = "+$r1.sum/$questao.M); }
        ;

resp [float sumIN]
        returns [float sum]
        :   NUM
        { if ( $NUM.int > 3 ) { System.out.println("ERRO:..." = $NUM.int ); $resp.sum=-1; }
          else              { $resp.sum = $resp.sumIN + $NUM.int; } }
        ;

ID      : [a-zA-Z][a-zA-Z0-9]* ;
TEXT    : '\'' ~('\'')* '\'';
DATA    : [0-9][0-9][0-9][0-9]'-'[0-9][0-9]'-'[0-9][0-9] ;
NUM     :('0'..'9')+;
WS      :( [ \t\r\n ] ) -> skip ;