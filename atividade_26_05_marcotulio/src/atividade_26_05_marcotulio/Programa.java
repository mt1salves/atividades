package atividade_26_05_marcotulio;

public class Programa {
	
	public static void main (String[] args) {
		Data D1 = new Data();
		Data D2 = new Data(26, 05, 2022);
		D1.mostra();
		D2.mostra();
		System.out.println(D2.ano);
	}
}
