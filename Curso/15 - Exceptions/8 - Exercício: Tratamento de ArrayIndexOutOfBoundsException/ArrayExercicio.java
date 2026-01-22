class ArrayExercicio {
    public int acessarElemento(int[] array, int indice) {
        try {
            return array[indice];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Índice " + indice + " fora dos limites do array.");
            return -1;
        }
    }
}
