package algoritm.turkane.example;

import org.example.model.Employee;
import org.example.repository.EmployeeRepository;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Employee employee=EmployeeRepository.readEmployeeById();
        System.out.println(employee);

//        EmployeeRepository.updateEmployeeById();
    }
}