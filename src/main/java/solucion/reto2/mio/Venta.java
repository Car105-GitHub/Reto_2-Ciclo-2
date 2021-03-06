package solucion.reto2.mio;

import java.util.ArrayList;

public class Venta {
    
    //Atributos
    private double totalFrutas;
    private double totalFrutasOrganicas;
    private double totalFrutasConvencionales;
    private ArrayList<Fruta> listaFrutas = new ArrayList<Fruta>();
    private int frutaObsequio = -1;

    //Constructor
    public Venta(ArrayList<Fruta> pListaFrutas){
        this.listaFrutas = pListaFrutas;
        this.totalFrutas = 0;
        this.totalFrutasOrganicas = 0;
        this.totalFrutasConvencionales = 0;
    }

    public void mostrarTotales(){

        int numConvencionales = 0;
        int numOrganicas = 0;

        for (int i = 0; i < this.listaFrutas.size(); i++) {
            
            if( this.listaFrutas.get(i) instanceof Convencional ){
                numConvencionales++;
                this.totalFrutasConvencionales += this.listaFrutas.get(i).calcularPrecio();
            }else if( this.listaFrutas.get(i) instanceof Organica){
                
                numOrganicas++;
                this.totalFrutasOrganicas += this.listaFrutas.get(i).calcularPrecio();

                if(this.frutaObsequio == -1){
                    this.frutaObsequio = i;
                }else{                    
                    if( this.listaFrutas.get(this.frutaObsequio).calcularPrecio() <
                        this.listaFrutas.get(i).calcularPrecio() ){
                        this.frutaObsequio = i;
                    }
                }        

            }else if(this.listaFrutas.get(i) instanceof Fruta){
                this.totalFrutas += this.listaFrutas.get(i).calcularPrecio();
            }

        }

        double totalCompra = this.totalFrutas + this.totalFrutasConvencionales + this.totalFrutasOrganicas;

        System.out.println("Valor frutas cultivo convencional = " + Math.round(this.totalFrutasConvencionales * 10.0) / 10.0);
        System.out.println("Valor frutas cultivo orgánico = " + this.totalFrutasOrganicas);

     //   double totalCompra = this.totalFrutas + this.totalFrutasConvencionales + this.totalFrutasOrganicas;

        if( numOrganicas > numConvencionales && this.frutaObsequio != -1)
        {
            
            double descuento = this.listaFrutas.get(this.frutaObsequio).calcularPrecio() * 0.5; 
            totalCompra -= descuento;

            String nombreObsequio = this.listaFrutas.get(this.frutaObsequio). getNombre();
            System.out.println("Se han descontado "+descuento+" en el ítem "+nombreObsequio+ " tipo orgánico");

        }

        System.out.println("Valor total compra = " + (this.totalFrutas + totalCompra));

    }

}