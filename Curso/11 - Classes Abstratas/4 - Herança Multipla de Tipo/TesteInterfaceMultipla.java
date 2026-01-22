interface Interface1 {
    void metodo1();
}

interface Interface2 {
    void metodo2();
}

// Herança multipla de tipo
interface Interface3 extends Interface1, Interface2 {
    void metodo3();
}

class ClasseExemplo implements Interface3 {
    public void metodo1() {
        System.out.println("Método 1");
    }

    public void metodo2() {
        System.out.println("Método 2");
    }

    public void metodo3() {
        System.out.println("Método 3");
    }
}

public class TesteInterfaceMultipla {

    public static void main(String[] args) {
        ClasseExemplo exemplo = new ClasseExemplo();
        exemplo.metodo1();
        exemplo.metodo2();
        exemplo.metodo3();
    }
    
}