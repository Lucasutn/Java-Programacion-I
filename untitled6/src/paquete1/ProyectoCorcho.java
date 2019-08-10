package paquete1;


import paquete1.Botella;
import paquete1.Corcho;
import paquete1.SacaCorchos;

public class ProyectoCorcho {




    public static void main (String[] args){

        Corcho corcho1= new Corcho("VinoToro",true);

        Botella botella1 = new Botella(corcho1);

        Botella botella2=new Botella(corcho1);

        SacaCorchos sacaCorchos1=new SacaCorchos();

           sacaCorchos1.destapar(botella1);




           sacaCorchos1.destapar(botella2);





    }


}
