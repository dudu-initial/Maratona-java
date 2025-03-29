package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000000

        long count;

        for (count = 0; count <= 10000000; count += 2) {
            System.out.println("Pares até 1.000.000: " + count);
        }
    }
}
