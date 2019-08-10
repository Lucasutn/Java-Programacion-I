public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private double altura;



    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        generarDNI();
        ComprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {


    }

    public double calcularMC(){
        if((peso/(altura*altura))<20){
            System.out.println("Peso ideal");
            return -1;
        }else if((peso/(altura*altura))>20 && (peso/(altura*altura))<25){
            System.out.println("Debajo del peso ideal");
            return 0;
        }else {
            System.out.println("Sobrepeso");
            return 1;
        }
    }

    public boolean MayorEdad(){
        boolean mayor;
        if(edad>17){
            return mayor=true;
        }else{
            return mayor=false;
        }
    }


    private  char ComprobarSexo(char sexo){
        if(sexo=='M' || sexo=='H'){
            return sexo;
        }else{
            sexo='H';
            return sexo;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }


    private void generarDNI(){

long numDNI= (int) Math.round(Math.random()*100000000);

this.DNI= Long.toString(numDNI);


    }







    public void setAltura(double altura) {
        this.altura = altura;
    }



    public void setPeso(double peso) {
        this.peso = peso;
    }



    public void setSexo(char sexo) {
        this.sexo = sexo;
    }



    public void setEdad(int edad) {
        this.edad = edad;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
