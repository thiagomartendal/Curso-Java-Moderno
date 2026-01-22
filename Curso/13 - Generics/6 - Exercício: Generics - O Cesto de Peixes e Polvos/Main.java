public class Main {

    public static void main(String[] args) {
        Cesto<Peixe> cestoDePeixes = new Cesto<>();
        Cesto<Polvo> cestoDePolvos = new Cesto<>();

        cestoDePeixes.guardar(new Peixe("Peixe", 10));
        cestoDePolvos.guardar(new Polvo("Polvo", 8));

        Peixe peixe = cestoDePeixes.pegar();
        Polvo polvo = cestoDePolvos.pegar();

        System.out.println(peixe.getNome() + " - " + peixe.getTamanho());
        System.out.println(polvo.getNome() + " - " + polvo.getTentaculos());
    }

}