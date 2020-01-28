grammar ISN;

//Lexer
DATA    : [0-9][0-9][0-9][0-9]'-'[0-9][0-9]'-'[0-9][0-9] ;
TEXT    : '\"' ~('\'')* '\'';
WS      : [ \t\n\r] + -> skip ;
COLON   : ':';
SEMI    : ';';
LCURL   : '{';
RCURL   : '}';
LPAREN  : '[';
RPAREN  : ']';

//Parser
//Fazer um json?

array: RPAREN '"Novo(s) Registo(s) : "' (user)+  RPAREN;

user : LCURL dados RCURL;

dados :
	name
	username
	mail
	dob
	password
	course
	type
	;

name    :   'name' COLON TEXT SEMI ;

username:   'Username: ' TEXT SEMI ;

mail    : 'E-mail: ' TEXT SEMI ;

dob     : 'Data de Nascimento ' DATA SEMI ;

password: 'Password :' TEXT SEMI;

course  : 'Curso :' TEXT SEMI;

type    : 'Tipo de Utilizador ' TEXT SEMI ;