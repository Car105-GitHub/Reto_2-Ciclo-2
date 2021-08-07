package solucion.reto2.mio;

public class Organica extends Fruta{
    //Atributos

    private static final double DESCUENTO_NACIONALES_BASE = 0.05;
    private static final int GRAMAJE_MINIMO_DESCUENTO_NACIONAL = 250;
    private static final double SUBSIDIO_BASE = 0.12;
    private double descuentoNacionales;
    private double subsidio;




    //Constructores

    public Organica(String pNombre, double pPrecio){
        super(pNombre, pPrecio);
        this.descuentoNacionales = Organica.DESCUENTO_NACIONALES_BASE;
        this.subsidio = Organica.SUBSIDIO_BASE;
    }
    public Organica(String pNombre, double pPrecio, int pGramosVenta){
        this(pNombre, pPrecio);
        super.gramosVenta = pGramosVenta;
    }
    public Organica(String pNombre, double pPrecio, double pDescuentoNacionales){ 
        this(pNombre, pPrecio);
        this.descuentoNacionales = pDescuentoNacionales;
    }

    public Organica(String pNombre, double pPrecio, double pDescuentoNacionales, double pSubsidio){
        this(pNombre, pPrecio, pDescuentoNacionales);
        this.subsidio =  pSubsidio;
    }
    public Organica(String pNombre, double pPrecio, double pDescuentoNacionales, double pSubsidio, int pGramosVenta, boolean pImportada){
        this(pNombre, pPrecio, pDescuentoNacionales, pSubsidio);
        super.gramosVenta = pGramosVenta;
        super.importada = pImportada;
    }


    //Métodos
    public double calcularPrecio(){
        double precioVenta = super.calcularPrecio();      
        double precioOrganica = precioVenta + (precioVenta * this.subsidio);

        if( !super.importada &&
            super.gramosVenta >= Organica.GRAMAJE_MINIMO_DESCUENTO_NACIONAL){

            precioOrganica -= precioVenta * Organica.DESCUENTO_NACIONALES_BASE;
        }

        return precioOrganica;
    } 

}
