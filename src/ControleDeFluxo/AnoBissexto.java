package ControleDeFluxo;

import java.text.DateFormat;
import java.util.Scanner;
import java.util.Date;

public class AnoBissexto{

    
    // 4) Faça um programa que informe se um ano é bissexto ou não.
// Obs : Um ano é bissexto se ele for divisivel por 400 ou se ele for divisivel por 4 e não por 100.

    
public static void main(String [] args) {
    Object date = 0;
   String dStr = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);
    
        Scanner ent =  new  Scanner ( System . in);
        int ano ;
        
        System.out. println ( " Digite um ano para saber se é bissexto : " );
        ano = ent . nextInt ();
        
        // se o ano para maior que 400
        if (ano %  400  ==  0 ) {
            System.out. println (ano +  " é bissexto. " );
        // se o ano para menor que 400
        System.out.println ((ano %  4  ==  0 ) && (ano %  100  !=  0 ));
             System.out.println (ano +  " é bissexto. " );
        }else {
            System.out.println (ano +  " não é bissexto " );
        }
    }
}
