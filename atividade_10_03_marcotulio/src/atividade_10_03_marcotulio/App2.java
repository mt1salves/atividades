package atividade_10_03_marcotulio;

public class App2 {
	static double xPositivo(float a, float b){
        double D = Math.pow(a, 2) + Math.pow(b, 2);
        return (- b + Math.sqrt(D)) / (2 * a);   
    }

    public static void main(String[] args) {
        double xPositivo = xPositivo(5, 3);
        System.out.println(xPositivo);
    }
}
