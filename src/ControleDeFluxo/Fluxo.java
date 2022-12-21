package ControleDeFluxo;

public class Fluxo {
    
    public static void main(String[] args){
        // Idade < 15 categoria infantil 
        // Idade >= 15 && Idade < 19 juvenil
        // Idade >= 18 adulto
        
        int idade = 18;
        String categoria;
        
        if(idade < 15){
            categoria = "Infantil";
        }else if (idade >= 15 && idade < 18){
            categoria = "Juvenil";
        }else{
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}