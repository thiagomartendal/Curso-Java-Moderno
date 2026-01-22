class SalaDeAula {
    private static int totalAlunos;

    public SalaDeAula() {
        totalAlunos = 0;
    }

    public static void setAlunos(int total) {
        totalAlunos += total;
    }

    public static int getTotalAlunos() {
        return totalAlunos;
    }
}

public class TesteSalaDeAula {

    public static void main(String[] args) {
        SalaDeAula sala1 = new SalaDeAula();
        SalaDeAula sala2 = new SalaDeAula();
        SalaDeAula sala3 = new SalaDeAula();

        sala1.setAlunos(15);
        sala2.setAlunos(18);
        sala3.setAlunos(21);

        System.out.println("Total de alunos na escola: " + SalaDeAula.getTotalAlunos());
    }

}
