package factura;
public class Articulo {
private String Nombre;
private long Precio;
private long Cantidad;

    public void setNombre(String nombre){
        this.Nombre = nombre;
    }
    public String getNombre(){
        return Nombre;
    }
    public void setPrecio(long precio){
        this.Precio = precio;
    }
    public float getPrecio(){
        return Precio;
    }
    public void setCantidad(int cantidad){
        this.Cantidad = cantidad;
    }
    public long getCantidad(){
        return Cantidad;
    }
    }