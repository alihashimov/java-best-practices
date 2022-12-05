--SQL Structured Query Language
--RDBMS -->1.Relation ,2.Structure
--DDL -->Data Definition Language -->structure
--DML ->Data Manipulation Language-->process

--(CRUD) --> Create , Retrieve (read) ,Update ,Delete(DROP)

-------------DDL-----------------

--create db
CREATE DATABASE testDB;

--read db
SHOW DATABASES; -->MySQL
SELECT datname FROM pg_database; -->Postgres

--delete db
drop database testDB;

--create table
CREATE TABLE people
(
    person_id  int,
    last_name  varchar(255),
    first_name varchar(255),
    address   varchar(255),
    city      varchar(255)
);
--delete(drop) table
drop table people;
--truncate table
truncate table people;

alter table people add age int;

--alter table people drop address;
alter table people add address varchar;

ALTER TABLE people
ALTER COLUMN person_id TYPE bigint;
alter table people drop age;

alter table people add date_of_birth date;
alter table people drop date_of_birth;
alter table people add date_of_birth timestamp;

select * from people;


