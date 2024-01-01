package ru.sokolov.pg_crud_data_log.employee

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "employee")
class Employee(
    @Id
    @Column(name = "id")
    val id: UUID,

    @Column(name = "op_id")
    val opId: UUID,

    @Column(name = "name")
    val name: String
)