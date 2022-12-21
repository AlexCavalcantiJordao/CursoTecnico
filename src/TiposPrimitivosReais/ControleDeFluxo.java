package TiposPrimitivosReais;

public class ControleDeFluxo {
    
    public static void main(String[] args){
        
        int x = 0;
        for (int i = 0; i < 10; i++) {
            x = i;
            if (i > 5)
                break;
            System.out.println("O ultimo valor de i foi " + x);
        } 
    }
}