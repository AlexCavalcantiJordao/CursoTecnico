package ControleDeFluxo;

import java.util.Scanner;

public class MaiorOuMenor {

// 1)Faça um programa que receba três inteiros e diga qual deles é o maior e qual o menor.

public static void main(String [] args) {

    Scanner sc = new Scanner (System.in);
	Scanner in = new Scanner(System.in);
	int a = 0, maior = 0, menor = 0;

	for(int x = 0; x < 3;  x++) {
		
		System.out.println("Insira um valor:");
		a = in.nextInt();
		
		if(x == 0){
			
			maior = a;
			menor = a;
		}
		
		if(a > maior){
			
			maior = a;
		}
		
		if(a < menor){
			
			menor = a;
		System.out.print("Maior: "+ maior +". Menor: "+ menor);
                
                
	}
        }
}
	

}
