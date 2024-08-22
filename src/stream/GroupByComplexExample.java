package stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByComplexExample {
    public static void main(String[] args) {
        // Örnek veri kümesi: bir grup çalışan
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "IT", 25),
                new Employee("Bob", "HR", 35),
                new Employee("Charlie", "IT", 30),
                new Employee("David", "Finance", 45),
                new Employee("Eve", "HR", 28),
                new Employee("Frank", "IT", 29),
                new Employee("Grace", "Finance", 31)
        );

        // Çalışanları departmana ve yaş grubuna göre gruplandırma
        Map<String, Map<String, List<Employee>>> groupedByDeptAndAge = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.groupingBy(emp -> emp.getAge() < 30 ? "Under 30" : "30 and Above")));





        // Sonuçları ekrana yazdırma
        groupedByDeptAndAge.forEach((department, ageGroup) -> {
            System.out.println("Department: " + department);
            ageGroup.forEach((ageRange, empList) -> {
                System.out.println("  Age Group: " + ageRange);
                empList.forEach(emp -> System.out.println("    " + emp));
            });
        });
    }
}