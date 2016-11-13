package questao3;

public class DisplayDataOfAccount {
    
    public static void displayDataOfAccount(Account account){
        if(account.getSaldo() >= 0)
            System.out.println(account+"\n---------" );    
        else
            System.out.println(account + "\nSaldo negativo"+"\n---------");    
        
    }
    
}
