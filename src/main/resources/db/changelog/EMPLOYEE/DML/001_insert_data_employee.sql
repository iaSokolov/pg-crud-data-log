--liquibase formatted sql
--changeset techgeeknext:inset-employee-01
INSERT INTO main.employee VALUES(01, 'User1');
INSERT INTO main.employee VALUES(02, 'User2');
INSERT INTO main.employee VALUES(03, 'User3');
INSERT INTO main.employee VALUES(04, 'User4');