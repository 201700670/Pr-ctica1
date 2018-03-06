
package ipc1.practica1_201700670;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Andrea Palomo
 */
public class Iniciarj {
    Random aleatorio;//ESTA VARIABLE SE UTILIZA PARA DETERMINAR UN NÚMERO ALEATORIO
     String matriz [] [];//COLOCA UNA MATRIZ TIPO STRING
     String matriz1 [] [];
    public void Iniciarj(String[] args) {
        matriz= new String [5][8];//determina el tamaño de la matriz
        matriz1= new String [20][10];//determina el tamaño de la matriz
        Scanner da=new Scanner(System.in);//para ingresar un dato
        int ran;
        Random mialeatorio=new Random();//CREA UNA VARIABLE PARA EL ALEATORIO
        int dado=1+mialeatorio.nextInt(6);//VARIABLE DEL DADO EN FÁCIL
        int dado2=1+mialeatorio.nextInt(12);//VARIABLE DEL DADO EN DIFICIL
        String res;
        System.out.println("BIENVENIDO AL JUEGO DE SUBIDAS Y BAJADAS");
           System.out.println("");
        System.out.println("AVISO!!!!PARA ESTA SECCIÓN TUVO QUE HABER INGRESADO LOS DATOS EN DIFICULTAD Y PARÁMETROS");
        System.out.println("");
        System.out.println("¿Ya ingresó los datos de dificultad y parámetros (Responder Sí=s 'ó' No=n?: ");
        res=da.next();//dejará ingresar si seleccionó la dificultad 
        do{
            if ((Dificultad.r).equals("F")){//si la dificultad es fácil
            System.out.println("La cantidad de jugadores son: "+(Parametros.cantJugadores));
                  System.out.print("El número del dado es: "+dado);
                  for(int i = 0; i<5; i++){//se hará la parte interna de la matriz, aún si mostrarla
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
                         if(matriz[j].equals(matriz[i])){;
                         }
                     }
                 }
            for(int p = 0; p<5; p++){
            for(int o = 0; o<8; o++){
                System.out.print("\t| "+matriz[p][o]+" |");//aparecerán los datos ingresados de la matriz
            }
                System.out.println("");
          } 
                 }
            if ((Dificultad.r).equals("D")){
            System.out.println("La cantidad de jugadores son: "+(Parametros.cantJugadores));
                  System.out.print("El número del dado es: "+dado2);
                  for(int i = 0; i<20; i++){//se hará la parte interna de la matriz, aún si mostrarla
                      for(int j=0;j<10;j++){
                          matriz1[0][0]="$";
                         matriz1[i][j]=" ";
                         matriz1[19][9]=Parametros.simb[0];
                         matriz1[19][9]=Parametros.simb[1];
                         matriz1[19][9]=Parametros.simb[2];
                         matriz1[19][9]=Parametros.simb[3];
                      }
                 }
                     matriz1[0][0]="$";
                 System.out.println("");
                 for(int i = 0; i>5; i--){
                     for(int j=0;j<8;j--){
                         if(matriz1[j].equals(matriz1[i])){
//                             matriz[i][j+dado]=Parametros.simb[j];
                         }
                     }
                 }
            for(int p = 0; p<5; p++){
            for(int o = 0; o<8; o++){
                System.out.print("\t| "+matriz1[p][o]+" |");//aparecerán los datos ingresados de la matriz
            }
                System.out.println("");
          } 
                 }
             }while(res.equals("S"));
    }
    
}
