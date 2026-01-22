public class Arrays {
    
    public static void main(String[] args) {
        int[] meuArray; // Declaração do array

        meuArray = new int[3]; // Criação do array

        meuArray[0] = 5;
        meuArray[1] = 8;
        meuArray[2] = 2;

        meuArray = new int[]{5, 8, 2}; // Cria e preenche o array

        System.out.println(meuArray[0]);
        System.out.println(meuArray[1]);
        System.out.println(meuArray[2]);

        meuArray[0] = 10; // Altera o valor em 0

        System.out.println(meuArray[0]);

        // Percorrendo arrays
        for (int i = 0; i < meuArray.length; i++) {
            System.out.println(meuArray[i]);
        }

        meuArray[0] = 5;

        // For-Each
        for (int elemento: meuArray) {
            System.out.println(elemento);
        }
    }
    
}