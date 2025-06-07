public class ContaBancaria {

    public String name;
    public double balance;
    public double interestRate;

    public ContaBancaria(String name, double balance, double interestRate) {


        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposito (double valorDeposito){
       balance += valorDeposito;

    }
     public void saqueBancario(double valorSaque){
        if (valorSaque > balance){
            System.out.println("Saldo insuficiente!");

            }
            else {
                balance -= valorSaque;
            }
        }

     }


