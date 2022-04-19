
public class Porta {
    boolean aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;
    String s;
    
    void abre(){
        this.aberta = true;
    }
    void fecha(){
        this.aberta = false;
    }
    void pinta(){
        this.cor = this.s;
    }
    boolean estaAberta(){
        if(this.aberta==true){
            return true;
        } else{
            return false;
        }
    }
}
