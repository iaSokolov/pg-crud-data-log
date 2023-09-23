--liquibase formatted sql
--changeset techgeeknext:create-tables
CREATE TABLE IF NOT EXISTS employee
(
    id        uuid primary key,
    operation uuid,
    name      VARCHAR(40)
);

CREATE TABLE IF NOT EXISTS branch
(
    id        uuid primary key,
    operation uuid,
    name      VARCHAR(40),
    emp_id    uuid,
    FOREIGN KEY (emp_id)
        REFERENCES employee (id)
        ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS public_employee_log PARTITION OF public_record_log
    FOR VALUES IN ('employee');

CREATE TRIGGER log_insert_public_employee
    AFTER INSERT
    ON employee
    REFERENCING NEW TABLE AS new_table
    FOR EACH STATEMENT
EXECUTE PROCEDURE log_insert();

CREATE TRIGGER log_update_public_employee
    AFTER UPDATE
    ON employee
    REFERENCING OLD TABLE AS old_table NEW TABLE AS new_table
    FOR EACH STATEMENT
EXECUTE PROCEDURE log_update();

CREATE TRIGGER log_delete_public_employee
    AFTER DELETE
    ON employee
    REFERENCING OLD TABLE AS old_table
    FOR EACH STATEMENT
EXECUTE PROCEDURE log_delete();