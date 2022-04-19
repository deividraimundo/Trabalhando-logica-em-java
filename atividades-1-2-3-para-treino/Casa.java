
public class Casa {
    String cor;
    String s;
    
    Porta p1 = new Porta();
    Porta p2 = new Porta();
    Porta p3 = new Porta();
    
    void pinta(){
        this.cor = this.s;
    }
    int quantasPortasEstaoAbertas(){
        int quantidade = 0;
        if(p1.aberta == true){
            quantidade = quantidade + 1;
        }
        if(p2.aberta == true){
            quantidade = quantidade + 1;
        }
        if(p3.aberta == true){
            quantidade = quantidade + 1;
        }
        return quantidade;
    }
}

