package Class;

public class Producto {
    private int id;
    private String[] productos={"Cereales","Arroz","Fideos","Ramitas","Pie de limon"};

    public Producto() {
    }

    public Producto(int id, String[] productos) {
        this.id = id;
        this.productos = productos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }
}
