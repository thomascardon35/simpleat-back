insert into personne (nom, prenom, email, password) values ('Cardon', 'Thomas', 'thomas.cardon@gmail.com', '$2a$10$724bLjLyGOEKTBbHy.s3C.ETc.HuBnhEoCOuoO7.Ts7kyPbz6hkme');
insert into personne (nom, prenom, email, password) values ('Ramiere', 'Vincent', 'vincent.ramiere@gmail.com', '$2a$10$x6.VyO9PCMXSPsi5/m/Hze9xOP.IUdYbaye7cNFc.PfyuRuVLbG7e');
insert into personne (nom, prenom, email, password) values ('Verger', 'Romain', 'romain.verger@gmail.com', '$2a$10$oe/h0ZDpi6xFmTj8CvDMDe13hoEGv0DhHziY7GUatbb9ETcRw/8RG');
insert into personne (nom, prenom, email, password) values ('Ribardiere', 'Paul-Emmanuel', 'paul.ribardiere@gmail.com', '$2a$10$ArSe7TSUapTs9oGE8824fOv4PM6NJwu7mzcg72cSmHy0.ds585Oke');
insert into personne (nom, prenom, email, password) values ('Noris', 'William', 'william.noris@gmail.com', '$2a$10$6UbvPYBR2Ql09M1kgK0.HuoX3X1gxScmaOxI242EB2U7cXiylX3z.');
insert into personne (nom, prenom, email, password) values ('Harmand', 'Isabelle', 'isabelle.harmand@gmail.com', '$2a$10$at1EZABxNN32M5pCttV36OvzbUWx1myGisa36i3..vveO6j0Lk2Da');
insert into personne (nom, prenom, email, password) values ('Bajard', 'Blandine', 'blandine.bajard@gmail.com', '$2a$10$koeHn0Wg54MTc7iDb9hbsujy/Opfrhhu0uuhhBNA00rMXLeMpSl.m');
insert into personne (nom, prenom, email, password) values ('El Hiri', 'Sana', 'sana.el-hiri@gmail.com', '$2a$10$jBBk1RQrl5XOeSQYz3xdJ.Xl8hBIu/x3mqHpYyL10m6KjwfDsWGEW');
insert into personne (nom, prenom, email, password) values ('Lucas', 'Cecile', 'cecile.lucas@gmail.com', '$2a$10$HAUg8vlmtvS/YphJzWAPfuGJdLd/3SeSZ48JVvybK6Wh/AY3QirGG');
insert into personne (nom, prenom, email, password) values ('Kerkeb', 'Mohamed', 'mohamed.kerkeb@gmail.com', '$2a$10$BpWZMlDLKXA2qGMo9t6cxeS6G/6mvjdsdN4nIUOAjE2sr/0sJNiCW');
insert into personne (nom, prenom, email, password) values ('Rinquin', 'Aline', 'aline.rinquin@gmail.com', '$2a$10$FJKDTcipj/8PKos7AcCnZ.HHAmdDh6EjknpUWPLDcVfSXWPcHZI5O');
insert into personne (nom, prenom, email, password) values ('Keddar', 'Noreddine', 'noredinne.keddar@gmail.com', '$2a$10$5iowOIUv72hFVsT9B8K.nerA3YTPAyyUiqOAwKR55ZZcpiHT96LhG');
insert into personne (nom, prenom, email, password) values ('Tomczyk', 'Julian', 'julian.tomczyk@gmail.com', '$2a$10$vJ89S5CXjtO01NsYrwfLyudU/p2Cz1QNDm1dGUkfKD60Z23HLZM2.');
insert into personne (nom, prenom, email, password) values ('Mjid', 'Hedi', 'hedi.mjid@gmail.com', '$10$vJ89S5CXjtO01NsYrwfLyudU/p2Cz1QNDm1dGUkfKD60Z23HLZM2.');
insert into personne (nom, prenom, email, password) values ('BIDEN', 'Joe', 'joe@biden.fr', '$2a$10$NNfAnATNZf/MzIjrUFi5K.xqWizxv1Hil4/PyRAabKWK5DxsLPE6.');

INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (1,'ROLE_ADMIN');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (2,'ROLE_ADMIN');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (3,'ROLE_ADMIN');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (4,'ROLE_ADMIN');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (5,'ROLE_READER');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (6,'ROLE_READER');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (7,'ROLE_READER');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (8,'ROLE_READER');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (9,'ROLE_READER');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (10,'ROLE_READER');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (11,'ROLE_READER');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (12,'ROLE_READER');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (13,'ROLE_READER');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (14,'ROLE_READER');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (15,'ROLE_ADMIN');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (15,'ROLE_CREATOR');
INSERT INTO `personne_role_list` (`personne_id_personne`,`role_list`) VALUES (15,'ROLE_READER');


insert into role (id_role, intitule) values (1, 'Admin');
insert into role (id_role, intitule) values (2, 'User');

INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,0,1,1,'Le Jardin de Montreuil','1 Rue du Sergent Godefroy, 93100 Montreuil','01 41 63 92 66','http://www.lejardindemontreuil.fr/','48.853391599999995','2.4347358');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,0,'La CaVe','45 Rue de Paris, 93100 Montreuil','01 42 87 09 48','http://www.lacaveestrestaurant.com/','48.8576152','2.4342148999999997');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (3,0,1,1,'Villa 9 Trois','71 Rue Hoche, 93100 Montreuil','01 48 58 17 37','http://www.villa9trois.com/','48.8638352','2.4331966');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,1,'L''Amourette','54 Rue Robespierre, 93100 Montreuil','01 48 59 99 94','http://www.lamourette.fr/','48.853121599999994','2.4234494');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,1,'La Maison Montreuil','31 Rue du Capitaine Dreyfus, 93100 Montreuil','09 87 18 18 81','https://www.lamaisonmontreuil.com/','48.859359700000006','2.4399254999999997');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (1,1,1,1,'le poulet en feu','63 Rue Danton, 93100 Montreuil','09 87 51 10 90','https://www.pouletenfeu.fr/','48.8653553','2.4514297');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,0,1,1,'Les Tonneaux','62 Rue Robespierre, 93100 Montreuil','01 48 58 95 01',NULL,'48.85205','2.4238472');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,1,'Les Pianos','26 Rue Robespierre, 93100 Montreuil','09 63 53 85 17','https://www.facebook.com/lespianosmontreuilofficiel/','48.854841799999996','2.4230319');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,0,1,1,'M I M','113 Rue Marceau, 93100 Montreuil','01 43 63 31 13',NULL,'48.849849999999996','2.4265312999999997');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (1,1,1,1,'Le Gévaudan','1 Bd Rouget de Lisle, 93100 Montreuil','01 42 87 42 83',NULL,'48.8617445','2.4412374');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,1,'Restaurant Filippo','6 Bd Chanzy, 93100 Montreuil','01 48 18 08 16',NULL,'48.8583964','2.4349743');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (1,0,1,1,'Le Mange Disc','50 Rue de Romainville, 93100 Montreuil','09 83 54 60 27','https://m.facebook.com/Le-Mange-Disc-102557926519195/?locale2=fr_FR','48.8658457','2.4466363');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (1,1,1,NULL,'Restaurant El Kahina','227 Rue de Paris, 93100 Montreuil','01 48 70 95 46',NULL,'48.8550124','2.4195686');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (NULL,1,1,1,'La Baraka','262 Rue de Paris, 93100 Montreuil','01 42 87 19 27','http://www.labarakamontreuil.fr/?lang=fr','48.8549268','2.4177603999999997');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,1,'La Bottega Della Pizza','34 Bd Rouget de Lisle, 93100 Montreuil','01 43 63 04 35','http://www.labottegadellapizza.fr/','48.860204200000005','2.4387626');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,0,1,NULL,'Restaurant de la Paix','11 Rue Armand Carrel, 93100 Montreuil','01 73 55 21 72',NULL,'48.853764','2.4177003999999997');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,1,'La Fontaine Bar Restaurant','47 Rue Armand Carrel, 93100 Montreuil','01 48 70 08 84','https://www.facebook.com/pages/la-fontaine-de-montreuil-Restaurant/213852528659590?fref=ts','48.8512132','2.4183881');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (3,1,1,NULL,'La Cantine Arkose Montreuil','33 Rue du Progrès, 93100 Montreuil','01 49 88 45 07','https://lacantine.arkose.com/montreuil/','48.8516335','2.419278');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (3,1,1,NULL,'Kashmir Café.','14 Rue du Capitaine Dreyfus, 93100 Montreuil','01 43 63 33 86','http://www.kashmircafe.fr/','48.8582843','2.4378471999999998');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,1,'W Lounge','37 Rue de Valmy, 93100 Montreuil','01 48 37 61 17','http://wlounge-montreuil.com/?utm_source=gmb&utm_medium=referral','48.8507208','2.4187186');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (1,1,1,1,'L''Oasis','171 Rue de Paris, 93100 Montreuil','01 48 70 70 52','https://loasis-montreuil.fr/fr','48.855555599999995','2.4230556');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,1,'Obrigado','8 Av. de la Prte de Montreuil, 75020 Paris','09 84 58 24 21','http://obrigado.paris/','48.8534995','2.4118692');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,1,'Le Xanthos','30 Rue du Capitaine Dreyfus, 93100 Montreuil','01 55 86 26 77',NULL,'48.858785','2.4388468999999997');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,1,'Thé Vert','43 Rue du Capitaine Dreyfus, 93100 Montreuil','01 42 87 79 57','http://www.thevertenligne.fr/','48.8596741','2.4405049');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,1,'Gramophone','1 Rue Pépin, 93100 Montreuil','01 49 88 74 56','http://www.restaurantlegramophone.com/','48.8641275','2.4449753');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,0,1,NULL,'La Grosse Mignonne','56 Rue Carnot, 93100 Montreuil','01 42 87 54 51','https://www.facebook.com/LaGrosseMignonne','48.855322','2.4413144');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (1,1,1,NULL,'La Galetiere','126 Rue de Paris, 93100 Montreuil','01 42 87 47 32','http://lagaletiere.eatbu.com/','48.8563999','2.4263293');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (3,1,1,1,'Le Mamaju','36 Rue de Lagny, 93100 Montreuil','01 83 74 02 26','https://mamaju-restaurant-montreuil.eatbu.com/','48.8490247','2.4265491');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,NULL,'Le Pizzo','15 Rue du Capitaine Dreyfus, 93100 Montreuil','09 88 46 71 29',NULL,'48.8588721','2.4385882999999997');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,NULL,'L''Olivier','211 Rue de Paris, 93100 Montreuil','06 47 82 43 41',NULL,'48.855081','2.4203481');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,1,'Louise','27 Rue du Capitaine Dreyfus, 93100 Montreuil','06 75 32 56 81','https://instagram.com/cafelouisemontreuil?utm_medium=copy_link','48.859237','2.4394462');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (1,1,1,1,'Ô Bar Lié','16 Rue de la République, 93100 Montreuil','01 48 58 71 95','http://www.obarlie.com/','48.8531155','2.4209562');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (1,1,1,NULL,'Gabycook','27 Rue du Progrès, 93100 Montreuil',NULL,NULL,'48.851772999999994','2.4202114');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,1,'L''ALEMBERT','268 Rue de Paris, 93100 Montreuil','01 42 87 29 61','http://www.lalembert.fr/','48.8549126','2.4174881999999998');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,NULL,'Gujarat','35 Bd Paul Vaillant Couturier, 93100 Montreuil','01 48 58 77 16','http://restaurantgujarat.fr/','48.865111','2.443053');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,NULL,'L''effiloché Montreuil','5 Rue du Centenaire, 93100 Montreuil',NULL,NULL,'48.8579636','2.4270348');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,NULL,'Famille-CMC','6 Av. Pasteur, 93100 Montreuil',NULL,NULL,'48.862999300000006','2.441328');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,NULL,'O''Villagio','28 Rue du Capitaine Dreyfus, 93100 Montreuil','01 57 42 63 82','https://ovillaggio93.wixsite.com/o-villaggio','48.858722','2.4386695');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,1,'La Brasserie des Laitières','38 Rue de Lagny, 93100 Montreuil','01 48 51 50 70','https://le-bl.metro.biz/','48.8490399','2.4262376999999997');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (1,1,1,1,'LE HAVANE','248 Rue de Paris, 93100 Montreuil','01 48 57 17 23',NULL,'48.855091599999994','2.4187965');
INSERT INTO restaurant(prix,a_emporter,sur_place,accespmr,nom,adresse,telephone,website,latitude,longitude) VALUES (2,1,1,1,'Chez Carla','6 Rue Claude Bernard, 93100 Montreuil','01 48 18 00 53','http://www.chezcarla.fr/','48.8699343','2.4507599');




