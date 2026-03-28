public class ProdutoAlimenticio extends Produto {
    private int diasValidade;

    public ProdutoAlimenticio(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor, int diasValidade) {
        super(nome, codigoBarras, precoBase, fornecedor);  //pra chamar o construtor de produto
        this.diasValidade = diasValidade;
    }

    // chamar método calcularPrecoFinal
    @Override
    public double calcularPrecoFinal() {
        double precoFinal;

        precoFinal = precoBase*1.2;

        if (diasValidade <= 5) {
            precoFinal = precoFinal*0.7; // aplicado com a margem
        }

        return precoFinal;
    }
}
