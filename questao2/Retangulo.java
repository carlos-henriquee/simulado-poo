package questao2;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo() {
        this.largura = 1.0;
        this.altura = 1.0;
    }
    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    public double getLargura() {
        return this.largura;
    }
    public double getAltura() {
        return this.altura;
    }
    public void setLargura(double novaLargura) {
        if(novaLargura<=0){
            System.out.println("Largura inválida!");
            return;
        }
        this.largura = novaLargura;
    }
    public void setAltura(double novaAltura) {
        if(novaAltura<=0){
            System.out.println("Altura inválida!");
            return;
        }
        this.altura = novaAltura;
    }
    public double calcularArea() {
        return this.largura*this.altura;
    }
    public boolean isQuadrado() {
        if(this.largura==this.altura)
             return true;
        else
            return false;
    }
}