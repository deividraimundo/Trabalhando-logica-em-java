import java.util.Scanner;

public class Papelaria2 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int codPro[] = {123, 112, 122, 234, 223, 233};
        String descricao[] = {"caneta", "régua", "caderno", "borracha", "lápis", "apontador"};
        double precoUnit[] = {5.00, 4.00, 9.00, 2.00, 1.00, 3.00};
        char desconto[] = {'e', 'n', 'n', 'b', 'e', 'n'};
        int prode = 0;
        double prodenca = 0, mediaprod;
        double menor = precoUnit[0];
        String prodbarato = descricao[0];
        String prodcaro = descricao[0];
        double maior = precoUnit[0];
        double dif, valorf = 0, valordoprod = 0;
        int cod = 0, qnt = 0;

        System.out.printf("%15s %15s %15s %15s\n", "Código Produto", "Descrição", "Preço unitário", "Porcentagem desconto");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%15d %15s %15.2f %15c\n", codPro[i], descricao[i], precoUnit[i], desconto[i]);
            if (desconto[i] == 'e') {
                prodenca = prodenca + precoUnit[i];
                prode = prode + 1;
            }
            if (precoUnit[i]< menor){
                menor = precoUnit[i];
                prodbarato = descricao[i];
            }
            if (precoUnit[i]> maior){
                maior = precoUnit[i];
                prodcaro = descricao[i];
            
        }
        }
        mediaprod = prodenca / prode;
        System.out.println("\nMédia de preços unitário encalhados: " + mediaprod);

        dif = maior - menor;
        System.out.println("\nProduto mais barato: " + prodbarato);
        System.out.println("Produto mais caro: " + prodcaro);
        System.out.println("Diferença de preço mais caro/barato: " + dif + " reais");
        
        System.out.println("\nDigite o código do produto: ");
        cod = leia.nextInt();
        System.out.println("Digite a quantidade vendida: ");
        qnt = leia.nextInt();
        
        for (int i = 0; i < 6; i++) {
            if (cod == codPro[i]){
                valordoprod = precoUnit[i] * qnt;
            if (desconto[i] == 'e'){
                valorf = valordoprod - (valordoprod * 0.1);
            }
            if (desconto[i] == 'n'){
                valorf = valordoprod -(valordoprod * 0.05);
            }
            if (desconto[i] == 'b'){
                valorf = valordoprod;
            } 
            }
    }
        System.out.println("\nValor normal do produto: " + valordoprod + " reais");
        System.out.println("Valor final do produto: " + valorf + " reais");
        
        
        
    }

}
