package questao4;

public class Main {
    public static void main(String[] args) {
        GestaoPedidos gst = new GestaoPedidos();
        gst.adicionarPedido("Vassoura");
        gst.adicionarPedido("Balde");
        gst.adicionarPedido("Copo");

        gst.proximoPedido();
        gst.listarPedidos();

    }

}
