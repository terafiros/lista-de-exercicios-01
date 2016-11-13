package questao7;

public class Operacoes {
    int a, b;
    
    void alteraValores(int n1, int n2){
        a = n1;
        b = n2;
    }
    
    int operacao1(){
        return 2*a + 2*b;
    }
    
    int operacao2(){
        return a * b;
    }
    
    public static void main(String[] args) {
        Operacoes op = new Operacoes();
        op.alteraValores(10, 20);
        System.out.println(op.operacao1());
        System.out.println(op.operacao2());
        
    }
    
}
