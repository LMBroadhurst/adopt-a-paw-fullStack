INSERT INTO animal_types (species) VALUES ('Dog');
INSERT INTO animal_types (species) VALUES ('Cat');
INSERT INTO animal_types (species) VALUES ('Snake');
INSERT INTO animal_types (species) VALUES ('Rabbit');
INSERT INTO animal_types (species) VALUES ('Guinea-Pig');

INSERT INTO application_types (application_status) VALUES('PENDING');
INSERT INTO application_types (application_status) VALUES('ACCEPTED');
INSERT INTO application_types (application_status) VALUES('REJECTED');

INSERT INTO customers (age,first_name,last_name,location) VALUES (23,'Cem','Gurhan','London');

INSERT INTO customer_preferences_mapper (species_id,customer_id) VALUES (1,1);
INSERT INTO customer_preferences_mapper (species_id,customer_id) VALUES (2,1);

INSERT INTO animals (species_id) VALUES (1);

INSERT INTO applications (application_type_id,animal_id,customer_id) VALUES (1,1,1);


--INSERT INTO sex VALUES ('Male')
--INSERT INTO sex VALUES ('Female')
--INSERT INTO sex VALUES ('Unknown')
