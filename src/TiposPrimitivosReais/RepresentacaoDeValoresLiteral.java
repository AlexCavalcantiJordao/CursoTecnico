package TiposPrimitivosReais;

public class RepresentacaoDeValoresLiteral {
    
    public static void main(String[] args){
        
        // Especificando o tipo de literal.
        int i = 10;
        long l = 10;
        float f = 10.0f;
        double d = 10.0;
        
        // Número longos(java 7)
        int bilhao = 1_000_000_000;
        
        // Representação em diferentes bases (binário - java 7).
        int binario = 0b0001_0000;
        int octal = 020;
        int decimal = 16;
        int hexa = 0x10;
        
        System.out.println(binario +", "+ octal +", "+ decimal +", "+ hexa); // 16,16,16, 16
    }
}