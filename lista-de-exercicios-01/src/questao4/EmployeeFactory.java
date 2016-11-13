
package questao4;

public class EmployeeFactory {

    public static Employee createEmployee(String name, Department department, double hoursWorkedInTheMonth, double hourlyWage) {
        return new Employee(name, department, hoursWorkedInTheMonth, hourlyWage );
    }
    
}
