# Cenário: Sistema de Gestão de Supermercado com POO em JAVA
Foi contratado para desenvolver o núcleo de um sistema de caixa e inventário para um Supermercado. Neste estabelecimento, existem diferentes tipos de produtos à venda. Cada produto possui regras específicas de taxação ou validade e está obrigatoriamente ligado a um fornecedor.

A sua tarefa é modelar este sistema utilizando os pilares da Orientação Objetos.

## Requisitos do Sistema
### Composição (A relação "Tem-um")
Nenhum produto chega às prateleiras sem um fornecedor.
1. Crie uma classe Fornecedor.
2. A classe deve conter os atributos privados: nomeEmpresa (String), nif (String - Número de
   Identificação Fiscal) e paisOrigem (String).
3. Crie um construtor para inicializar estes atributos e os métodos Getters e Setters
   correspondentes.
4. Crie um método exibirDetalhesFornecedor() que imprime as informações do fornecedor.
   
# Herança e Abstração (A relação "É-um")
   Existem vários tipos de produtos, mas não existe um "produto genérico" para ser vendido sem uma categoria específica.
1. Crie uma classe abstrata chamada Produto.
2. Adicione os atributos: nome (String), codigoBarras (int), precoBase (double) e fornecedor(Fornecedor). Atenção: O atributo fornecedor demonstra a composição, pois o produto tem-um fornecedor.
3. Crie um construtor que receba e inicialize todos estes atributos.
4. Defina um método abstrato public abstract double calcularPrecoFinal();. Como cada classe filha (tipo de produto) calcula os seus impostos e margens de forma diferente, a implementação será obrigatória nelas.
5. Crie um método concreto exibirResumo() que imprime o nome do produto e o preço base.
   
# Especializando as Classes (Subclasses)
   Crie duas classes que herdam (extends) de Produto:
1. Classe ProdutoAlimenticio:
   - ○ Adicione um atributo específico: diasValidade (int).
   - ○ No construtor, não se esqueça de utilizar a palavra-chave super para repassar os atributos comuns à superclasse.
   - ○ Sobrescreva (@Override) o método calcularPrecoFinal(). A regra é: o preço final é o precoBase mais uma margem de lucro de 20%. No entanto, se os diasValidade forem menores ou iguais a 5, o produto deve receber um desconto de 30% sobre o valor
   final (para evitar o desperdício).
   2. Classe ProdutoEletronico:
   - ○ Adicione um atributo específico: mesesGarantia (int).
   - ○ No construtor, utilize o super.
   - ○ Sobrescreva (@Override) o método calcularPrecoFinal(). A regra é: o preço final é o precoBase mais uma margem de 50%. Adicionalmente, se os mesesGarantia forem superiores a 12, é adicionada uma taxa extra de 15% ao preço final referente à garantia estendida. 
## -Compras)
1. Crie uma classe CarrinhoDeCompras.
2. Utilize uma ArrayList<Produto> (ou LinkedList) para armazenar os itens do carrinho.
3. Crie um método adicionarItem(Produto produto).
4. Crie um método processarCompra(). Este método deve usar um laço de repetição (for ou for-each) para percorrer a lista de produtos, invocar o método calcularPrecoFinal() de cada um (demonstrando o Polimorfismo) e apresentar o valor total a pagar no final da compra. 
## Execução (Classe Main)
   Crie uma classe Main contendo o método public static void main(String[] args):
1. Instancie pelo menos dois fornecedores diferentes (ex: Fazenda Local, TechGlobal).
2. Instancie um ProdutoAlimenticio e um ProdutoEletronico, passando os fornecedores criados para eles (Composição).
3. Instancie um CarrinhoDeCompras e adicione os produtos.
4. Invoque o método processarCompra() do carrinho e imprima o talão final no ecrã (console). 
