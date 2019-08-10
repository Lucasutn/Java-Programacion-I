package paquete1;

public class SacaCorchos {

    private boolean tieneCorcho;


     public void destapar(Botella botella1) {

        if (!tieneCorcho) {
            if ((botella1.getCorcho()).isEnBotella()) {
                botella1.corchoBotella(false);
                tieneCorcho = true;
            } else {
                System.out.println("Ya esta destapado");
            }
        }else {
            System.out.println("Error,sacacorchos ocupado xd");
        }

    }


    public void limpiar(){

        if(tieneCorcho){
            tieneCorcho=false;
        }else {
            System.out.println("Error ,no tiene corcho");
        }
    }




}
