package ru.sokolov.pg_crud_data_log.employee

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/employee")
class EmployeeController(
    private val service: EmployeeService
) {
    @GetMapping("/all")
    fun getAll(): List<EmployeeDto> = service.getAll()
        .map { model ->
            EmployeeDto(
                id = model.id,
                name = model.name
            )
        }

    @PostMapping("/new")
    fun create(@RequestBody employeeCreateRequest: EmployeeCreateRequestDto): EmployeeDto {
        return service.create(employeeCreateRequest)
    }
}