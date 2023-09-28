--liquibase formatted sql
--changeset techgeeknext:create-tables
CREATE TABLE IF NOT EXISTS operation
(
    id     uuid primary key,
    system text,
    module text,
    chanel text
);