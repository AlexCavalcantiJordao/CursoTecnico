package TiposPrimitivosReais;

public class Tipos_Primitivos {
    
    /*
    Criar um programa em Java que contenha todos os tipos (primitivos) estudados bem como todas as operações entre eles.
    
    Conhecer os tipos primitivos, seus tamanhos em memória e usos, bem como os operadores em Java.
    
    TIPOS E OPERADORES
    EM JAVA
    TIPOS PRIMITIVOS,
    CONVENÇÕES DE
    CÓDIGO E
    COMENTÁRIOS
    OPERADOR RESTO E
    OPERADORES DE
    COMPARAÇÃO
    OPERADORES
    LÓGICOS
    OPERADORES DE
    ATRIBUIÇÃO
    
    */
    
    public static void main(String[] args){
        
        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'A';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807l;
        boolean tipoBooleano = true;
        
        System.out.println("Tipo do tipoByte : "+tipoByte);
        System.out.println("Tipo do tipoShort : "+tipoShort);
        System.out.println("Tipo do tipoChar : "+tipoChar);
        System.out.println("Tipo do tipoFloat : "+tipoFloat);
        System.out.println("Tipo do tipoDouble : "+tipoDouble);
        System.out.println("Tipo do tipoInt : "+tipoInt);
        System.out.println("Tipo do tipoLong : "+tipoLong);
        System.out.println("Tipo do tipoBooleano : "+tipoBooleano);
        
    }
}