package questao4;

public class Employee {
    private String name;
    private Department department;
    private double hoursWorkedInTheMonth;
    private double hourlyWage;
    private double monthlySalary;
    
    public Employee(String name, Department department, double hoursWorkedInTheMonth,double hourlyWage){
        this.name = name;
        this.department = department;
        this.hoursWorkedInTheMonth = hoursWorkedInTheMonth;
        this.hourlyWage = hourlyWage;
        this.monthlySalary = monthlySalary();
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getMonthySalary() {
        return monthlySalary;
    }

    public void setMonthySalary(double monthySalary) {
        this.monthlySalary = monthySalary;
    }

    public double getHoursWorkedInTheMonth() {
        return hoursWorkedInTheMonth;
    }

    public void setHoursWorkedInTheMonth(double hoursWorkedInTheMonth) {
        this.hoursWorkedInTheMonth = hoursWorkedInTheMonth;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    
    public void displayData(){
        System.out.println("Nome: " + this.name);
        System.out.println("Departamento: " + this.department);
        System.out.println("Horas trabalhas no mes: " + this.hoursWorkedInTheMonth);
        System.out.println("Salario por hora: " + this.hourlyWage);
        System.out.println("Salario mensal: " + this.monthlySalary);
    }
    
    public double monthlySalary(){
        if(boardMember())
            return monthlySalaryPlusTenPorcent();
        else
            return this.getHourlyWage() * this.getHoursWorkedInTheMonth();
    }

    private boolean boardMember() {
        return this.getDepartment().DIRECTORSHIP == Department.DIRECTORSHIP;
    }

    private double monthlySalaryPlusTenPorcent() {
        return this.getHourlyWage() * this.getHoursWorkedInTheMonth() + (this.getHourlyWage() * this.getHoursWorkedInTheMonth())/10;
    }
}