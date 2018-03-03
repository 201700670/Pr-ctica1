
package ipc1.practica1_201700670;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Andrea Palomo
 */
public class Iniciarj {
    Random aleatorio;
     String matriz [] [];
     String jugador[][];
     Parametros parametros;
    public void Iniciarj(String[] args) {
        parametros = new Parametros();
        
        Scanner da=new Scanner(System.in);
        int ran;
        String res;
        System.out.println("BIENVENIDO AL JUEGO DE SUBIDAS Y BAJADAS");
           System.out.println("");
        System.out.println("AVISO!!!!PARA ESTA SECCIÓN TUVO QUE HABER INGRESADO LOS DATOS EN DIFICULTAD Y PARÁMETROS");
        System.out.println("");
        System.out.println("¿Ya ingresó los datos de dificultad y parámetros (Responder Sí=s 'ó' No=N?: ");
        res=da.next();
        do{
            if ((Dificultad.r).equals("F")){
            System.out.println("La cantidad de jugadores son: "+(Parametros.cantJugadores));
                for (int i=0;i<Parametros.cantJugadores;i++){
                    System.out.println("Turno de jugador: "+randoms());
                    matriz();
                    generaTabla();
                }
            }
             }while(res.equals("S"));
    }
    public void matriz(){
        if ((Dificultad.r).equals("F")){
            matriz= new String [5][8];
        } else{
                    
                    matriz= new String [20][10];
            }
    }
        public void generaTabla(){
            if ((Dificultad.r).equals("F")){
            for(int i=0;i<5;i++){
                System.out.println("--------------------------------");
                for(int j=0;j<8;j++){
                    System.out.print("|    ");
                }
                System.out.println();
            }
          } 
        }
    public int randoms(){
        if (aleatorio==null)aleatorio=new Random();
        int i= aleatorio.nextInt();
        if (i<1||i>6)return randoms();
        else return i;
    }
    
    public String getTurno(){
        
    }
}
