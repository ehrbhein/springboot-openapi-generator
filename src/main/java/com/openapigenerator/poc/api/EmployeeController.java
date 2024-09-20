package com.openapigenerator.poc.api;

import com.openapigenerator.poc.model.Employee;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController implements EmployeeApi {

  @Override
  public ResponseEntity<List<Employee>> getEmployees() {

    Employee employee = new Employee();
    employee.setId(1L);
    employee.setName("John Doe");
    employee .setAge(22);

    return ResponseEntity.ok(List.of(employee));
  }
}
