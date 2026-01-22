public class Notas {
    
    public static void main(String[] args) {
        double[] notas = new double[5];
        notas[0] = 3.5;
        notas[1] = 7.0;
        notas[2] = 2.6;
        notas[3] = 8.5;
        notas[4] = 4.0;

        for (var nota: notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

}
