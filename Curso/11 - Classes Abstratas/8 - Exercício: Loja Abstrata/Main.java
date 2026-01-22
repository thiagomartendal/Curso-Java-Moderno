public class Main {

    public static void main(String[] args) {
        LojaComercial loja = new LojaComercial(123456789, "Loja Comercial", true);

        System.out.println("Loja: " + loja.getRazaoSocial() + " - " + loja.getCNPJ());

        loja.abrir();
        loja.fechar();
    }

}