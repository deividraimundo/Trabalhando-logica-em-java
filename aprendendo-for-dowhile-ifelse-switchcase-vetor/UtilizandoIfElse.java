
package dowhile;
import java.util.Scanner;
public class UtilizandoIfElse {
 public static void main (String[] args){
 Scanner leia = new Scanner(System.in); 

    int n1, n2, n3, n4;
    
    System.out.println("Digite os 4 números");
    n1 = leia.nextInt();
    n2 = leia.nextInt();
    n3 = leia.nextInt();
    n4 = leia.nextInt();
    
    if(n1 > n2){
        if(n1 > n3){
            if(n1 > n4){
                System.out.println(n1 + " é maior");
            } else{
                System.out.println(n4 + " é maior");
            }
        } else if(n3 > n4){
                System.out.println(n3 + " é maior");
            } else {
                System.out.println(n4 + " é maior");
                }
    } else if(n2 > n3){
        if(n2 > n4){
            System.out.println(n2 + " é maior");
        } else{
            System.out.println(n4 + " é maior");
        }
    } else if(n3 > n4){
        System.out.println(n3 + " é maior");
        } else {
            System.out.println(n4 + " é maior");
        }
}
} 

