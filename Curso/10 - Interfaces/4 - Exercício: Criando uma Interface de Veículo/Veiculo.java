interface Veiculo {
    void iniciar();

    void parar();

    default void buzinar() {
        System.out.println("O veículo buzinou.");
    }
}