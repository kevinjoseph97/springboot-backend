DROP schema if exists employee_maintenance_mock;


CREATE schema employee_maintenance_mock;


USE employee_maintenance_mock;

CREATE TABLE employee (
employee_id INT AUTO_INCREMENT,
first_name VARCHAR(20) not null,
last_name VARCHAR(20) not null,
joining_date DATE,
email_address VARCHAR(50) NOT NULL,
phone_number VARCHAR(10) NOT NULL,
designation_id INT,
city_id INT,
picture BLOB,
CONSTRAINT e_employee_id_pk PRIMARY KEY (employee_id)
);



CREATE TABLE designation (
designation_id INT AUTO_INCREMENT,
designation_name VARCHAR(50),
CONSTRAINT d_designation_id_pk PRIMARY KEY (designation_id)
);


CREATE TABLE city (
city_id INT AUTO_INCREMENT,
location_city VARCHAR (30),
CONSTRAINT c_city_id_pk PRIMARY KEY (city_id)
);

ALTER TABLE employee ADD CONSTRAINT e_designation_id_fk FOREIGN KEY (designation_id) REFERENCES designation (designation_id);
ALTER TABLE employee ADD CONSTRAINT e_city_id_fk FOREIGN KEY (city_id) REFERENCES city (city_id);



INSERT INTO designation(designation_id, designation_name) VALUES(1, 'Associate' );
INSERT INTO designation(designation_id, designation_name) VALUES(2, 'Team Lead' );
INSERT INTO designation(designation_id, designation_name) VALUES(3, 'project manager' );
INSERT INTO designation(designation_id, designation_name) VALUES(4, 'Senior Project Manager' );
INSERT INTO designation(designation_id, designation_name) VALUES(5, 'Delivery Manager' );
INSERT INTO designation(designation_id, designation_name) VALUES(6, 'Senior Delivery Manager' );
INSERT INTO designation(designation_id, designation_name) VALUES(7, 'Regional Head' );
INSERT INTO designation(designation_id, designation_name) VALUES(8, 'Operations and Global Head' );

INSERT INTO city(city_id, location_city) VALUES(1, 'Phoenix, Arizona' );
INSERT INTO city(city_id, location_city) VALUES(2, 'Hartford, Connecticut' );
INSERT INTO city(city_id, location_city) VALUES(3, 'Indianapolis, Indiana' );
INSERT INTO city(city_id, location_city) VALUES(4, 'Raleigh, North Carolina' );
INSERT INTO city(city_id, location_city) VALUES(5, 'Providence, Rhode Island' );
INSERT INTO city(city_id, location_city) VALUES(6, 'Richardson, Texas' );

INSERT INTO employee(employee_id, first_name, last_name, joining_date, email_address,
phone_number, designation_id, city_id, picture) VALUES(1,
'Hab', 'Teg', '2021-09-27', 'habteg@email.com', '1234567890', 1, 4, '');




commit;

