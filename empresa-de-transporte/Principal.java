public class Principal {

    public static void main(String[] args) {
        
        Veiculo veiculo[] = new Veiculo[5];
        Motoristas motoristas[] = new Motoristas[3];
        Movimentacao movimentacao[]  = new Movimentacao[10];
        
        String placa[] = {"123ADS", "456ASD"};
        String cpf[] = {"456789123", "123456789"};
        String nomeMotorista[] = {"Carlos", "Alberto"};
        
        for (int i = 0; i < 5; i++) {
            veiculo[i].placa = placa[i];
            motoristas[i].cpf = cpf[i];
            movimentacao[i].nomeMotorista = nomeMotorista[i];
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println(veiculo[i].chassi, "  ", veiculo[i].placa, "  ", veiculo[i].marca);
        }
    }    
}