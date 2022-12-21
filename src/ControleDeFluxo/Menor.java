package ControleDeFluxo;

import java.util.Scanner ;

public class Menor {
    
    // 2 ) Escreva um programa em Java que leia dois números inteiros e determine qual é o menor.
    
    public static void main (String [] args) {
        Scanner sc = new Scanner (System.in);
            
	int a = 0, menor = 0;

	for(int x = 0; x < 1; x++){
		
		System.out.println("Insira um valor:");
		a = sc.nextInt();
		
		if(x == 0){
		
			menor = a;
		
                        System.out.print(" Menor : "+ menor);
		if(a < menor){
			
			menor = a;

    }
                    else {
                    System.out.println("Insira um valor:");
		a = sc.nextInt();
		
		if(x == 0) {
		
			menor = a;
		System.out.print(" Menor : "+ menor);
                
		if(a < menor){
			
			menor = a;
                }
        }
        
}
}
        }
    }
}