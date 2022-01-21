
insert into personne (nom, prenom, email, password) values ('Harmond', 'Ludvig', 'lharmond0@moonfruit.com', 'pjKxIN');
insert into personne (nom, prenom, email, password) values ('Fisbey', 'Jammal', 'jfisbey1@apache.org', 'YY0TuY6JH0di');
insert into personne (nom, prenom, email, password) values ('Scrivener', 'Anatol', 'ascrivener2@jugem.jp', 'C4sfAW4');
insert into personne (nom, prenom, email, password) values ('Berthelet', 'Oralla', 'oberthelet3@cnbc.com', 'ACdXxMr');
insert into personne (nom, prenom, email, password) values ('Towe', 'Homerus', 'htowe4@home.pl', 'pQGi41q5JHY');
insert into personne (nom, prenom, email, password) values ('Viggers', 'Gaby', 'gviggers5@xing.com', 'Gbr2M5UU');
insert into personne (nom, prenom, email, password) values ('Willshere', 'Sheba', 'swillshere6@tinyurl.com', 'yVJmjda');
insert into personne (nom, prenom, email, password) values ('Docksey', 'Eula', 'edocksey7@mozilla.com', '6yS7lkFpuY');
insert into personne (nom, prenom, email, password) values ('Iglesias', 'Christen', 'ciglesias8@ebay.com', 'ottn7Qb');
insert into personne (nom, prenom, email, password) values ('Crick', 'Andris', 'acrick9@etsy.com', 'nkmUVBeKr');

insert into role (id_role, intitule) values (1, 'Admin');
insert into role (id_role, intitule) values (2, 'User');

insert into restaurant (nom, adresse, telephone, a_emporter, sur_place, prix, accespmr, latitude, longitude) values ('L Perrigo Company', '301 Thierer Trail', '3092096786', false, true, 1, false, '2.1961772', '22.4708685');
insert into restaurant (nom, adresse, telephone, a_emporter, sur_place, prix, accespmr, latitude, longitude) values ('Sanofi Pasteur Inc.', '9 Barnett Terrace', '6809964349', false, true, 2, false, '31.45571', '34.43719');
insert into restaurant (nom, adresse, telephone, a_emporter, sur_place, prix, accespmr, latitude, longitude) values ('REMEDYREPACK INC.', '3 West Park', '4565542193', true, false, 3, true, '49.817777', '19.785536');
insert into restaurant (nom, adresse, telephone, a_emporter, sur_place, prix, accespmr, latitude, longitude) values ('Physicians Total Care, Inc.', '462 Mosinee Lane', '8521719889', false, false, 4, true, '-13.5', '48.86667');
insert into restaurant (nom, adresse, telephone, a_emporter, sur_place, prix, accespmr, latitude, longitude) values ('Triweld Industries, Inc.', '2482 Corscot Way', '7513208452', false, true, 2, true, '34.326903', '108.117456');

insert into preference (id_restau, id_personne, note, favori) values (2, 9, 1, false);
insert into preference (id_restau, id_personne, note, favori) values (3, 1, 5, false);
insert into preference (id_restau, id_personne, note, favori) values (1, 9, 3, true);
insert into preference (id_restau, id_personne, note, favori) values (4, 6, 2, false);
insert into preference (id_restau, id_personne, note, favori) values (5, 5, 5, false);
insert into preference (id_restau, id_personne, note, favori) values (1, 10, 1, false);
insert into preference (id_restau, id_personne, note, favori) values (5, 3, 5, false);
insert into preference (id_restau, id_personne, note, favori) values (1, 7, 1, true);
insert into preference (id_restau, id_personne, note, favori) values (4, 2, 1, false);
insert into preference (id_restau, id_personne, note, favori) values (1, 3, 5, false);
insert into preference (id_restau, id_personne, note, favori) values (3, 10, 4, false);
insert into preference (id_restau, id_personne, note, favori) values (3, 3, 4, true);
insert into preference (id_restau, id_personne, note, favori) values (2, 3, 3, false);
insert into preference (id_restau, id_personne, note, favori) values (2, 8, 3, false);

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


insert into type_restau (id_restau, id_type) values (1, 3);
insert into type_restau (id_restau, id_type) values (2, 1);
insert into type_restau (id_restau, id_type) values (3, 1);
insert into type_restau (id_restau, id_type) values (4, 2);
insert into type_restau (id_restau, id_type) values (5, 4);
insert into type_restau (id_restau, id_type) values (1, 2);