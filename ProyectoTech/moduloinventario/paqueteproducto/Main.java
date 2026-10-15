package ProyectoTech.moduloinventario.paqueteproducto;

public class Main { // cuerpo de la clase
    public static void main(String[] args) { 
        Producto p1 = new Producto("Café Premium", 2500.50, 30);
        Producto p2 = new Producto("Azúcar", 1200.0, 15);
        Producto p3 = new Producto("Leche", 1800.0, 20);

        Tienda tienda = new Tienda();
        
        tienda.agregarProducto(p1);
        tienda.agregarProducto(p2);
        tienda.agregarProducto(p3);

        tienda.ImprimirProductos();
    }
}