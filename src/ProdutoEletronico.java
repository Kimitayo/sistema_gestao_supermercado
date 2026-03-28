public class ProdutoEletronico extends Produto {
    private int mesesGarantia;

    public ProdutoEletronico(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor, int mesesGarantia) {
        super(nome, codigoBarras, precoBase, fornecedor);  //pra chamar o construtor de produto
        this.mesesGarantia = mesesGarantia;
    }

    // chamar método calcularPrecoFinal
    @Override
    public double calcularPrecoFinal() {
        double precoFinal;

        precoFinal = precoBase*1.5;

        if (mesesGarantia > 12) {
            precoFinal = precoFinal*1.15; // aplicado com a margem
        }

        return precoFinal;
    }
}
