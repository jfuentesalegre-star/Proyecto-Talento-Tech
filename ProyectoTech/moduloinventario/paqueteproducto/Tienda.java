package ProyectoTech.moduloinventario.paqueteproducto;
import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> Listaproductos = new ArrayList<>();

public void agregarProducto(Producto producto) {
        Listaproductos.add(producto);
    }

    
public void ImprimirProductos() {

    if (Listaproductos.isEmpty()) {
        System.out.println("No hay productos registrados.");
        return;
    }

    System.out.println("===== LISTA DE PRODUCTOS =====");

    for (int i = 0; i < Listaproductos.size(); i++) {

        Producto producto = Listaproductos.get(i); // tambien se podria imprimir directamente de la lista pero es menos legible

        System.out.println("ID: " + (i + 1));
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: $" + producto.getPrecio());
        System.out.println("Cantidad en stock: " + producto.getCantStock());
        System.out.println("------------------------------");
    }
}


    
}
