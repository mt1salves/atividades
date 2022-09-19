package atividade_10_03_marcotulio;

public class App1 {
	static double somaQuadrados(float a, float b){
        return Math.pow(a, 2) + Math.pow(b, 2);    
    }

    public static void main(String[] args) {
        double X = somaQuadrados(5, 3);
        System.out.println(X);
    }
}

