public abstract class Produto {
    protected String nome;
    protected int codigoBarras;
    protected double precoBase;
    protected Fornecedor fornecedor; // compisição

    // Criar construtor e instanciar os atributos
    public Produto(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor) {
        this.nome = nome;
        this.codigoBarras = codigoBarras;
        this.precoBase = precoBase;
        this.fornecedor = fornecedor;
    }

    // Método abstrato
    public abstract double calcularPrecoFinal();

    // Método concreto
    public void exibirResumo() {
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço base: " + precoBase);
    }
}
