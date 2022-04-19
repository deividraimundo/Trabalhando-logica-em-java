
package aula.pkg3.exercicio.pkg1;

public class Teste {
    public static void main(String[] args) {
        Conta minhaconta = new Conta();
        minhaconta.saldo=2000;
        minhaconta.deposita(100);
        minhaconta.saca(200);
       
        System.out.println(minhaconta.saldo);
        
    }
    
}
