package ru.sokolov.pg_crud_data_log.operation

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "operation")
data class Operation(
    @Id
    val id: UUID,

    val system: String,

    val module: String,

    val chanel: String
)
