interface ExemploInterfaceEspecial {
    // Método abstrato
    void metodoAbstrato();

    // Método default
    default void metodoDefault() {
        System.out.println("Este é um método padrão na interface.");
    }

    // Método static - Não pode ser sobreescrito pela classe que implementa a interface
    static void metodoStatic() {
        System.out.println("Este é um método estático na interface.");
    }
}

public class TesteInterfaceEspecial implements ExemploInterfaceEspecial {
    
    public void metodoAbstrato() {
        System.out.println("Implementação do método abstrato.");
    }

    public static void main(String[] args) {
        TesteInterfaceEspecial teste = new TesteInterfaceEspecial();

        teste.metodoAbstrato();
        teste.metodoDefault();
        ExemploInterfaceEspecial.metodoStatic();
    }

}