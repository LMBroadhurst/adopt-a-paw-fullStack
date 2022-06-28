INSERT INTO animal_types (species) VALUES ('Dog');
INSERT INTO animal_types (species) VALUES ('Cat');
INSERT INTO animal_types (species) VALUES ('Snake');
INSERT INTO animal_types (species) VALUES ('Rabbit');
INSERT INTO animal_types (species) VALUES ('Guinea-Pig');

INSERT INTO application_types (application_status) VALUES('PENDING');
INSERT INTO application_types (application_status) VALUES('ACCEPTED');
INSERT INTO application_types (application_status) VALUES('REJECTED');

--INSERT INTO sex VALUES ('Male')
--INSERT INTO sex VALUES ('Female')
--INSERT INTO sex VALUES ('Unknown')

INSERT INTO customers (age,first_name,last_name,location, previous_adoptions) VALUES (23,'Cem','Gurhan','London', True);
INSERT INTO customers (age,first_name,last_name,location, previous_adoptions) VALUES (26,'Kieran','Sandford','Manchester', True);
INSERT INTO customers (age,first_name,last_name,location, previous_adoptions) VALUES (24,'Edward','Todd','St Albans', False);
INSERT INTO customers (age,first_name,last_name,location, previous_adoptions) VALUES (25,'Becca','Bartholomew','London', False);
INSERT INTO customers (age,first_name,last_name,location, previous_adoptions) VALUES (27,'Lewis','Broadhurst','Birmingham', True);

INSERT INTO customer_preferences_mapper (species_id,customer_id) VALUES (1,1);
INSERT INTO customer_preferences_mapper (species_id,customer_id) VALUES (2,1);
INSERT INTO customer_preferences_mapper (species_id,customer_id) VALUES (2,2);
INSERT INTO customer_preferences_mapper (species_id,customer_id) VALUES (1,3);
INSERT INTO customer_preferences_mapper (species_id,customer_id) VALUES (2,3);
INSERT INTO customer_preferences_mapper (species_id,customer_id) VALUES (3,3);
INSERT INTO customer_preferences_mapper (species_id,customer_id) VALUES (1,3);
INSERT INTO customer_preferences_mapper (species_id,customer_id) VALUES (5,4);
INSERT INTO customer_preferences_mapper (species_id,customer_id) VALUES (4,4);
INSERT INTO customer_preferences_mapper (species_id,customer_id) VALUES (3,5);

INSERT INTO organisations (name) VALUES ('RSPCA');
INSERT INTO organisations (name) VALUES ('Four Paws');
INSERT INTO organisations (name) VALUES ('Dogs Trust');
INSERT INTO organisations (name) VALUES ('Blue Cross');
INSERT INTO organisations (name) VALUES ('Pets at Home');
INSERT INTO organisations (name) VALUES ('Freshfields');

INSERT INTO animals (name, breed, age, gender, location, reserved, adopted, organisation_id, species_id) VALUES('Daisy', 'Domestic Shorthair', 1, 'Female', 'Southport', True, True, 1, 2);
INSERT INTO animals (name, breed, age, gender, location, reserved, adopted, organisation_id, species_id) VALUES('Kallie', 'American Bulldog', 2, 'Female', 'Manchester', False, False, 3, 1);
INSERT INTO animals (name, breed, age, gender, location, reserved, adopted, organisation_id, species_id) VALUES('Xander', 'Domestic Shorthair', 3, 'Male', 'Hull', True, False, 1, 2);
INSERT INTO animals (name, breed, age, gender, location, reserved, adopted, organisation_id, species_id) VALUES('Elody', 'Persian', 1, 'Female', 'York', True, True, 2, 2);
INSERT INTO animals (name, breed, age, gender, location, reserved, adopted, organisation_id, species_id) VALUES('Kenan', 'Maine Coon', 2, 'Male', 'Bath', False, False, 1, 2);
INSERT INTO animals (name, breed, age, gender, location, reserved, adopted, organisation_id, species_id) VALUES('Tango', 'Scottish Fold', 2, 'Male', 'Glasgow', True, True, 2, 2);
INSERT INTO animals (name, breed, age, gender, location, reserved, adopted, organisation_id, species_id) VALUES('Max', 'Staffordshire Bull Terrier', 5, 'Male', 'Essex', True, False, 3, 1);
INSERT INTO animals (name, breed, age, gender, location, reserved, adopted, organisation_id, species_id) VALUES('Hex', 'Boa Constrictors', 4, 'Male', 'Bristol', False, False, 5, 3);
INSERT INTO animals (name, breed, age, gender, location, reserved, adopted, organisation_id, species_id) VALUES('Penny', 'Python', 7, 'Female', 'Southport', False, False, 5, 3);
INSERT INTO animals (name, breed, age, gender, location, reserved, adopted, organisation_id, species_id) VALUES('Ben', 'Belgian Hare', 3, 'Male', 'Newcastle', False, False, 4, 4);
INSERT INTO animals (name, breed, age, gender, location, reserved, adopted, organisation_id, species_id) VALUES('Hopster', 'Cashmere Lop', 4, 'Male', 'Aberdeen', True, False, 4, 4);
INSERT INTO animals (name, breed, age, gender, location, reserved, adopted, organisation_id, species_id) VALUES('Melody', 'Czech Red', 2, 'Female', 'Nottingham', False, False, 5, 4);
INSERT INTO animals (name, breed, age, gender, location, reserved, adopted, organisation_id, species_id) VALUES('Rory', 'Peruvian', 1, 'Male', 'Derby', True, False, 1, 5);
INSERT INTO animals (name, breed, age, gender, location, reserved, adopted, organisation_id, species_id) VALUES('Randy', 'Peruvian', 1, 'Male', 'Derby', True, False, 1, 5);
INSERT INTO animals (name, breed, age, gender, location, reserved, adopted, organisation_id, species_id) VALUES('Molly', 'English Crested', 3, 'Female', 'Cornwall', True, False, 6, 5);

INSERT INTO applications (application_type_id, animal_id, customer_id) VALUES (1,11,4);
INSERT INTO applications (application_type_id, animal_id, customer_id) VALUES (1,13,5);
INSERT INTO applications (application_type_id, animal_id, customer_id) VALUES (1,14,1);
INSERT INTO applications (application_type_id, animal_id, customer_id) VALUES (2,4,3);
INSERT INTO applications (application_type_id, animal_id, customer_id) VALUES (2,6,4);
INSERT INTO applications (application_type_id, animal_id, customer_id) VALUES (2,1,2);
INSERT INTO applications (application_type_id, animal_id, customer_id) VALUES (3,1,4);
INSERT INTO applications (application_type_id, animal_id, customer_id) VALUES (3,1,5);


