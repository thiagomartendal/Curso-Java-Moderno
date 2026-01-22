/*
    Todas as classes em java herdam a classe object, mesmo que a herança não seja definida explicitamente.
    O compilador adiciona a herança a Object automaticamente.
*/

abstract class Animal extends Object {
    public abstract void fazerSom();

    public void tipoObjeto() {
        System.out.println("Objeto do tipo animal");
    }
}

class Cachorro extends Animal {
    public void fazerSom() {
        System.out.println("O cachorro late");
    }
}

class Gato extends Animal {
    public void fazerSom() {
        System.out.println("O gato mia");
    }
}

public class TestePolimorfismo {
    
    public static void main(String[] args) {
        // Criando objetos polimórficos

        Object cachorro = new Cachorro();
        Object gato = new Gato();

        /*
            A classe Object pode ser usada como tipo, já que está no topo da hierarquia e é extendida automaticamente em todas as outras classes,
            mas Object não pode chamar métodos definidos em suas classes filhas como é feito abaixo.
        */

        // cachorro.fazerSom();
        // gato.fazerSom();

        // cachorro.tipoObjeto();
        // gato.tipoObjeto();

        // Para chamar os métodos, deve ser feita a conversão como abaixo:

        Cachorro objConvertido = (Cachorro)cachorro; // Converção para variável
        objConvertido.fazerSom();

        ((Gato)gato).fazerSom(); // Conversão com chamada direta
    }

}