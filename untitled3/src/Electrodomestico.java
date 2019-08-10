import java.util.Arrays;

public class Electrodomestico {


    protected  double precioBase;
    protected  String color;
    protected  char consumo;
    protected double peso;


    static String[]colores = {"negro","rojo","azul","gris"};
    public char[]tiposConsumo ={'A','B','C','D','E','F'};
    static final String COLOR_DEF= "blanco";
    static final char CONSUMO_DEF='F';

    public Electrodomestico(double precioBase, String color, char consumo, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        comprobarConsumoEnergetico(consumo);
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico (char letra){

        for(int i=0; i<tiposConsumo.length;i++){

            if(letra==tiposConsumo[i]){
                this.consumo=letra;
                return;
            }

        }
        this.consumo=CONSUMO_DEF;
        return;


    }


    public  double precioFinal(){

        switch (consumo){

            case 'A': precioBase=precioBase+100;
                      break;
            case 'B': precioBase=precioBase+80;
                break;
            case 'C': precioBase=precioBase+60;
                break;
            case 'D': precioBase=precioBase+50;
                break;
            case 'E': precioBase=precioBase+30;
                break;
            case 'F': precioBase=precioBase+10;
                break;

        }


        if (peso>0 && peso<20){
            precioBase+=10;
        }else if (peso>=20&&peso<=49){
            precioBase+=50;
        }else if(peso>=50 && peso<=79){
            precioBase+=30;
        }else if(peso>=80){
            precioBase+=100;

        }

        return precioBase;




    }


    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumo=" + consumo +
                ", peso=" + peso +
                '}';
    }
}
