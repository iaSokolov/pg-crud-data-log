--liquibase formatted sql
--changeset techgeeknext:create-tables

CREATE TABLE IF NOT EXISTS employee
(
    id   INT PRIMARY KEY,
    name VARCHAR(40)
);

CREATE TABLE IF NOT EXISTS branch
(
    id     INT PRIMARY KEY,
    name   VARCHAR(40),
    emp_id INT,
    FOREIGN KEY (emp_id) REFERENCES employee (id) ON DELETE CASCADE
);