package atividade_26_05_marcotulio;

public class Data {
	
	private int dia;
	private int mes;
	public int ano;
	
	public Data() {
		this.dia = 26;
		this.mes = 05;
		this.ano = 2022;
	}
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public void mostra(){
		System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
	}
}