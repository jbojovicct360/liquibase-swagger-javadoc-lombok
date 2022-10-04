--liquibase formatted sql
--changeset Jovan:create-tables splitStatements:true endDelimiter:;

CREATE TABLE user(
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(100),
    password VARCHAR(100)
);

CREATE TABLE item(
    id INT PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(100),
    price DOUBLE PRECISION
);