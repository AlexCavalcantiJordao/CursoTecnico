package TiposDeOperadores;

public class OperadoresDeAtribuicao {

    public static void main(String[] args) {
        
        // -, -=, +=, *=, /=
        
        int salario = 1000;
        int numero = 11;
        // salario = salario + 1000;
        salario += 1000;
        numero %= 2;
        numero = numero % 2;
        System.out.println(numero);
    }
}