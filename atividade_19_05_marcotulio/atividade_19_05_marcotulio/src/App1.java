public class App1 {

    static int myMethod(int numero) {
        String nomes[] = {"Joaquim", "Manuel", "Rômulo", "Simão", "Sebastião", "Caio", "Guilherme", "José", "Carlos", "Renato"};

        for(int contador1 = 0; contador1 < numero; contador1++){
            double aleatorio = Math.random();
            int contador = (int) (1 + aleatorio * (10 - 1));
            System.out.println(nomes[contador]);
        }

        return numero;
    }
    public static void main(String[] args) throws Exception {
        myMethod(3);    
    }
}
