package paquete1;

  public class Corcho {

    private String bodega;
    private boolean enBotella;

    public Corcho(String bodega, boolean enBotella) {
        this.bodega = bodega;
        this.enBotella = enBotella;
    }


    public String getBodega() {
        return bodega;
    }

    public boolean isEnBotella() {
        return enBotella;
    }
}
