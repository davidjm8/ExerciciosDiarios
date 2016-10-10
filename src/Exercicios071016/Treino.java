package Exercicios071016;

import java.util.Random;
import java.util.Scanner;

public class Treino {
	public Treino(){
		exercicio2();
		
	}
	
	private void exercicio1() {
		int num1 = (new Scanner(System.in)).nextInt(); 
		int num2 = (new Scanner(System.in)).nextInt(); 
		
		if (num1 > num2) {
			System.out.println("O numero 1 eh o maior");
			
		} else {
			System.out.println("O numero 2 eh o maior");
			
		}
	}
	
	private void exercicio2() {
		System.out.println("Introduza o numero 1");
		int num1 = (new Scanner(System.in)).nextInt(); 
		System.out.println("Introduza o numero 2");
		int num2 = (new Scanner(System.in)).nextInt();
		System.out.println("Introduza o numero 3");
		int num3 = (new Scanner(System.in)).nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("O numero 1 eh o maior");
		} else if (num2 > num1 && num2 > num3 )
				System.out.println("O numero 2 eh o maior");
		else if (num3 > num1 && num3 > num2)
			System.out.println("O numero 3 eh o maior");
			
		}
	
	private void exercicio3() {
		int limite = 5;
		int rand = (new Random()).nextInt(5) + 1;
		
		for (int i=0; i<5; i++) {
			System.out.println("introduza a " + (i+1) + "tentativa");
			int tent = ((new Scanner (System.in)).nextInt());
			
			if (tent == rand) {
			System.out.println("Acertou à "+ (i+1) + "tentativa");
			return;
			} else 
				System.out.println("Vá tentando que estou estou gostando ");
		}
		System.out.println("Tens 5 tentativas para acertares num n de 1 a 5 e falhas  ");
	
	}
}

