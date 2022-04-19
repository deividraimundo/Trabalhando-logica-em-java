import java.util.Scanner;

public class Vendedores {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        String nome[] = {"Ivo", "Iumi", "Alan", "Ian", "Bia", "Gil"};
        double salarioBase[] = {1500.00, 2500.00, 1000.00, 3500.00, 3000.00, 2000.00};
        double valorVenda[] = {7000.00, 8000.00, 6000.00, 10000.00, 5000.00, 9000.00};
        double valorMedio = 0;
        double valorTotalMedio = 0;
        double porcVendedores = 0;
        double totalVendedores = 0;
        double maior = 0;
        String nomeMaior = "";
        double salario = 0;
       
        System.out.printf("%15s %15s %15s\n", "Nome", "Salário base", "Valor da venda");
        for (int i = 0; i < 6; i++) {
            System.out.printf("%15s %15.2f %15.2f\n", nome[i], salarioBase[i], valorVenda[i]);
            
            valorMedio = valorMedio + valorVenda[i];
            
            if (salarioBase[i]<2000){
                totalVendedores = totalVendedores + 1;
            }
            
            if (valorVenda[i] > maior){
                maior = valorVenda[i];
                nomeMaior = nome[i];
                salario = salarioBase[i];
            }
        }
        
        valorTotalMedio = valorMedio / 6;
        System.out.println("Valor médio das vendas: " + valorTotalMedio);
        
        System.out.println(totalVendedores);
        porcVendedores = (totalVendedores / 6) * 100;
        System.out.println("Porcentagem de vendedores que ganham menos que 2000: " + porcVendedores);
        
        System.out.println("Nome do melhor vendedor: " + nomeMaior);
        System.out.println("Salário do melhor vendedor: " + salario);
        
    }
    
}
