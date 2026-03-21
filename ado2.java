package ado;

import java.util.Scanner;

public class ado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner(System.in);
		int ano;
		
		System.out.print("\nEntre com um ano de quatro digitos...");
		ano = ler.nextInt();
		
		
		if(ano % 4 == 0) {
			System.out.println("\nO ano..." +ano+ "\né bissexto");
		}else {
			System.out.println("\nO ano..." +ano+ "\nnão é bissexto");
			
	   }
	}
}
