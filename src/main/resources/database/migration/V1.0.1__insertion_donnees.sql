insert into UTILISATEUR (NOM,PRENOM,EMAIL,LOGIN,MOT_DE_PASSE)
				values('amine','md','amine@md.com','a','a');

insert into ROLE (LIBELLE)
				values('ADMIN');						  
						  
insert into UTILISATEUR_ROLE (UTILISATEUR_ID,ROLE_ID)
				values(1,1);								  

insert into EXAM_TYPE (LIBELLE,DESCRIPTION)
				values('stage-pfe','stage pfe');

insert into EXAM (LIBELLE,UTILISATEUR_ID,EXAM_TYPE_ID)
				values('stage_pfe_2017',1,1);
				
insert into QUESTION_TYPE (LIBELLE,DESCRIPTION)
				values('SC','simple choix');
insert into QUESTION_TYPE (LIBELLE,DESCRIPTION)
				values('MC','multiple choix');

insert into QUESTION (CONTENU,NOTE,UTILISATEUR_ID,QUESTION_TYPE_ID)
				values('ou se trouve la ville Marrakech',1,1,2);
insert into QUESTION (CONTENU,NOTE,UTILISATEUR_ID,QUESTION_TYPE_ID)
				values('2+2',1,1,1);
					
insert into EXAM_QUESTION (EXAM_ID,QUESTION_ID)
				values(1,1);			
insert into EXAM_QUESTION (EXAM_ID,QUESTION_ID)
				values(1,2);	
				
insert into QUESTION_CHOIX (CONTENU,CORRECTE,QUESTION_ID)
				values('EUROPE',0,1);	
insert into QUESTION_CHOIX (CONTENU,CORRECTE,QUESTION_ID)
				values('MAROC',1,1);
insert into QUESTION_CHOIX (CONTENU,CORRECTE,QUESTION_ID)
				values('EGYPT',0,1);
insert into QUESTION_CHOIX (CONTENU,CORRECTE,QUESTION_ID)
				values("l'afrique",1,1);
				
insert into QUESTION_CHOIX (CONTENU,CORRECTE,QUESTION_ID)
				values('4',1,2);	
insert into QUESTION_CHOIX (CONTENU,CORRECTE,QUESTION_ID)
				values('5',0,2);
insert into QUESTION_CHOIX (CONTENU,CORRECTE,QUESTION_ID)
				values('3',0,2);
insert into QUESTION_CHOIX (CONTENU,CORRECTE,QUESTION_ID)
				values('2',0,2);
