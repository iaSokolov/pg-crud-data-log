package ru.sokolov.pg_crud_data_log.employee

import org.springframework.data.repository.CrudRepository
import java.util.*

interface EmployeeRepository : CrudRepository<Employee, UUID> {
}