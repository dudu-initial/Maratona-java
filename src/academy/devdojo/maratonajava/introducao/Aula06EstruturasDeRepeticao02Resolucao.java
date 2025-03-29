package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02Resolucao {
    public static void main(String[] args) {
        //Imprima todos os números pares de 0 até 1000000

        for (int i = 0; i <= 10000000; i++) {
            if (i % 2 == 0) {
                System.out.println("Numeros pares: " + i);
            }
        }
    }
}
