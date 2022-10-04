--liquibase formatted sql
--changeset Jovan:inserting-users

INSERT INTO `user`(`username`, `password`) VALUES ('admin','admin')