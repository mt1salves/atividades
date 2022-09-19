package atividade_10_03_marcotulio;

public class App3 {
	static double valorAbsoluto(double absoluto) {
		return Math.abs(absoluto);
	}
    static double decimalBaixo(double decimalbaixo) {
		return Math.floor(decimalbaixo);
	}
    static double decimalAlto(double decimalalto) {
		return Math.ceil(decimalalto);
	}
    static double decimalProximo(double decimalproximo) {
		return Math.rint(decimalproximo);
	}
    static double Arredondamento(double arredondamento) {
		return Math.round(arredondamento);
	}
	
	 public static void main(String[] args) {
		 
		 System.out.println("valor absoluto: ");
		 
		 System.out.println(valorAbsoluto(5.15));
		 System.out.println(valorAbsoluto(10.5));
		 System.out.println(valorAbsoluto(-32.51));
		 System.out.println(valorAbsoluto(-0.1));
		 System.out.println(valorAbsoluto(-0.9));
		 System.out.println(valorAbsoluto(3.9));
         System.out.println(valorAbsoluto(3.1));
         
         System.out.println();
         
         System.out.println("valor decimal mais baixo: ");
         
         System.out.println(decimalBaixo(5.15));
		 System.out.println(decimalBaixo(10.5));
		 System.out.println(decimalBaixo(-32.51));
		 System.out.println(decimalBaixo(-0.1));
		 System.out.println(decimalBaixo(-0.9));
		 System.out.println(decimalBaixo(3.9));
         System.out.println(decimalBaixo(3.1));
         
         System.out.println();
         
         System.out.println("valor decimal mais alto: ");
         
         System.out.println(decimalAlto(5.15));
		 System.out.println(decimalAlto(10.5));
		 System.out.println(decimalAlto(-32.51));
		 System.out.println(decimalAlto(-0.1));
		 System.out.println(decimalAlto(-0.9));
		 System.out.println(decimalAlto(3.9));
         System.out.println(decimalAlto(3.1));

         System.out.println();
         
         System.out.println("valor decimal mais próximo: ");
         
         System.out.println(decimalProximo(5.15));
		 System.out.println(decimalProximo(10.5));
		 System.out.println(decimalProximo(-32.51));
		 System.out.println(decimalProximo(-0.1));
		 System.out.println(decimalProximo(-0.9));
		 System.out.println(decimalProximo(3.9));
         System.out.println(decimalProximo(3.1));

         System.out.println();
         
         System.out.println("Arredondamento: ");
         
         System.out.println(Arredondamento(5.15));
		 System.out.println(Arredondamento(10.5));
		 System.out.println(Arredondamento(-32.51));
		 System.out.println(Arredondamento(-0.1));
		 System.out.println(Arredondamento(-0.9));
		 System.out.println(Arredondamento(3.9));
         System.out.println(Arredondamento(3.1));
	 }
}
