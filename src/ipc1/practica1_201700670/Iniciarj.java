
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
        matriz= new String [5][8];
        Scanner da=new Scanner(System.in);
        int ran;
        Random mialeatorio=new Random();
        int dado=1+mialeatorio.nextInt(6);
        int dado2=1+mialeatorio.nextInt(12);
        String res;
        System.out.println("BIENVENIDO AL JUEGO DE SUBIDAS Y BAJADAS");
           System.out.println("");
        System.out.println("AVISO!!!!PARA ESTA SECCIÓN TUVO QUE HABER INGRESADO LOS DATOS EN DIFICULTAD Y PARÁMETROS");
        System.out.println("");
        System.out.println("¿Ya ingresó los datos de dificultad y parámetros (Responder Sí=s 'ó' No=n?: ");
        res=da.next();
        do{
            if ((Dificultad.r).equals("F")){
            System.out.println("La cantidad de jugadores son: "+(Parametros.cantJugadores));
                  System.out.print("El número del dado es: "+dado);
                  for(int i = 0; i<5; i++){
                      for(int j=0;j<8;j++){
                          matriz[0][0]="$";
                         matriz[i][j]=" ";
                         matriz[4][7]=Parametros.simb[0];
                         matriz[4][7]=Parametros.simb[1];
                         matriz[4][7]=Parametros.simb[2];
                      }
                 }
                     matriz[0][0]="$";
                 System.out.println("");
                 for(int i = 0; i>5; i--){
                     for(int j=0;j<8;j--){
                         if(matriz[j].equals(matriz[i])){
//                             matriz[i][j+dado]=Parametros.simb[j];
                         }
                     }
                 }
            for(int p = 0; p<5; p++){
            for(int o = 0; o<8; o++){
                System.out.print("\t| "+matriz[p][o]+" |");//aparecerán los datos ingresados
            }
                System.out.println("");
          } 
                 }
            if ((Dificultad.r).equals("D")){
            System.out.println("La cantidad de jugadores son: "+(Parametros.cantJugadores));
                  System.out.print("El número del dado es: "+dado);
                  for(int i = 0; i<20; i++){
                      for(int j=0;j<10;j++){
                          matriz[0][0]="$";
                         matriz[i][j]=" ";
                         matriz[19][9]=Parametros.simb[0];
                         matriz[19][9]=Parametros.simb[1];
                         matriz[19][9]=Parametros.simb[2];
                         matriz[19][9]=Parametros.simb[3];
                      }
                 }
                     matriz[0][0]="$";
                 System.out.println("");
                 for(int i = 0; i>5; i--){
                     for(int j=0;j<8;j--){
                         if(matriz[j].equals(matriz[i])){
//                             matriz[i][j+dado]=Parametros.simb[j];
                         }
                     }
                 }
            for(int p = 0; p<5; p++){
            for(int o = 0; o<8; o++){
                System.out.print("\t| "+matriz[p][o]+" |");//aparecerán los datos ingresados
            }
                System.out.println("");
          } 
                 }
             }while(res.equals("S"));
    }
    
}
