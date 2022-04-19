//descricao caneta lapis caderno borracha regua apontador
//qtdEstoque 50 40 10 20 20 60
//precoUnit 2.00 1.00 10.00 3.00 4.00 5.00
package papelaria;
public class papelaria {
public static void main(String[] args) {
String descricao[] = {"caneta", "lapis", "caderno", "borracha", "regua", "apontador"};
int Estoque[] = {50, 40, 10, 20, 20, 60};
double precoUnit[] = {2.00, 1.00, 10.00, 3.00, 4.00, 5.00};
  

        // tipo     tag     para escolher a largura da coluna, por exemplo 10
        // String   %s      %10s
        // char     %c      %10c
        // int      %d      %10d     d de decimal (base decimal)
        // double   %f      %10f     f de floating point
        // double   %.2f    %10.2f   escolhe quantas casa decimais exibir
        // float é o mesmo que o double
        
    System.out.printf("%25s %25s %25s\n", "Descição", "Quantidade em estoque", "Preço Unitário");
    
    for (int i = 0; i < 6; i++) {
        System.out.printf("%25s %25d %25.2f\n", descricao[i], Estoque[i], precoUnit[i]);
        
    }
    }
    
}
