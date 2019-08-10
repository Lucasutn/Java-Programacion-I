public class Password {
    private int longitud;
    private String contraseña;

    protected static int DefectoLongitud=8;

    public Password() {
        this.longitud=DefectoLongitud;
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contraseña=generarPassword(longitud);
    }


    public boolean esFuerte(){
        int cont=0,cont2=0;
        boolean flag;
        for(int i=0;i<mayusculas.length;i++){
            if(contraseña.equals(mayusculas)){
                cont++;
            }if(contraseña.equals(numeros)){
                cont2++;
            }
        }
        if(cont>2 && cont2>5){
            flag=true;
        }else {
            flag=false;
        }
         return flag;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    protected String mayusculas[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","Y","Z"};
    protected int numeros[]={0,1,2,3,4,5,6,7,8,9};

    public String generarPassword(int longitud){
        int var=1;
        for(int i=0;i<longitud;i++){
            var=var*10;
        }
        String password= Double.toString(Math.random()*var) ;
        return password;
    }

    @Override
    public String toString() {
        return "Password{" +
                "contraseña='" + contraseña + '\'' +
                '}';
    }
}
