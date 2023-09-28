package ru.sokolov.pg_crud_data_log.operation

import java.util.UUID

data class OperationDto(
    val id: UUID,
    val system: String,
    val module: String,
    val chanel: String
)