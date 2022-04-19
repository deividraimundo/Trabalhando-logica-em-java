
package vetorr;
import java.util.Scanner;
public class Vetorr {
  
     public static void main(String[] args) {
     Scanner leia = new Scanner(System.in);
        
        String descricao[] = {"caneta", "lapis", "caderno", "borracha", "regua", "apontador"};
        int qtdEstoque[] = {50, 25, 10, 20, 20, 60};
        double precoUnit[] = {2.00, 1.00, 10.00, 3.00, 4.00, 5.00};
        
        //item b
        int cont = 0;
        double somaPreco = 0, mediaPreco;
        
        //item c
        double menor = precoUnit[0];// inicializa com o primeiro elemento do vetor
        String prodMaisBarato = descricao[0];
        
        //item d
        int cont30 = 0;
        double perc;

 

        // tipo     tag     para escolher a largura da coluna, por exemplo 10
        // String   %s      %10s
        // char     %c      %10c
        // int      %d      %10d     d de decimal (base decimal)
        // double   %f      %10f     f de floating point
        // double   %.2f    %10.2f   escolhe quantas casa decimais exibir
        // float é o mesmo que o double
        
        System.out.printf("%10s %10s %10s\n", "Descrição", "Qtdestoque", "preço unit");
        
        for (int i = 0; i < 6; i++) {
            //item a
            System.out.printf("%10s %10d %10.2f\n", descricao[i], qtdEstoque[i], precoUnit[i]);
            
            //item b
            cont = cont + 1;
            somaPreco = somaPreco + precoUnit[i];
            
            //item c            
            if(precoUnit[i] < menor){
               menor = precoUnit[i];// atualiza o menor
               prodMaisBarato = descricao[i];//atualização
            }
            
            //item d
            if(qtdEstoque[i] < 30){
                cont30 = cont30 + 1;
            }
        }
        System.out.println("");
        
        //item b
        mediaPreco = somaPreco / cont;
        System.out.printf("Media: R$ %.2f\n", mediaPreco);
        
        //item c
        System.out.println("Produto mais barato: " + prodMaisBarato);
        System.out.println("Seu preço unitário: " + menor);
        
        //item d
        perc = cont30 / 6.0 * 100;//observe a divisão de inteiros
        System.out.println("Perc abaixo de 30: " + perc + "%");
        //System.out.printf("Perc abaixo de 30: %.1f%%\n", perc);
        
        //item e
        String prod;
        System.out.println("Digite o produto");
        prod = leia.next();

        for (int i = 0; i < 6; i++) {
            if(prod.equals(descricao[i])){
                System.out.println("Qtd estoque: " + qtdEstoque[i]);
                System.out.println("Preço unit: " + precoUnit[i]);
            }
        }
     }
}
    

