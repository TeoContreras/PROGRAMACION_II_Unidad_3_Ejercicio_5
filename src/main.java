public class main {
    public static void main(String[] args) {
        Producto producto = new Producto(1, "Teclado", 15000, 10);
        producto.registrarVenta(3);
        producto.registrarVenta(20);
        producto.registrarIngresoStock(5);
        producto.mostrarProducto();
    }
}