package ControleDeFluxo;

public class Intervalo {

    
    /*
    8)  Faça um programa que mostre a soma de todos os números no intervalo de 1 até 100.
    */
    
public static void main (String [] args) {
    
//Soma de 1 à 100
    int soma = 0;

        System.out.print("A soma dos 100 primeiros números é: ");
        for(int i = 1; i<=100; i++)
            soma += i;
            //soma = soma + i
        System.out.println(soma);

        System.out.print("A soma utilizando a instrução WHILE: ");
        int soma2 = 0, i2 = 0;
        while(i2<=100){
            soma2+=i2;
            i2++;
            //soma2 = soma2 + i2;
        }
        System.out.println(soma2);
    }
}