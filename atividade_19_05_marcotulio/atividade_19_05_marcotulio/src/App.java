import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner teclado = new Scanner (System.in);

        System.out.println("Insira a quantidade de nomes escolhidos: ");
        int quantidadeNomes = teclado.nextInt();

        String nomes[] = new String [quantidadeNomes];

        for(int contador = 0; contador < nomes.length; contador++){
            System.out.println("Insira o nome da " + contador + " º posicão: ");
            nomes[contador] = teclado.next();    
        }
        
        System.out.println("Insira a quantidade de nomes sorteados: ");
        int sorteadosNomes = teclado.nextInt();
        
        for(int contador1 = 0; contador1 < sorteadosNomes; contador1++){
            int contador2 = (int) (Math.random() * nomes.length);
            System.out.println("O " + contador1 + "Âº nome escolhido foi: " + nomes[contador2]);
        }
    }
}