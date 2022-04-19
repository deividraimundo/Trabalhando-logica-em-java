
package dowhile;
import java.util.Scanner;
public class AprendendoFor {
public static void main (String[]args){
Scanner leia = new Scanner(System.in);
   
        int n;
        int i;
        int contPar = 0, somaPar = 0;
 
        for (i = 0; i < 5; i++) {
            System.out.println(i + " Digite um número");
            n = leia.nextInt();

            //item d
            if(n%2 == 0){
               contPar = contPar + 1;
               somaPar = somaPar + n;
            }

        }

        System.out.println("cont " + contPar);
        System.out.println("soma " + somaPar);
        System.out.println("");
    }
}
