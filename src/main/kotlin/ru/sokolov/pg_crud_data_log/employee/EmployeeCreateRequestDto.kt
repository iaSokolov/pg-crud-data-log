package ru.sokolov.pg_crud_data_log.employee

import com.fasterxml.jackson.annotation.JsonProperty
import ru.sokolov.pg_crud_data_log.operation.OperationDto

data class EmployeeCreateRequestDto(
    @JsonProperty("employee")
    val employee: EmployeeDto,

    @JsonProperty("operation")
    val operation: OperationDto
)
