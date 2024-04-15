public class Conta {
    private int qntClientes;
    private double saldo;
    public Conta(int qntClientes, double saldo) {
       this.qntClientes = qntClientes;
       this.saldo = saldo;
    }

    public void setDeposita(double valor){
        this.saldo +=valor;
    }
    public void setSaca(double valor){
        if (valor < this.saldo) {
            this.saldo -= valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }
    public void getExtrato(){
    System.out.println("Saldo atual : " + this.saldo);
    }
}
