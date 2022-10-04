--liquibase formatted sql
--changeset Jovan:add-email

ALTER TABLE user ADD email VARCHAR(100);

UPDATE user SET email = 'admin@admin.com' WHERE username = 'admin';