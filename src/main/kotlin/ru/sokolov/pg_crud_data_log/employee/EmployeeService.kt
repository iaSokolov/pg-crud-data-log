package ru.sokolov.pg_crud_data_log.employee

import jakarta.transaction.Transactional
import org.springframework.stereotype.Service
import ru.sokolov.pg_crud_data_log.operation.Operation
import ru.sokolov.pg_crud_data_log.operation.OperationRepository
import java.util.*

@Service
class EmployeeService(
    private val employeeRepository: EmployeeRepository,
    private val operationRepository: OperationRepository
) {
    fun getAll(): List<Employee> {
        return employeeRepository
            .findAll()
            .toMutableList()
    }

    @Transactional
    fun create(employeeCreateRequest: EmployeeCreateRequestDto): EmployeeDto {
        val newOperation = operationRepository.save(
            Operation(
                id = employeeCreateRequest.operation.id,
                system = employeeCreateRequest.operation.system,
                module = employeeCreateRequest.operation.module,
                chanel = employeeCreateRequest.operation.chanel
            )
        )

        val newEmploye = employeeRepository.save(
            Employee(
                id = UUID.randomUUID(),
                name = employeeCreateRequest.employee.name,
                opId = newOperation.id
            )
        )

        return EmployeeDto(
            id = newEmploye.id,
            name = newEmploye.name
        )
    }
}