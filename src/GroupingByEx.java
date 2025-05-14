import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByEx {
    public static void main(String[] args) {
        List<Employee> le = Arrays.asList(
                new Employee(1,"Abraham", "SE"),
                new Employee(2,"Babel", "SSE"),
                new Employee(3,"Daniel", "HR"),
                new Employee(4,"Bilal", "PM"),
                new Employee(5,"Catherine", "HR"),
                new Employee(6,"Paul", "ST"),
                new Employee(7,"Krishtina", "SE"));

        //le.forEach(employee -> System.out.println(employee.getId()+" <-> "+employee.getName()+" <-> "+employee.getDepartment()));

        Map<String,List<Employee>> empByDept = le.stream().collect(Collectors.groupingBy(employee -> employee.getDepartment()));

        empByDept.forEach((dept,empList) -> {
            System.out.println(dept);
            empList.forEach(emp -> {
                System.out.printf(" - [%d] %s%n", emp.getId(), emp.getName());
            });
        });

        

    }

}
