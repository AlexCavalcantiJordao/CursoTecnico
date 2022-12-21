package TiposPrimitivosReais;

public class Continue {
    
    public static void main(String[] args){
        
        for (int i = 0; i <= 50; i++) {
            if ((i % 2) == 1) 
                continue;
            System.out.println(" " + i);
        }
    }
}