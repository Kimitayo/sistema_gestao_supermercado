import java.util.ArrayList;

public class CarrinhoDeCompras {
    private ArrayList<Produto> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>(); // carrinho já criado, mas vazio
    }

     public void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    public void processarCompra(){
        double valorTotal = 0;
        for (Produto p : itens) {
            valorTotal += p.calcularPrecoFinal();
        }
        System.out.printf("Valor Total da compra: %.2f%n", valorTotal);
    }
}
