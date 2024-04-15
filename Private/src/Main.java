import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();
        Conta conta = new Conta(1,200);
        conta.setDeposita(valor);
        conta.getExtrato();
    }
}