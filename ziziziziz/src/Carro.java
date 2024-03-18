public class Carro {
    String cor = "amarelo";
    String marca ="tesla";
    String modelo = "tesla v3";
    double velocidadeMax = 300f;
    double velocidadeAtual = 0f;
    Motor motor = new Motor();

    void ligar(){
        System.out.println("Ligando o carro");
    }
    void acelerar(){
        this.velocidadeAtual += 20;
        System.out.println("Carro acelerando");
    }
    void mostraInfo(){
        System.out.println("COR: "+this.cor);
        System.out.println("MARCA: "+this.marca);
        System.out.println("MODELO: "+this.modelo);
        System.out.println("VELOCIDADEMAX: "+this.velocidadeMax);
        System.out.println("VELOCIDADEATUAL: "+this.velocidadeAtual);
        System.out.println("POTENCIADOMOTOR: "+this.motor.potencia);
        System.out.println("TIPODOMOTOR: "+this.motor.tipo);
    }
}
