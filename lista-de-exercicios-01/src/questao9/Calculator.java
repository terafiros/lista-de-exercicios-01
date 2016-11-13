package questao9;

public class Calculator {
    
    public static double sum(double n1, double n2){
        return n1+n2;
    }
    
    public static double subtraction(double n1, double n2){
        return n1-n2;
    }
    
    public static double multiply(double n1, double n2){
        return n1*n2;
    }
    
    public static double division(double n1, double n2)throws ArithmeticException{
        return n1/n2;
    }
    public static double pow(double n1, double n2){
        return Math.pow(n1, n2);
    }
    public static double mod(double n1, double n2){
        return n1 % n2;
    }
    
}
