public class Carrinho {
    double total;
    Produto produtos[] = new Produto[5];
    void exibirInfos(){
        for(int i = 0; i< produtos.length;i++) {
            if(produtos[i] != null) {
                System.out.println(produtos[i].nome);
                System.out.println(produtos[i].descricao);
                System.out.println(produtos[i].fabricante);
                System.out.println(produtos[i].preco);
            }
        }
    }
        double calculaTotal(){
        for(int i = 0; i< produtos.length;i++) {
            if (produtos[i] != null) {
                this.total += produtos[i].preco;
            }
        }
        return this.total;
        }

}
