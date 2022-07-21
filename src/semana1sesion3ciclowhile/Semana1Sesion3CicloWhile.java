
package semana1sesion3ciclowhile;

import java.util.Scanner;


public class Semana1Sesion3CicloWhile {

   
    public static void main(String[] args) {
        // TODO code application logic here
        //Definicio Consola
        Scanner consola=new Scanner(System.in);
        ///Definicon de Variables
        char Letra;
        int cantidad_a=0, cantidad_e=0,cantidad_i=0,cantidad_o=0,cantidad_u=0;
        System.out.println("Letra: ");
        Letra=consola.next().charAt(0);
        while (Letra!='z') {
                switch(Letra){
                    case 'a':
                        cantidad_a++;
                        break;
                    case 'e':
                        cantidad_e++;
                        break;
                   case 'i':
                        cantidad_i++;
                        break;
                    case 'o':
                        cantidad_o++;
                        break;
                    case 'u':
                        cantidad_u++;
                        break;
                }
                System.out.println("Letra: ");
                Letra=consola.next().charAt(0);
            }
        System.out.println("Cantidad de a:"+cantidad_a);
        System.out.println("Cantidad de e:"+cantidad_a);
        System.out.println("Cantidad de i:"+cantidad_a);
        System.out.println("Cantidad de o"+cantidad_a);
        System.out.println("Cantidad de u:"+cantidad_u);              
        
            
}

}
    

