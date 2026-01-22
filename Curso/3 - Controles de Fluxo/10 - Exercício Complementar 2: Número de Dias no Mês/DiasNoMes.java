public class DiasNoMes {

    public static void main(String[] args) {
        String mes = "Dezembro";

        int dias = switch (mes) {
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> 31;
            case "Abril", "Junho", "Setembro", "Novembro" -> 30;
            case "Fevereiro" -> 28;
            default -> 0;
        };

        System.out.println("Número de dias em " + mes + ": " + dias);
    }

}
