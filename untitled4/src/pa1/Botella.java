package pa1;

public class Botella {


    Corcho corchoEnBotella;


    public Botella(Corcho corcho) {
        this.corchoEnBotella = corcho;
    }


    public void setCorchoEnBotella(boolean corchoEstado) {



        String bodega=corchoEnBotella.getBodega();

        Corcho corcho = new Corcho(bodega,corchoEstado);

        this.corchoEnBotella=corcho;
    }


    public Corcho getCorchoEnBotella() {
        return corchoEnBotella;
    }
}
