public class Main {

    public static void main(String[] args) {
        int diaDaSemana = 13; // 1 representa segunda, 2 terça, etc.

        switch (diaDaSemana) {
            case 1:
                System.out.println("Seg.");
            break;
            case 2:
                System.out.println("Ter.");
            break;
            case 3:
                System.out.println("Qua.");
            break;
            default: // Executa o default na ordem em que é inserido (e executa até o 5)
                System.out.println("Dia desconhecido");
            case 4:
                System.out.println("Qui.");
            case 5:
                System.out.println("Sex.");
        }
    }

}
