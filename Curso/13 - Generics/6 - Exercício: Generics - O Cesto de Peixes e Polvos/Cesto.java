class Cesto<T> {
    private T conteudo;

    public void guardar(T obj) {
        conteudo = obj;
    }

    public T pegar() {
        return conteudo;
    }
}
