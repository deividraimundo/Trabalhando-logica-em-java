
public class Pessoa {
    String nome= "José";
    int idade = 19;
    
    public int fazAniversario(){
        int id = this.idade++;
        return id;
    }
}
