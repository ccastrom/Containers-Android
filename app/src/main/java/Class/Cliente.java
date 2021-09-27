package Class;

import java.util.Arrays;

public class Cliente {
    private int id;
    private String[] clientes={"Pedro","Juan","Maria"};


    public Cliente() {

    }

    public Cliente(int id, String[] clientes) {
        this.id = id;
        this.clientes = clientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getClientes() {
        return clientes;
    }

    public void setClientes(String[] clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", clientes=" + Arrays.toString(clientes) +
                '}';
    }
    public int calcularPedro(int salario, int precio){
         salario=12000;
        int resultado= salario-precio;
        return resultado;


    }
}
