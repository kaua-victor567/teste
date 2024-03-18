public class Main {
    public static void main(String[] args) {
Carrinho carrinho = new Carrinho();
carrinho.produtos[0] = new Produto();
carrinho.produtos[1] = new Produto();
carrinho.produtos[2] = new Produto();
carrinho.produtos[3] = new Produto();
carrinho.produtos[4] = new Produto();
carrinho.produtos[0].nome = "aaa";
carrinho.produtos[1].nome = "aca";
carrinho.produtos[2].nome = "aaa";
carrinho.produtos[3].nome = "aba";
carrinho.produtos[4].nome = "aaa";
carrinho.produtos[0].descricao = "nada";
carrinho.produtos[1].descricao = "nada";
carrinho.produtos[2].descricao = "nada";
carrinho.produtos[3].descricao = "nada";
carrinho.produtos[4].descricao = "nada";
carrinho.produtos[0].fabricante = "ada";
carrinho.produtos[1].fabricante = "naa";
carrinho.produtos[2].fabricante = "nada";
carrinho.produtos[3].fabricante = "naa";
carrinho.produtos[4].fabricante = "naa";
carrinho.produtos[0].preco = 10f;
carrinho.produtos[1].preco = 10f;
carrinho.produtos[2].preco = 10f;
carrinho.produtos[3].preco = 10f;
carrinho.produtos[4].preco = 10f;
carrinho.exibirInfos();
System.out.println(carrinho.calculaTotal());
    }
}