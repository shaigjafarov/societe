package algoritm.turkane.cacheRepo;

import lombok.SneakyThrows;
import org.example.config.Connections;
import org.example.model.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;

public class EmployeeRepository {
    public static Employee cachedEmployer = null;
    public static LocalDateTime localDateTime = null;

    @SneakyThrows
    public static Employee getMaxSalaryEmployee() {
        Connection connection = Connections.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM employee WHERE salary = (SELECT MAX(salary) FROM employee)");
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            LocalDateTime currentTime = LocalDateTime.now();
            if (cachedEmployer != null && localDateTime != null &&   localDateTime.plusMinutes(5).isAfter(currentTime)
            ) {
                return cachedEmployer;
            }
            Employee employee = new Employee();
            employee.setId(resultSet.getInt("id"));
            employee.setFirstName(resultSet.getString("first_name"));
            employee.setLastName(resultSet.getString("last_name"));
            employee.setEmail(resultSet.getString("email"));
            employee.setPhoneNumber(resultSet.getString("phone_number"));
            employee.setBirthDate(resultSet.getDate("birth_date"));
            employee.setSalary(resultSet.getBigDecimal("salary"));
            employee.setCreatedAt(resultSet.getTimestamp("created_at"));
            employee.setUpdatedAt(resultSet.getTimestamp("updated_at"));
            cachedEmployer = employee;
            localDateTime = currentTime;
            return employee;

        }
        return null;

    }
}
