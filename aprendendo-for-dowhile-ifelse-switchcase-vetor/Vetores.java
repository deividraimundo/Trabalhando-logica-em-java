
package vetores;
public class Vetores {
    public static void main(String[] args) {
        
       String nome[] = {"Bia", "Ivo","Luis", "Leo", "Rui", "Ana"};

 

double nota1[] = {10, 9, 4.6, 8, 1, 2};
double nota2[] = {9, 8, 10, 6, 2, 6};
double media[] = new double[6];
String situacao[] = new String[6];

for(int i=0; i<6; i++){
media[i] = (nota1[i] + nota2[i])/2;
if(media[i] >= 5){
situacao[i] = "Aprovado";
} else {
situacao[i] = "Reprovado";
} 
}
//saídas

for(int i=0; i<6; i++){
System.out.println(nome[i] + " " + nota1[i] + " " + nota2[i] + " " + media[i] + " " + situacao[i]);
}
}
    
}

        

    

