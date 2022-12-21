package TiposPrimitivosReais;

public class PontoFlutuante {
    
    public static void main(String[] args){
        
        // A separação decimal é feito com "."
        float f = 1.0f / 3.0f;
        double d = 0.1e1 / 3.; // 0.1e1 = 0,1 x 10¹
        
        // Note a diferença na precisão.
        System.out.println(f); // 0.33333334
        System.out.println(d); // 0.3333333333333333
    }
}