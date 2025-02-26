package OrientaçãoObejtos.atividade;

public class Produto {

    String nome;
    double preco;
    int quantidadeEstoque;

    Produto(String nome,double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Produto(){}


    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidadeEstoque);
    }

    public int comprar(int quantidadeComprada) {
        if(quantidadeComprada <= quantidadeEstoque) {
            quantidadeEstoque -= quantidadeComprada;
            System.out.println("Compra realizada");
        }else {
            System.out.println("Quantidade insuficiente em estoque");

        }
        return quantidadeEstoque;
    }
    public int adicionarEstoque(int adicaoEstoque) {
          quantidadeEstoque += adicaoEstoque;
        return quantidadeEstoque;
    }

    public double aplicarDesconto(double porcentual) {
        double desconto = preco * (porcentual/100);
        preco -= desconto;
        return preco;
    }
}
