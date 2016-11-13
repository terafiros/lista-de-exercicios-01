package questao3;

import static questao3.DisplayDataOfAccount.displayDataOfAccount;

public class Start {
    
    public static void main(String[] args) {
      Account eduardo =  AccountFactory.openAccount("Eduardo", 0);
      Account alberto =  AccountFactory.openAccount("Alberto", 11110);
      Account gilmar = AccountFactory.openAccount("Gilmar", -1000);
      
      displayDataOfAccount(alberto);
      displayDataOfAccount(eduardo);
      displayDataOfAccount(gilmar);
            
      eduardo.setSaldo(-333);
      displayDataOfAccount(eduardo);
      
      
      
      
    }
}
