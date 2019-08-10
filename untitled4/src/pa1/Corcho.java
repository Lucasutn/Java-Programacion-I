package pa1;

public class Corcho {


    public String bodega;
    public boolean enBotella;


    public Corcho(String bodega, boolean enBotella) {
        this.bodega = bodega;
        this.enBotella = enBotella;
    }


    public void setEnBotella(boolean enBotella) {
        this.enBotella = enBotella;
    }

    public boolean isEnBotella() {
        return enBotella;
    }

    public String getBodega() {
        return bodega;
    }
}
