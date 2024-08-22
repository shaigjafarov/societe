package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectTestDb {


    public static void main(String[] args) {
        var url = "jdbc:postgresql://localhost:5432/postgres";
        var user = "postgres";
        var password = "mysecretpassword";

        try (var conn = DriverManager.getConnection(url, user, password);
             var statement = conn.createStatement();
             var resultSet = statement.executeQuery("select contact_name from company.employers")
        ) {
            while (resultSet.next()){
                var contactName = resultSet.getString("contact_name");
                System.out.println(contactName);
            }








        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}