package ru.sokolov.pg_crud_data_log.employee

import com.fasterxml.jackson.annotation.JsonProperty
import java.util.*

data class EmployeeDto(
    @JsonProperty("id")
    val id: UUID?,

    @JsonProperty("name")
    val name: String
)