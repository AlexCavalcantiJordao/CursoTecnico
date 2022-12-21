package ControleDeFluxo;

import java.util.Scanner;

public class Maior {

    // 3) Escreva um algoritmo que determina o maior também
    
public static void main (String [] args) {
       Scanner sc = new Scanner (System.in);
	Scanner in = new Scanner(System.in);
	int a = 0, maior = 0;

	for(int x = 0; x < 1; x++){
		
		System.out.println("Insira um valor:");
		a = in.nextInt();
		
		if(x == 0){
			
			maior = a;
		
		}
		
		if(a > maior){
			
			maior = a;
		}
		
		System.out.print("Maior: "+ maior);
                
                
                }
        }
}