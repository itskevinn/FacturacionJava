package factura;
public class Impuestos {
    long impuesto;
    long totpag;
    public long aplicarImpuesto(float precio){
        if(precio>=10000){
            impuesto =(long) (precio*(10.5))/100;
        }
        else if(precio>=5000 && precio<10000){
            impuesto = (long) (precio*(9.2))/100;
        }
        else if(precio<=5000 && precio>=10000){
            impuesto = (long) (precio*(7.5))/100;
        }
        return impuesto;
    }
    }
    

