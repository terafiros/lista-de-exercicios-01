package questao9;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Entre com os numeros");
        double d1 = s.nextDouble();
        double d2 = s.nextDouble();
               
        System.out.printf("Soma Entre %.1f e %.1f é %.1f \n", d1, d2, Calculator.sum(d1, d2));
        System.out.printf("Subtração Entre %.1f e %.1f é %.1f \n", d1, d2, Calculator.subtraction(d1, d2));
        System.out.printf("Multiplicação Entre %.1f e %.1f é %.1f \n", d1, d2, Calculator.multiply(d1, d2));
        System.out.printf("Divisão Entre %.1f e %.1f é %.1f \n", d1, d2, Calculator.division(d1, d2));
        System.out.printf("%.1f elevado a %.1f é %.1f \n", d1, d2, Calculator.pow(d1, d2));
        System.out.printf("O resto da divisão entre %.1f e %.1f é %.1f \n", d1, d2, Calculator.mod(d1, d2));
        
    }
}