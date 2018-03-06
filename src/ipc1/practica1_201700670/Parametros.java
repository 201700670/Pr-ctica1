
package ipc1.practica1_201700670;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Andrea Palomo
 */
public class Parametros {
        public static int cantJugadores; //VARIABLES GLOBALES DEFINIDAS PARA UTILIZARLA EN CUALQUIER CLASE
        public  static String[]simb= new String [4];//Define que se utilizará 4 datos de forma global guardados
        int s;
        int b;
        int i;
        int k;
        public static Scanner a= new Scanner (System.in);
        public static Scanner j= new Scanner (System.in);
        Random aleatorio;//
     public void Parametros(String[] args) {
        
        Scanner l= new Scanner (System.in);
        Scanner m= new Scanner (System.in);
        Scanner menu= new Scanner(System.in);
        String sim;
        int c;
        do{ 
        System.out.println("MENÚ DE OPCIONES DE PARÁMETROS INICIALES");//menú de parametros iniciales
        System.out.println("1. JUGADORES");
        System.out.println("2. SUBIDAS Y BAJONES");
        System.out.println("3. REGRESAR A MENÚ PRINCIPAL");
        System.out.print("¿Qué opción desea elegir (1-3)? ");  
        c=menu.nextInt();
        System.out.println("");
        switch(c){//se utiliza un switch para que al ingresar un número sea el del menú y se desarrolle
            //lo que desea el usuario hacer
            case 1:
                if((Dificultad.r).equals("F")){//se utiliza la condición de la dificultad (Fácil)
                    System.out.println("LA CANTIDAD DE JUGADORES ES DE (2-3)");
                System.out.print("Ingrese la cantidad de jugadores: ");
                cantJugadores=j.nextInt();//Ingresa cantidad de jugadores establecidos por la dificultad
                if(cantJugadores<2){
                    System.out.println("La cantidad de jugadores no es permitido debe haber al menos 2");
                    System.out.print("Ingrese nuevamente la cantidad de jugadores: ");
                    cantJugadores=j.nextInt();
                }
               if(cantJugadores>3){
                    System.out.println("La cantidad de jugadores no debe ser mayor a 3");
                    System.out.print("Ingrese nuevamente la cantidad de jugadores: ");
                    cantJugadores=j.nextInt();
                }
                for (i=0;i<cantJugadores;i++){//ingresa el símbolo el jugador para aparecer en pantalla
                    System.out.print("Ingrese símbolo jugador: "+(i+1)+" (no pueden ser iguales para todos los jugadores): ");
                    sim=a.next();
                    simb[i]=sim;
                     if((simb[i].equals("$"))){
                            System.out.println("Ingrese de nuevo el símbolo ");
                            sim=a.next();
                            simb[i]=sim;
                                }
                    for (k=0; k<i; k++){
                        if(simb[i].equals(simb[k])){
                            System.out.println("Ingrese de nuevo el símbolo ");
                            sim=a.next();
                            simb[i]=sim;
                        }
                    }
                }
                }
                if((Dificultad.r).equals("D")){//según la dificultad(difícil) aparecerá esta condición
                    System.out.println("LA CANTIDAD DE JUGADORES ES DE (2-4)");
                System.out.print("Ingrese la cantidad de jugadores: ");
                cantJugadores=j.nextInt();//cantidad de jugadores establecidos según la dificultad
                if(cantJugadores<2){
                    System.out.println("La cantidad de jugadores no es permitido debe haber al menos 2");
                    System.out.println("Ingrese nuevamente la cantidad de jugadores: ");
                    cantJugadores=j.nextInt();
                }
                if(cantJugadores>4){
                    System.out.println("La cantidad de jugadores no debe ser mayor a 4");
                    System.out.print("Ingrese nuevamente la cantidad de jugadores: ");
                    cantJugadores=j.nextInt();
                }
                for (i=0;i<cantJugadores;i++){//ingresa el símbolo el jugador
                    System.out.print("Ingrese símbolo jugador: "+(i+1)+" (no pueden ser iguales para todos los jugadores): ");
                    sim=a.next();
                    simb[i]=sim;
                     if((simb[i].equals("$"))){
                            System.out.println("Ingrese de nuevo el símbolo ");
                            sim=a.next();
                            simb[i]=sim;
                                }
                    for (k=0; k<i; k++){
                        if(simb[i].equals(simb[k])){
                            System.out.println("Ingrese de nuevo el símbolo ");
                            sim=a.next();
                            simb[i]=sim;
                        }
                        if((simb[i].equals("$"))){
                            System.out.println("Ingrese de nuevo el símbolo ");
                            sim=a.next();
                            simb[i]=sim;
                                }
                    }
                }
                }
                System.out.println("AHORA DEBERÁ INGRESAR A SUBIDAS Y BAJONES DEL MENÚ SIGUIENTE");
                System.out.println(" ");
                break;
            case 2:
                System.out.println("PARA ELEGIR ESTA OPCIÓN ANTES TUVO QUE HABER INGRESADO EL NIVEL DE DIFICULTAD");
                if ((Dificultad.r).equals("F")){
                    System.out.println("Ingrese las subidas para este rango (5-10)");
                    System.out.println("Ingrese subidas: ");
                    s=l.nextInt();//DETERMINA LAS SUBIDAS EN LAS ESCALERAS
                    System.out.println("Ingrese bajadas: ");
                    b=m.nextInt(); //DETERMINA LAS BAJADAS EN LAS ESCALERAS
                    if(s<5&&s>10){
                        System.out.print("La subida no se encuentra en el rango ingrese de nuevo: ");
                        s=l.nextInt();
                    }
                        if(b<5&&b>10){
                        System.out.print("La bajada no se encuentra en el rango ingrese de nuevo: ");
                         b=m.nextInt(); 
                    }
                }
                else if ((Dificultad.r).equals("D")){
                    System.out.println("Ingrese las subidas para este rango (20-40)");
                    System.out.println("Ingrese subidas: ");
                    s=l.nextInt();//DETERMINA LAS SUBIDAS DE EN LAS ESCALERAS
                    System.out.println("Ingrese bajadas: ");
                    b=m.nextInt();//DETERMINA LAS BAJADAS EN LAS ESCALERAS
                    if(s<20&&s>40){
                        System.out.print("La subida no se encuentra en el rango ingrese de nuevo: ");
                        s=l.nextInt();
                    } 
                        if(b<20&&b>40){
                        System.out.print("La bajada no se encuentra en el rango ingrese de nuevo: ");
                         b=m.nextInt(); 
                    }
                }
                    IPC1Practica1_201700670 entrado= new IPC1Practica1_201700670();//regresará al menú principal
               entrado.main(args);
                
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
