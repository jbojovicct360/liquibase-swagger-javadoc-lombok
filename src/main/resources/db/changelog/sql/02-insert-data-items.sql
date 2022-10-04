--liquibase formatted sql
--changeset Jovan:inserting-items

INSERT INTO `item`(`title`, `price`) VALUES ('Phone','199.99')