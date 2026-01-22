public class ExemploNullPointerExceptionInteger {

    public static void main(String[] args) {
        try {
            Integer numero = null;
            System.out.println("Número: " + numero.toString());
        } catch (NullPointerException e) {
            System.err.println("Erro: O objeto numero é nulo.");
            System.err.println(e.getMessage());
        }
    }

}
