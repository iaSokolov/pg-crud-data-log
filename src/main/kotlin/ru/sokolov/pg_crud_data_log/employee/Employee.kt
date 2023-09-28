package ru.sokolov.pg_crud_data_log.employee

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table
import java.util.*

@Entity
@Table(name = "employee")
data class Employee(
    @Id
    val id: UUID,

    val opId: UUID,

    val name: String
)
