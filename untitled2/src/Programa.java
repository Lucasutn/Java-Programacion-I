import java.util.Scanner;

public class Programa {

    public static void main(String[] args){
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese nombre");
        String nombre=entrada.next();
        System.out.println("Ingrese edad");
        int edad=entrada.nextInt();
        System.out.println("Ingrese sexo");
        char sexo=entrada.next().charAt(0);
        System.out.println("Ingrese peso");
        double peso=entrada.nextDouble();
        System.out.println("Ingrese altura");
        double altura=entrada.nextDouble();

        Persona persona1=new Persona(nombre,edad,"",sexo,peso,altura);


        Persona persona2=new Persona("Juan",49,'j');

        Persona persona3=new Persona();
        persona3.setNombre("Luciano");
        persona3.setEdad(18);
        persona3.setPeso(67);
        persona3.setAltura(160);



        persona3.calcularMC();
        System.out.println(persona3.MayorEdad());










    }


}
