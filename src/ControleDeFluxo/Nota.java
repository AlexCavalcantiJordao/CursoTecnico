package ControleDeFluxo;
        
import java.util.Scanner;

public class Nota {
    
    /*
    5) Crie um programa que recebe uma nota ( pela classe Scanner) e checa se você passou direto, ficou de recuperação ou foi reprovado na matéria.
    (A regra é a seguinte:
    Nota 7 ou mais: passou direto
    Entre 5 e 7: tem direito de fazer uma prova de recuperação
    Abaixo de 5: reprovado direto).

    */
    

    public static void main(String args[]) {
        
    Scanner nota = new Scanner(System.in);
    float n1, n2, n3, n4, media;
    System.out.print("Entre com a nota do primeiro BI: ");
    n1 = nota.nextFloat();
    System.out.print("Entre com a nota do segundo BI:" );
    n2 = nota.nextFloat();
    System.out.print("Entre com a nota do terceiro BI: ");
    n3 = nota.nextFloat();
    System.out.print("Entre com a nota do quarto BI: ");
    n4 = nota.nextFloat();
    media = (n1+n2+n3+n4)/2;
    if(media >= 5)
    {
    System.out.print(" Voce foi APROVADO. ");
    }
    else
    {
    System.out.print(" Voce foi RECUPERAÇAO. ");
    
    }
    System.out.print(" Voce esta REPROVADO. ");
    
    System.out.print(" A media final e de : " + media + " pontos.");
   
            }
    }