
package ipc1.practica1_201700670;

import java.util.Scanner;//Lectura de datos

/**
 *
 * @author Andrea Palomo
 */
public class IPC1Practica1_201700670 {

    public static void main(String[] args) {
            Scanner entrada= new Scanner (System.in); //se llama una variable para ser ingresado por el ususario
        int res; //variable entera para ingrsar en el menú
        System.out.println("[IPC1]Práctica1_201700670"); // Este es un menú de opciones que se mostrará al usuario
        System.out.println();
        System.out.println("MENÚ DE PRINCIPAL DE OPCIONES");
        System.out.println("1. DIFICULTAD DEL JUEGO");
        System.out.println("2. PARÁMETROS INICIALES");
        System.out.println("3. INICIAR JUEGO");
        System.out.println("4. SALIR");
        System.out.print("¿Qué opción desea elegir (1-4)? ");
        res=entrada.nextInt(); //se ingresa el número de la opción del menú
        System.out.println("");
        switch(res){
            case 1:
                Dificultad llama= new Dificultad();//Llama a la clase Dificultad
                llama.Dificultad(args);
                break;
            case 2:
                Parametros llamado= new Parametros();//Llama a la clase Parametros
                llamado.Parametros(args);
                break;
            case 3:
                Iniciarj entra= new Iniciarj();//Llama a la clase Iniciarj
                entra.Iniciarj(args);
                break;
            case 4:
                System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA");
                System.exit(0); //salir del programa
                break;
            default:
                break; 
        }
    }
    
}
