import javax.swing.*;
import java.util.Scanner;

public class ProyectoPassword {
    public static void main(String[]args){


        JOptionPane.showMessageDialog(null,"Anda a La cancha bobo");
        Scanner entrada=new Scanner(System.in);
        int longitu,cont=1;

        System.out.println("Ingrese tamaño de array de password");
        int pass=entrada.nextInt();


        Password password[]= new Password[pass];
        boolean flag[]=new boolean[pass];

        for(int i=0;i<pass;i++){
            System.out.println("Ingrese longitud");
             longitu=entrada.nextInt();
            password[i]=new Password(longitu);
            if(password[i].esFuerte()){
                flag[i]=true;
            }else {
                flag[i]=false;
            }


            System.out.println("Contraseña "+cont +password[i].toString() +" "+ flag[i]);
            cont++;
        }










    }
}
