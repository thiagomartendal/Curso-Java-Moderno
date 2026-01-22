public class Main {
 
    public static void main(String[] args) {
        int k = 30;

        do { // O bloco do é executado ao menos uma vez
            System.out.println(k);
            k++;
        } while (k < 5); // A verificação é feita após a execução do blco do, por isso 30 é impresso
    }

}
