import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Scanner entrada = new Scanner(System.in);

        String codigoProduto = entrada.nextLine();
        String nome = entrada.nextLine();
        String categoria = entrada.nextLine();

        int codigoSerie = entrada.nextInt();
        int quantidade = entrada.nextInt();

        entrada.close();

        produto.codigoProduto = codigoProduto;
        produto.codigoSerie = codigoSerie;
        produto.nome = nome;
        produto.categoria = categoria;
        produto.quantidade = quantidade;

        produto.mostraInfo();
    }
}