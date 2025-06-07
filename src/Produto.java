public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public void adicionaProduto(int novoProduto){

        quantidade += novoProduto;

    }
    public void venderProduto(int vendaDePorduto){
        if (vendaDePorduto > quantidade){
            System.out.println("Estoque insuficiente! Estoque atual: " + quantidade);
        }else {
            quantidade -= vendaDePorduto;
            System.out.println(vendaDePorduto + " unidades vendidas . Estoque restante: " + quantidade);

        }

    }


}
