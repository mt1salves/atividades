public class App2 {
    static int myMethod(int num) {
        String[] nomes = {"Harry", "Lolla", "Miguel", "Mary", "Daysy", "Lua", "Junior"};

        for(int i = 0; i < num; i++){
            int sorteado = (int) (Math.random() * 6);
            String sorteada = nomes[sorteado];
            System.out.println(sorteada);
        }

        return num;
    }

    public static void main(String[] args) {
      myMethod(2);  
    }
}
