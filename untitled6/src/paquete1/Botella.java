package paquete1;

public class Botella {

    private Corcho corcho;



    public Botella(Corcho corcho) {
        this.corcho = corcho;
    }

    public Corcho getCorcho() {
        return corcho;
    }

    public void setCorcho(Corcho corcho) {
        this.corcho = corcho;
    }



    public void corchoBotella(boolean estadoCorcho){

        Corcho corcho1= new Corcho(corcho.getBodega(),estadoCorcho);

        corcho=corcho1;

    }



}
