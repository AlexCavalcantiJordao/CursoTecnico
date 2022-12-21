package ControleDeFluxo;
    
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Nascimento {

    /*
    6)  Escreva um programa para ler o ano de nascimento de uma pessoa e    
    escrever uma mensagem que diga se ela poderá ou não votar este ano    
    (não é necessário considerar o    mês    em    que    ela    nasceu).
    */
    
    public static void main(String[] args) {

Calendar cal = GregorianCalendar.getInstance();
int anoAtual = cal.get(Calendar.YEAR);
Scanner in = new Scanner(System.in);
System.out.println("Ano em que você nasceu : ");
int anoNasc = in.nextInt();
System.out.println("Voce tem : " + (anoAtual - anoNasc) + " anos.");
}
}