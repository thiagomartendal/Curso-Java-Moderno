interface Interface1 {
    void metodo1();
}

interface Interface2 {
    void metodo2();
}

// Implementação multipla - Todos os métodos das interfaces devem ser implementados na classe que as implementa
class ClasseExemplo implements Interface1, Interface2 {
    public void metodo1() {
        System.out.println("Método 1");
    }

    public void metodo2() {
        System.out.println("Método 2");
    }
}

public class TesteInterfaceMultipla {

    public static void main(String[] args) {
        ClasseExemplo exemplo = new ClasseExemplo();
        exemplo.metodo1();
        exemplo.metodo2();
    }
    
}