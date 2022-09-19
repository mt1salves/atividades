package atividade_29_06_marcotulio;

import java.util.Scanner;

public class Programa {
	
	public static void main (String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Carro [] carros = new Carro [10];
        
        for(int i = 0; i < 10; i++) {
        	
	        System.out.println("Insira o código do " + i + "º carro: ");
			long codigo = teclado.nextLong();
			
			System.out.println("O " + i + "º carro está acelerado?: ");
			boolean acelerar = teclado.nextBoolean();
			
			System.out.println("Insira a velocidade máxima do " + i + "º carro: ");
			float velocidadeMax = teclado.nextFloat();
			
			System.out.println("Insira a velocidade atual do " + i + "º carro: ");
			float velocidadeAtual = teclado.nextFloat();
			
			System.out.println("O freio do " + i + "º carro foi acionado? ");
			boolean freioAcionado = teclado.nextBoolean();
			
			System.out.println("O " + i + "º carro está estercado?: ");
			boolean estecar = teclado.nextBoolean();
			
			System.out.println("Insira o ângulo do volante do " + i + "º carro: ");
			float anguloVolante = teclado.nextFloat();
			
			carros[i] = new Carro(codigo, acelerar, freioAcionado, estecar, anguloVolante, velocidadeAtual, velocidadeMax);
        }
        
        teclado.close();
        
        carros[0].imprimir();
        carros[1].imprimir();
		
	}
}
