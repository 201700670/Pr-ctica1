
package ipc1.practica1_201700670;

import java.util.Scanner;

/**
 *
 * @author Andrea Palomo
 */
public class Parametros {
        public static int jugadores; //VARIABLES GLOBALES DEFINIDAS PARA UTILIZARLA EN CUALQUIER CLASE
        public static String[]simb= new String [4];
        public static int s;
        public static int b;
        public static int i;
        public static int k;
        public static Scanner a= new Scanner (System.in);
        public static Scanner j= new Scanner (System.in);
     public void Parametros(String[] args) {
        
        Scanner l= new Scanner (System.in);
        Scanner m= new Scanner (System.in);
        Scanner menu= new Scanner(System.in);
        String sim;
        int c;
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
            {
                System.out.print("Ingrese la cantidad de jugadores: ");
                jugadores=j.nextInt();
                if(jugadores<2){
                    System.out.println("La cantidad de jugadores no es permitido debe haber al menos 2");
                    System.out.println("Ingrese nuevamente la cantidad de jugadores: ");
                    jugadores=j.nextInt();
                }}
                for (i=0;i<jugadores;i++){
                    System.out.print("Ingrese símbolo jugador: "+(i+1)+" (no pueden ser iguales para todos los jugadores): ");
                    sim=a.next();
                    simb[i]=sim;
                    for (k=0; k<i; k++){
                        if(simb[i].equals(simb[k])){
                            System.out.println("El símbolo ya existe, ingrese de nuevo");
                            sim=a.next();
                            simb[i]=sim;
                        }
                    }
                }
                System.out.println(" ");
                break;
            case 2:
                System.out.println("PARA ELEGIR ESTA OPCIÓN ANTES TUVO QUE HABER INGRESADO EL NIVEL DE DIFICULTAD");
                if ((Dificultad.r).equals("F")){
                    System.out.println("Ingrese las subidas para este rango (5-10)");
                    System.out.println("Ingrese subidas: ");
                    s=l.nextInt();
                    System.out.println("Ingrese bajadas: ");
                    b=m.nextInt();
                }
                else if ((Dificultad.r).equals("D")){
                    System.out.println("Ingrese las subidas para este rango (20-40)");
                    System.out.println("Ingrese subidas: ");
                    s=l.nextInt();
                    System.out.println("Ingrese bajadas: ");
                    b=m.nextInt();
                }else{
                    Parametros entrados= new Parametros();
                    entrados.Parametros(args);
                }
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
