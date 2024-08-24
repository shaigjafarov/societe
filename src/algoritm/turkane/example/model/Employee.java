package algoritm.turkane.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Data
@NoArgsConstructor
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Date birthDate;
    private BigDecimal salary;
    private Timestamp createdAt;
    private Timestamp updatedAt;



}
