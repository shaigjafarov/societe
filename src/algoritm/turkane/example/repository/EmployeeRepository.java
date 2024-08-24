package algoritm.turkane.example.repository;

import org.example.config.Connections;
import org.example.model.Employee;

import java.sql.*;
import java.util.Scanner;


public class EmployeeRepository {
    public static void updateEmployeeById() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        Connection connection = Connections.getConnection();
        CallableStatement callableStatement = connection.prepareCall("call insert_employee(?,?,?,?,?,?)");
        callableStatement.setString(1, scanner.next());
        callableStatement.setString(2, scanner.next());
        callableStatement.setString(3, scanner.next());
        callableStatement.setString(4, scanner.next());
        callableStatement.setDate(5, Date.valueOf(scanner.next()));
        callableStatement.setBigDecimal(6, scanner.nextBigDecimal());
        callableStatement.execute();
        System.err.println("Ugurla elave olundu!!!");
    }

    public static Employee readEmployeeById() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int id= scanner.nextInt();
        Connection connection = Connections.getConnection();
//        CallableStatement callableStatement= connection.prepareCall("select * from get_employee_by_idf(?)");
        PreparedStatement preparedStatement= connection.prepareStatement("select * from get_employee_by_idf(?)");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Employee employee=new Employee();
        while(resultSet.next()){
            employee.setId(resultSet.getInt("id"));
            employee.setFirstName(resultSet.getString("first_name"));
            employee.setLastName(resultSet.getString("last_name"));
            employee.setEmail(resultSet.getString("email"));
            employee.setPhoneNumber(resultSet.getString("phone_number"));
            employee.setBirthDate(resultSet.getDate("birth_date"));
            employee.setSalary(resultSet.getBigDecimal("salary"));
            employee.setCreatedAt(resultSet.getTimestamp("created_at"));
            employee.setUpdatedAt(resultSet.getTimestamp("updated_at"));
        }
        return employee;
    }
}
