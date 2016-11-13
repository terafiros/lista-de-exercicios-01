package questao3;

public class Account {
    private String proprietario;
    private double saldo;

    public Account(String proprietario, double saldo) {
      this.proprietario = proprietario;
      
      if(saldo < 0)
        this.saldo = 0;
      else
        this.saldo = saldo;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    @Override
    public String toString(){
        return String.format("Proprietario %s \nSaldo %f",this.proprietario, this.saldo);
    }
    
}
