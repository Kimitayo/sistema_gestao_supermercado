public class Fornecedor {
    // Criar a classe e atributos
    private String nomeEmpresa;
    private String nif;
    private String paisOrigem;

    // Criar construtor e instanciar os atributos
    public Fornecedor(String nomeEmpresa, String nif, String paisOrigem) {
        this.nomeEmpresa = nomeEmpresa;
        this.nif = nif;
        this.paisOrigem = paisOrigem;
    }

    // Método getter e setter

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public void exibirDetalhesFornecedor() {
        System.out.println("Dados do Forncedor: ");
        System.out.println("Nome da Empresa: " + this.nomeEmpresa);
        System.out.println("NIF: " + this.nif);
        System.out.println("Pais de origem: " + this.paisOrigem);
    }
}

