/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao3;

/**
 *
 * @author Jean
 */
public class AccountFactory {
    
    public static Account openAccount(String proprietario, double saldo ){
        return new Account(proprietario, saldo);
    }
    
}
