
package ipc1.practica1_201700670;

import java.util.Scanner;

/**
 *
 * @author Andrea Palomo
 */
public class Parametros {
     public void Parametros(String[] args) {
        Scanner menu= new Scanner(System.in);
        int c;int i;
        String d;
        Scanner a= new Scanner (System.in);
        String[]persona= new String [5];
        do{ 
        System.out.println("MENÚ DE OPCIONES DE USUARIOS");//menú de Usuarios y opciones
        System.out.println("1. JUGADORES");
        System.out.println("2. SUBIDAS Y BAJONES");
        System.out.println("3. REGRESAR A MENÚ PRINCIPAL");
        System.out.print("¿Qué opción desea elegir (1-3)? ");  
        c=menu.nextInt();
        System.out.println("");
        switch(c){//se utiliza un switch para que al ingresar un número sea el del menú y se desarrolle
            //lo que desea el usuario hacer
            case 1:
               
                break;
            case 2:
               
                break;
            case 3:
                IPC1Practica1_201700670 entrad= new IPC1Practica1_201700670();//regresará al menú principal
               entrad.main(args);
                break;
            default:
                System.exit(0);//sale del sistema
                break;
        }
        }while(c<=3);//la condición se cumple siempre y cuando el usuario ingrese de 1-3
    }
}
