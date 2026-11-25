public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(int codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    public void registrarIngresoStock(int cantidad) {
        if (cantidad > 0) {
            stock += cantidad;
            System.out.println("Ingreso registrado.");
        } else {
            System.out.println("La cantidad debe ser positiva.");
        }
    }

    public void registrarVenta(int cantidad) {
        if (cantidad > 0 && cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta realizada.");
        } else {
            System.out.println("Venta rechazada. Stock insuficiente o cantidad invalida.");
        }
    }

    public int getStock() {
        return stock;
    }

    public void mostrarProducto() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }
}