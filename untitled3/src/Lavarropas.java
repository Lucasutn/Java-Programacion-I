public class Lavarropas extends  Electrodomestico {

    private  double carga;
    static final double CARGA_DEF=5;



    public Lavarropas(double precioBase, String color, char consumo, double peso) {
        super(precioBase, color, consumo, peso);
    }

    public Lavarropas(double precioBase, String color, char consumo, double peso, double carga) {
        super(precioBase, color, consumo, peso);
        this.carga = carga;
    }


    @Override
    public double precioFinal() {

        if(carga>30){
            precioBase+=50;
        }
        return super.precioFinal();
    }
}
