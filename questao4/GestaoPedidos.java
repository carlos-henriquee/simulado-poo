package questao4;

import java.util.ArrayList;

public class GestaoPedidos {
    private ArrayList <String> pedidos;

    public GestaoPedidos() {
        pedidos = new ArrayList<>();
    }
    public void adicionarPedido(String item) {
        this.pedidos.add(item);
    }
    public String proximoPedido() {
        if(this.pedidos.isEmpty()) {
            return "Lista de pedidos vazia";
        }
        return this.pedidos.remove(0);
    }
    public int quantidadePendentes() {
        return this.pedidos.size();
    }
    public void listarPedidos() {
        if(this.pedidos.isEmpty()) {
            System.out.println("Lista de pedidos vazia");
            return;
        }
        for(int i = 0; i<pedidos.size(); i++) {
            System.out.println(pedidos.get(i));
        }
    }
}
