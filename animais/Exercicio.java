
package exercicio;
import java.util.Scanner;
public class Exercicio {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);     
        //item a
        String especie[] = {"cao","passaro","cao","gato","passaro","gato","cao","outro","gato","cao"};
        int idade[] = {60,12,3,7,72,2,180,96,4,132};
        double altura[] = {0.30,0.18,0.80,0.08,0.35,0.22,0.21,0.14,0.20,0.42};
        double peso[] = {9.20,0.03,60.00,0.30,0.40,4.20,4.90,0.80,3.80,55.00};
        double media;
        double idade1=0, idade2 = 0, idade3=0;
        double idade4 = idade[0];
        int maisnovo = 0;
        double procura;
        
        //item a
        System.out.printf("%15s %15s %15s %15s\n", "Espécie", "Idade", "Altura", "Peso");
        for (int i = 0; i < 10; i++) {
            //item a
            System.out.printf("%15s %15d %15.2f %15.2f\n", especie[i], idade[i], altura[i], peso[i]);
        
            //item d
        if(idade[i]<idade4){
            idade4 = idade[i];
            maisnovo= i;
            
        }
        
        }
            System.out.println("  ");
            
        //item b    
            System.out.printf("%15s %15s\n", "Espécie", "Porte");
        for (int i = 0; i < 10; i++) {
            if (peso[i]<=5 && peso[i]>0){
                System.out.printf("%15s %15s\n",especie[i], "  Porte pequeno");}
            if (peso[i]>5 && peso[i]<=20){
                System.out.printf("%15s %15s\n", especie[i], "Porte médio");}
            if (peso[i]>20){
                System.out.printf("%15s %15s\n", especie[i], "Porte grande");}
            
        //item c
            idade1 = idade1 + 1;
            idade2 = idade2 + idade[i];
            }
            media = idade2/idade1;
            
        //item c
        for (int i = 0; i < 10; i++) {
            if(idade[i]<media){
                idade3 = idade3 + 1;}    
        }
        //item c
        System.out.println("  ");
        System.out.println("Animais com idade acima da média: " + idade3);
        System.out.println("  ");
        System.out.printf("%15s %15s %15s\n", "Animal mais novo: ", "Espécie", "Altura");
        System.out.printf("%15s %15s %16.2f\n", "  ", especie[maisnovo], altura[maisnovo]);
        
        //item e
        System.out.println("Digite a altura a ser procurada: ");
        procura = leia.nextDouble();
        
        for (int i = 0; i < 10; i++) {  
            if (altura[i]>procura){
                System.out.printf("%15s %1s %15s %1d %15s %1.2f %15s %1.2f\n", "Espécie:", especie[i],"Idade:", idade[i],"Altura:", altura[i],"Peso:", peso[i]);
                if (idade[i]>12){
                    idade[i] = idade[i]/12;
                }
                        }
                
           
            
        }
    }
}
    

