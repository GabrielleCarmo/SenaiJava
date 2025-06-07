public class Titulo {
    public String nome;
    public double saldo;
    public double taxa;
    public int prazo;
    public int mesesRestantes;

    public void comprarTitulo(int prazo){
        this.prazo = prazo;
        this.mesesRestantes = prazo;

        if (prazo >= 0 && prazo < 12){
            taxa = 0.005;

        }else  if (prazo >= 12 && prazo < 24){
            taxa = 0.010;

        }else if (prazo >= 24 && prazo < 36){
            taxa = 0.015;

        }else if (prazo >= 36 && prazo < 48){
            taxa = 0.020;

        }else if (prazo >= 48 && prazo <= 60){
            taxa = 0.025;
        }else {
            System.out.println("Prazo invalido");
            prazo = 0;
            taxa = 0.0;



    }
}

public  void  simularJuros() {
    while (mesesRestantes > 0) {
        saldo += saldo * taxa / 12;
        mesesRestantes--;
        System.out.println("Saldo: $" + saldo + " Meses restantes: " + mesesRestantes);

    }
    System.out.println("Título vencido!");
    }
}

