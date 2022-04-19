
package pkgfor;
import java.util.Scanner;
public class For {
    public static void main(String[] args) {
    Scanner leia =  new Scanner(System.in);
    
            //entrada de dados
        double salario;
        int numFil;

        //processamento e saída
        //item a
        double mediaSal, somaSal = 0;
        //item b
        double mediaFil;
        int somaFil = 0;
        //item c
        double maior = 123;
        //item d
        int cont1000 = 0;
        double perc1000;
 
        for (int i = 0; i < 5; i++) {
            //entrada de dados
            System.out.print("Digite o salário: ");
            salario = leia.nextDouble();
            System.out.print("Digite o número de filhos: ");
            numFil = leia.nextInt();

            //processamento
            //item a
            somaSal = somaSal + salario;

            //item b
            somaFil = somaFil + numFil;

            //item c
            if(i == 0){
                maior = salario;
            } 

            if(salario > maior){
                maior = salario;
            }

            if(salario <= 1000){
                cont1000 = cont1000 + 1;
            }            
        }

        //processamento e saídas
        //item a
        mediaSal = somaSal / 5;
        System.out.println("Média de salários: " + mediaSal);

        //item b 
        mediaFil = (double)somaFil / 5;
        System.out.println("Média de número de filhos: " + mediaFil);

        //item c
        System.out.println("O maior salário é: " + maior);

        //item d
        perc1000 = cont1000 / 5.0 * 100;
        System.out.println("A porcentagem de salários até 1000 é: " + perc1000);               
    }
}
 
    

