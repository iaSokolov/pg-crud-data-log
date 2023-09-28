package ru.sokolov.pg_crud_data_log.operation

import org.springframework.data.repository.CrudRepository
import java.util.*

interface OperationRepository: CrudRepository<Operation, UUID> {

}