insert into preference (restau_id_restau, personne_id_personne, note, favori) values (2, 9, 1, false);
insert into preference (restau_id_restau, personne_id_personne, note, favori) values (3, 1, 5, false);
insert into preference (restau_id_restau, personne_id_personne, note, favori) values (1, 9, 3, true);
insert into preference (restau_id_restau, personne_id_personne, note, favori) values (4, 6, 2, false);
insert into preference (restau_id_restau, personne_id_personne, note, favori) values (5, 5, 5, false);
insert into preference (restau_id_restau, personne_id_personne, note, favori) values (1, 10, 1, false);
insert into preference (restau_id_restau, personne_id_personne, note, favori) values (5, 3, 5, false);
insert into preference (restau_id_restau, personne_id_personne, note, favori) values (1, 7, 1, true);
insert into preference (restau_id_restau, personne_id_personne, note, favori) values (4, 2, 1, false);
insert into preference (restau_id_restau, personne_id_personne, note, favori) values (1, 3, 5, false);
insert into preference (restau_id_restau, personne_id_personne, note, favori) values (3, 10, 4, false);
insert into preference (restau_id_restau, personne_id_personne, note, favori) values (3, 3, 4, true);
insert into preference (restau_id_restau, personne_id_personne, note, favori) values (2, 3, 3, false);
insert into preference (restau_id_restau, personne_id_personne, note, favori) values (2, 8, 3, false);
insert into preference (restau_id_restau, personne_id_personne, note, favori) values (5, 15, 3, false);
insert into preference (restau_id_restau, personne_id_personne, note, favori) values (8, 15, 3, false);

