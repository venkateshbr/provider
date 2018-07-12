CREATE TABLE provider(
	id INT AUTO_INCREMENT,
	name VARCHAR(255),
	type VARCHAR(10),
	address VARCHAR(2000),
	city VARCHAR(255),
	state VARCHAR(100),
	country VARCHAR(100),
	registered_date DATE
);

insert into provider values (1,'Venkatesh','F2','MBP','Bangalore','Karnataka','India',null);