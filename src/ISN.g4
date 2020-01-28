grammar ISN;

//Lexer
LPAREN  : '[' ;
RPAREN  : ']' ;
LCURL   : '{' ;
RCURL   : '}' ;
COLON   : ':' ;
QUOTE   : '\'\'\'' ;
COMMA   : ',' ;
DIGIT   : [0-9] ;
STRING  : '"' ~('"')+ '"' ;
WS      : [ \t\n\r] + -> skip ;

//Parser
cv : 
	LPAREN table RPAREN (COMMA LPAREN table RPAREN)*
;

table :
	'personal' COLON LCURL personal RCURL (COMMA LCURL personal RCURL )*
	| 'projects' COLON LCURL projects RCURL (COMMA LCURL projects RCURL )*
	| 'publications' COLON LCURL publications RCURL (COMMA LCURL publications RCURL )*
	| 'networks' COLON LCURL networks RCURL (COMMA LCURL networks RCURL )*
	| 'editorial_boards' COLON LCURL editorialBoards RCURL (COMMA LCURL editorialBoards RCURL )*
	| 'scientific_committee' COLON LCURL scientificCommittee RCURL (COMMA LCURL scientificCommittee RCURL )*
	| 'thesis' COLON LCURL thesis RCURL (COMMA LCURL thesis RCURL )*
	| 'organization_of_events' COLON LCURL organizationOfEvents RCURL (COMMA LCURL organizationOfEvents RCURL )*
	| 'scientific_meetings' COLON LCURL scientificMeetings RCURL (COMMA LCURL scientificMeetings RCURL )*
	| 'other_info' COLON LCURL otherInfo RCURL (COMMA LCURL otherInfo RCURL )*
; 

personal :
	'studies_category' COLON STRING
	| 'professional_category' COLON STRING
	| 'cvitae' COLON STRING
	| 'orcid' COLON STRING
	| 'scopus' COLON STRING
	| 'address' COLON STRING
	| 'phone' COLON DIGIT+
	| 'homepage' COLON STRING
	| 'photo' COLON STRING
	| 'bionote' COLON STRING
	| 'interests' COLON listFormat
	| 'profissional' COLON listFormat
	| 'education' COLON listFormat
	| 'appointments' COLON listFormat
;

projects :
	'title' COLON STRING
	| 'date_start' COLON date
	| 'tipo' COLON STRING
	| 'project' COLON STRING
	| 'date_end' COLON date
;

networks :
	'network' COLON STRING
	| 'date_start' COLON date
	| 'network_info' COLON STRING
	| 'network_website' COLON STRING
;

editorialBoards :
	'journal_name' COLON STRING
	| 'date_start' COLON date
	| 'journal_url' COLON STRING
	| 'date_end' COLON date
;

scientificCommittee :
	'journal_name' COLON STRING
	| 'date_start' COLON date
	| 'tipo' COLON STRING
	| 'journal_url' COLON STRING
	| 'date_end' COLON date
;

otherInfo :
	'date_end' COLON date
	| 'info_entry' COLON STRING
;

thesis :
	'thesis_title' COLON STRING
	| 'thesis_student' COLON STRING
	| 'thesis_type' COLON STRING
	| 'date_start' COLON date
	| 'advisor_type' COLON STRING
	| 'orientador' COLON STRING
	| 'coorientador' COLON STRING
	| 'date_end' COLON date
	| 'thesis_course' COLON STRING
;

organizationOfEvents :
	'event_title' COLON STRING
	| 'event_place' COLON STRING
	| 'date_start' COLON date
	| 'date_end' COLON date
	| 'event_type' COLON STRING
	| 'organizador' COLON STRING
	| 'event_website' COLON STRING
;

scientificMeetings :
	'event_info' COLON STRING
	| 'date_start' COLON date
	| 'event_type' COLON STRING
	| 'invite' COLON STRING
	| 'int_nac' COLON STRING
;

publications :
	'cite' COLON STRING
	| 'date_pub' COLON date
	| 'pub_type' COLON STRING
	| 'index_scopus' COLON STRING
	| 'index_webs' COLON STRING
	| 'index_scielo' COLON STRING
	| 'peerreview' COLON STRING
	| 'int_nac' COLON STRING
	| 'repositorium' COLON STRING
	| 'in_press' COLON STRING
;

listFormat :
	STRING ('|' STRING)+
;

date :
    year '-' month '-' day
;

year :
    DIGIT DIGIT DIGIT DIGIT
;

month :
    DIGIT DIGIT
;

day :
    DIGIT DIGIT
;