insert into type (id_type, libelle) values (1, 'Kebab');
insert into type (id_type, libelle) values (2, 'Supermarché');
insert into type (id_type, libelle) values (3, 'Boulangerie');
insert into type (id_type, libelle) values (4, 'Thaï');
insert into type (id_type, libelle) values (5, 'Français');
insert into type (id_type, libelle) values (6, 'Pizza');
insert into type (id_type, libelle) values (7, 'Brasserie');
insert into type (id_type, libelle) values (8, 'Americain');
insert into type (id_type, libelle) values (9, 'Japonais');
insert into type (id_type, libelle) values (10, 'Asiatique');
insert into type (id_type, libelle) values (11, 'Italien');
insert into type (id_type, libelle) values (12, 'Sushis');
insert into type (id_type, libelle) values (13, 'Chinois');
insert into type (id_type, libelle) values (14, 'Crêperie');
insert into type (id_type, libelle) values (15, 'Hamburger');
insert into type (id_type, libelle) values (16, 'Indien');
insert into type (id_type, libelle) values (17, 'Marocain');
insert into type (id_type, libelle) values (18, 'Fruits de Mer');
insert into type (id_type, libelle) values (19, 'Steack');
insert into type (id_type, libelle) values (20, 'Vietnamien');
insert into type (id_type, libelle) values (21, 'Bistrot');
insert into type (id_type, libelle) values (22, 'Poulet');

insert into type_restau (id_restau, id_type) values (1, 5);
insert into type_restau (id_restau, id_type) values (2, 5);
insert into type_restau (id_restau, id_type) values (3, 5);
insert into type_restau (id_restau, id_type) values (4, 5);
insert into type_restau (id_restau, id_type) values (5, 5);
insert into type_restau (id_restau, id_type) values (6, 8);
insert into type_restau (id_restau, id_type) values (6, 22);
insert into type_restau (id_restau, id_type) values (7, 7);
insert into type_restau (id_restau, id_type) values (8, 5);
insert into type_restau (id_restau, id_type) values (9, 21);
insert into type_restau (id_restau, id_type) values (10, 7);


insert into role_personne (id_perso, roles_id_role) values (1, 1);
insert into role_personne (id_perso, roles_id_role) values (2, 1);
insert into role_personne (id_perso, roles_id_role) values (3, 1);
insert into role_personne (id_perso, roles_id_role) values (4, 1);
insert into role_personne (id_perso, roles_id_role) values (5, 2);
insert into role_personne (id_perso, roles_id_role) values (6, 2);
insert into role_personne (id_perso, roles_id_role) values (7, 2);
insert into role_personne (id_perso, roles_id_role) values (8, 2);
insert into role_personne (id_perso, roles_id_role) values (9, 2);
insert into role_personne (id_perso, roles_id_role) values (10, 2);
insert into role_personne (id_perso, roles_id_role) values (11, 2);
insert into role_personne (id_perso, roles_id_role) values (12, 2);
insert into role_personne (id_perso, roles_id_role) values (13, 2);
insert into role_personne (id_perso, roles_id_role) values (14, 2);
