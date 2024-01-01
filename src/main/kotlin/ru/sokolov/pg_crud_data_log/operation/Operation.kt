package ru.sokolov.pg_crud_data_log.operation

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "operation")
class Operation(
    @Id
    @Column(name = "id")
    val id: UUID,

    @Column(name = "system")
    val system: String,

    @Column(name = "module")
    val module: String,

    @Column(name = "chanel")
    val chanel: String
)
