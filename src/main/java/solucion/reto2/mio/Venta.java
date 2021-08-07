package solucion.reto2.mio;


public class Venta {
    //Atributos
    //Constructor
    public Venta(ArrayList<Fruta> pListaFrutas){
    }
    //Requerimiento principal -> Realizar los cálculos de la venta o pedido public void mostrarTotales(){
    //Cálculo valor total de la compra
    double totalCompra = this.totalFrutas + this.totalFrutasConvencionales + this.totalFrutasOrganicas;
    //Primera parte de la salida
    System.out.println("Valor frutas cultivo convencional = " + this.totalFrutasConvencionales);
    System.out.println("Valor frutas cultivo orgánico = " + this.totalFrutasOrganicas);
     
     
    //Condiciones para reportar obsequio
    //1) Mayor número de productos orgánicos
    //2) Por lo menos un obsequio cargado en los atributos del pedido después
    de revisión del listado
    if(condiciones){
    //Descontar el 50% del producto orgánico de mayor valor
    System.out.println("Se han descontado "+descuento+" en el ítem "+nombreObsequio+ " tipo orgánico");
    }
    //Parte final
    System.out.println("Valor total compra = " + totalCompra));
    }
    }