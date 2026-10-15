package ProyectoTech.moduloinventario.paqueteproducto;

public class Producto {
    private String nombre;
    private double precio;
    private int cantStock;

    public Producto(String nombre, double precio, int cantStock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantStock = cantStock;
    }


    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantStock() {
        return cantStock;
    }

}
