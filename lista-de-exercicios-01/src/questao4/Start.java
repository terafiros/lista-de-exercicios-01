package questao4;

public class Start {
    public static void main(String[] args) {
        Employee secretario = EmployeeFactory.createEmployee("Anderson",Department.SECRETARY, 200, 7.8);
        Employee diretor = EmployeeFactory.createEmployee("Marcos", Department.DIRECTORSHIP, 150, 14.2);
        
        secretario.displayData();
        diretor.displayData();
        
        
    }
    
}
