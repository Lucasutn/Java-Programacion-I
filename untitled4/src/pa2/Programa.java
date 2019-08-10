package pa2;

import pa1.Botella;
import pa1.Corcho;
import pa1.Sacacorchos;

public class Programa {



    public static void main (String[] args){

        Corcho corcho= new Corcho("LosAndes",true);

        Sacacorchos sacacorchos=new Sacacorchos();

        Botella botella1 = new Botella(corcho);

      sacacorchos.destapar(botella1);



    }
}
