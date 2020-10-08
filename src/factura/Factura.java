
package factura;

import java.util.Scanner;

public class Factura {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Articulo producto = new Articulo();
        Impuestos impuesto = new Impuestos();
        Descuentos descuento = new Descuentos();
        String nombre;
        long precio, pagefe;
        float impuestos, impuestoss, totpag;
        int cantidad;
  System.out.println("Ingrese el nombre del producto");
  producto.setNombre(nombre = leer.nextLine());
  System.out.println("Ingrese el valor del producto");
  producto.setPrecio(precio = leer.nextInt());
  System.out.println("Ingrese la cantidad de productos comprados");
  producto.setCantidad(cantidad = leer.nextInt());
  impuestos = producto.getPrecio()*producto.getCantidad() ;
  impuestoss = impuesto.aplicarImpuesto(impuestos);
  totpag = impuestos+impuestoss;
  System.out.println("Nombre del producto:  "+ producto.getNombre());
  System.out.println("Cantidad de comprados:  "+ producto.getCantidad());
  System.out.println("Precio del producto:  "+ producto.getPrecio());
  if(totpag >=50000){
      totpag = totpag - descuento.aplicarDescuentos(totpag);
      System.out.println("Total descuento:  "+descuento.aplicarDescuentos(totpag));
  }
  System.out.println("Total de impuestos: "+ impuestoss);
  System.out.println("Total a pagar:    "+ totpag); 
  System.out.println("Pago en efectivo: ");
  pagefe = leer.nextInt();
  if(pagefe>totpag){
      System.out.println("Vueltos:  "+(pagefe-totpag));
  } else System.out.println("Gracias por su compra!");
  }
}
