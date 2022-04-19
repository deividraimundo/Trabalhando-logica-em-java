
public class NovoCarro {
     public static void main(String[] args) {
         Carro novocarro = new Carro();
         
         novocarro.cor=("verde");
         novocarro.modelo=("Fusca");
         novocarro.velocidadeAtual=(0);
         novocarro.velocidadeMaxima=(80);
         novocarro.liga();
         novocarro.acelera(20);
         System.out.println(novocarro.velocidadeAtual);     
     }
}
