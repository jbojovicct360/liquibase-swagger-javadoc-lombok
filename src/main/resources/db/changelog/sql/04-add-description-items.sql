--liquibase formatted sql
--changeset Jovan:add-description

ALTER TABLE item ADD description VARCHAR(200);

UPDATE item SET description = 'Phone description' WHERE title = 'Phone';