public class CodigoCarteirinha {

    public static void main(String[] args) {
        int codigoDeSaida = 9;

        for (int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++) {
            if (codigoCarteirinha == codigoDeSaida) {
                System.out.println("Interrompendo o laço.");
                break;
            }
            if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {
                System.out.println("Código " + codigoCarteirinha + " é aceito no hospital Santa Clara.");
                continue;
            }
            System.out.println("Código " + codigoCarteirinha + " não é aceito.");
        }
    }

}
