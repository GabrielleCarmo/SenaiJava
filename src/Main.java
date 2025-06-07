//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.nome = "Placa mãe";
        produto.quantidade = 37;
        produto.preco = 780.99;


        produto.adicionaProduto(10);
        produto.venderProduto(37);
        produto.venderProduto(57);

        System.out.println();

        Estudante estudante1 = new Estudante();

        estudante1.nome = "Gabrielle";
        estudante1.nota1 = 8.5;
        estudante1.nota2 = 9.0;

        Estudante estudante2 = new Estudante();
        estudante2.nome = "Renata";
        estudante2.nota1 = 7.0;
        estudante2.nota2 = 6.5;

        System.out.println(estudante1.nome + "Tem média: " + estudante1.calcularMedia());
        System.out.println(estudante2.nome + " Tem média: " + estudante2.calcularMedia());

        System.out.println();

        Titulo titulo = new Titulo();
        titulo.nome = "Tesouro Selic";
        titulo.saldo = 2000.00;


        titulo.comprarTitulo(24);
        titulo.simularJuros();


    }
}