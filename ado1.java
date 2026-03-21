package ado;

import java.util.Scanner;

		public class ado1 {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				        float valor,desconto20,desconto15,res20,res15;

				        Scanner ler = new Scanner(System.in);

				        System.out.println("\nEntre com o valor do produto: ");
				        valor = ler.nextFloat();

				        desconto15 = valor*15/100;
				        res15 = valor-desconto15;
				        desconto20 = valor*20/100;
				        res20 = valor-desconto20;

				        if(valor>=300) {
				        	System.out.println("\nVocê conseguiu 20% de desconto com o valor do produto:");
				            System.out.println("\nO valor descontado foi...R$" +desconto20);
				            System.out.println("\nO valor final com o desconto foi...R$" +res20);  
				        }else if(valor<300) {
				        	System.out.println("\nVocê conseguiu 15% de desconto com o valor do produto:");
				        	System.out.println("\nO valor descontado foi...R$" +desconto15);
				        	System.out.println("\nO valor final com o desconto foi...R$" +res15);  
				        }else{
				        	System.out.println("\nO valor está errado, tente novamente");
				      
				        	
				        }
			}

		}

	