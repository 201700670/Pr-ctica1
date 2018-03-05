
package ipc1.practica1_201700670;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Andrea Palomo
 */
public class Dificultad {
    Scanner condicion= new Scanner(System.in);
    public static String r;
    public void Dificultad(String[] args) {
        Scanner menu= new Scanner(System.in);
        int c;
        do{ 
        System.out.println("MENÚ DE OPCIONES DE DIFICULTAD");//menú de Usuarios y opciones
        System.out.println("1. FACIL");
        System.out.println("2. DIFICIL");
        System.out.println("3. REGRESAR MENÚ PRINCIPAL");
        System.out.print("¿Qué opción desea elegir (1-3)? ");  
        c=menu.nextInt();
        System.out.println("");
        switch(c){//se utiliza un switch para que al ingresar un número sea el del menú y se desarrolle
            //lo que desea el usuario hacer
            case 1:
                System.out.println("DIFICULTAD FÁCIL SELECCIONADA");
                System.out.println("JUGADORES DE 2 A 3");
                System.out.println("Subidas de 5 a 10");
                System.out.println("Bajones de 5 a 10");
                System.out.print("¿Desea elegir esta dificultad (responda F para elegir esta opción)?  ");
                r=condicion.next();
                System.out.println("");
                 IPC1Practica1_201700670 entra= new IPC1Practica1_201700670();//regresará al menú principal
               entra.main(args);
                break;
            case 2:
                System.out.println("DIFICULTAD DIFÍCIL SELECCIONADA");
                System.out.println("JUGADORES DE 2 A 4");
                System.out.println("Subidas de 20 a 40");
                System.out.println("Bajones de 20 a 40");
                System.out.print("¿Desea elegir esta dificultad (responda D para elegir esta opción)?  ");
                r=condicion.next();
                System.out.println("");
                IPC1Practica1_201700670 entrad= new IPC1Practica1_201700670();//regresará al menú principal
               entrad.main(args);
                break;
            case 3:
                IPC1Practica1_201700670 entrada= new IPC1Practica1_201700670();//regresará al menú principal
               entrada.main(args);
                break;
            default:
                System.exit(0);//sale del sistema
                break;
        }
        }while(c<=3);//la condición se cumple siempre y cuando el usuario ingrese de 1-3
    }
}
