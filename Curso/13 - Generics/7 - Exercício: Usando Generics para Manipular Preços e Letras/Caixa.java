class Caixa<T> {
    private T[] itens;

    public Caixa(int capacidade) {
        itens = (T[]) new Object[capacidade];
    }

    public void adicionar(T elemento, int indice) {
        itens[indice] = elemento;
    }

    public T obter(int indice) {
        return itens[indice];
    }
}
