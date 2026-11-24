
-- in this file we write commands for mysql , this file is same  like sql workbench
-- this file is directly link to sql workbench 

show tables; -- to run this command go in mysql> write source schema.sql

-- ** create table user

create table user (
    id varchar(50) primary key,
    username varchar(50) unique,
    email varchar(50) unique not null,
    password varchar(50) not null
);