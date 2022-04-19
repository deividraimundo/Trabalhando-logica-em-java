import java.util.Scanner;
public class SwitchCase {
    public static void main (String[] args) {
    Scanner leia = new Scanner (System.in);

int n1, n2;
char operacao;

System.out.println("Digite o num 1");
n1 = leia.nextInt();
System.out.println("Digite o num 2");
n2 = leia.nextInt();
System.out.println("+ somar\n"+
"- subtrair\n"+
"* multiplicar\n"+
"/ dividir");
System.out.println("Digite a opção");
operacao = leia.next().charAt(0);

switch(operacao){
    case '+':
        System.out.println("Soma: " + (n1 + n2));
    break;
    case '-':
        int sub;
            sub = n1 - n2;
            System.out.println("Subtração: " + sub);
            if(sub < 0){
            System.out.println("O segundo é maior");
    }
//segunda maneira sem a variável sub
            System.out.println("Subtração: " + (n1 - n2));
            if(n2 > n1){
            System.out.println("O segundo é maior");
    }
    break;
}
}
}
    
    

