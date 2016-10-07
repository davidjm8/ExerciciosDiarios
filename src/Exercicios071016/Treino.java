package Exercicios071016;

import java.util.Scanner;

public class Treino {
	public Treino(){
		exercicio1();
		
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

}
