public class ContagemDoce {

    public static void main(String[] args) {
        int contadorDoces = 1;

        while (contadorDoces <= 3) {
            System.out.println("O filho pode comer " + (4 - (contadorDoces++)) + " doces.");
        }

        System.out.println("O filho não pode comer mais doces.");
    }

}
