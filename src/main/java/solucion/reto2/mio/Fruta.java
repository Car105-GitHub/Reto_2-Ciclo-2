package solucion.reto2.mio;

public class Fruta {
    //Atributos

    private static final int GRAMAJE_BASE_VENTA = 200;
    private String nombre;
    private double precioBase;
    protected int gramosVenta;
    protected boolean importada = false;


    //Constructores
    public Fruta(String pNombre, double pPrecio){
        this.nombre = pNombre;
        this.precioBase = pPrecio;
        this.gramosVenta = Fruta.GRAMAJE_BASE_VENTA;   
    }
    public Fruta(String pNombre, double pPrecio, int pGramosVenta){

        this(pNombre, pPrecio);
        
        if(pGramosVenta < Fruta.GRAMAJE_BASE_VENTA){
            this.gramosVenta = Fruta.GRAMAJE_BASE_VENTA;
        }else{
            this.gramosVenta = pGramosVenta;
        }
    }

    public Fruta(String pNombre, double pPrecio, int pGramosVenta, boolean pImportada){
        this(pNombre, pPrecio, pGramosVenta);
        this.importada = pImportada;
    }



    //Métodos
    public double calcularPrecio(){
        double precioVenta =0;
        
        if(this.importada){
            precioVenta = (this.precioBase * this.gramosVenta) * 1.10;
        }else{
            precioVenta = (this.precioBase * this.gramosVenta);
        }
        return precioVenta;

    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    }
