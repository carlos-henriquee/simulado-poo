package questao2;
public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo(5,5);
        String ehQuadrado = r.isQuadrado()?"Sim":"Nao";
        System.out.println("R é quadrado? " + ehQuadrado);
        System.out.println("Área: " + r.calcularArea());
    }
}
