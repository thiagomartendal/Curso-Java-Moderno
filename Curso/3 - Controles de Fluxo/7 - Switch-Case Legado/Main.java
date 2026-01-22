public class Main {
    
    public static void main(String[] args) {
        int diaDaSemana = 3; // 1 representa segunda, 2 terça, etc.

        switch (diaDaSemana) {
            case 1:
                System.out.println("Seg.");
            break;
            case 2:
                System.out.println("Ter.");
            break;
            case 3: // Executa até encontrar o próximo brake ou encerrar o switch
                System.out.println("Qua.");
            case 4:
                System.out.println("Qui.");
            case 5:
                System.out.println("Sex.");
            break;
            default:
                System.out.println("Dia desconhecido");
            break;
        }
    }

}
