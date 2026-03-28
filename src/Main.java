import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        // Fornecedores
        Fornecedor nestle = new Fornecedor("Nestlé S.A.", "CHE-105.798.471", "Suíça");
        Fornecedor samsung = new Fornecedor("Samsung", "124-81-00998", "Coreia do Sul");

        // Produto Alimenticio
        ProdutoAlimenticio kitkat = new ProdutoAlimenticio("KitKat", 123456789, 7.56, nestle, 30);

        // Produto Eletronico
        ProdutoEletronico s26Ultra = new ProdutoEletronico("S26 Ultra 1TB", 98765432, 15650, samsung, 24);

        // Carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras1 = new CarrinhoDeCompras();
        carrinhoDeCompras1.adicionarItem(s26Ultra);
        carrinhoDeCompras1.adicionarItem(kitkat);
        carrinhoDeCompras1.adicionarItem(kitkat);
        carrinhoDeCompras1.adicionarItem(kitkat);

        carrinhoDeCompras1.processarCompra();

    }
}
