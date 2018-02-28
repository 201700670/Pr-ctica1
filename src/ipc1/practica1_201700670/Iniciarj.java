
package ipc1.practica1_201700670;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Andrea Palomo
 */
public class Iniciarj {
    Random jugador=new Random();
    public void Iniciarj(String[] args) {
        Scanner da=new Scanner(System.in);
        int ran;
        String res;
        System.out.println("BIENVENIDO AL JUEGO DE SUBIDAS Y BAJADAS");
           System.out.println("");
        System.out.println("AVISO!!!!PARA ESTA SECCIÓN TUVO QUE HABER INGRESADO LOS DATOS EN DIFICULTAD Y PARÁMETROS");
        System.out.println("");
            if ((Dificultad.r).equals("F")){
            System.out.println("La cantidad de jugadores son: "+(Parametros.jugadores));
            if((Parametros.jugadores)==1){
                System.out.println("El jugador número 1");
            }
            else if((Parametros.jugadores)==2){
                System.out.println("Jugador número 2");
            }
            else if((Parametros.jugadores)==3){
                System.out.println("Jugador número 3");
            }
            else if((Parametros.jugadores)==4){
                
            }
            }
    }
}
