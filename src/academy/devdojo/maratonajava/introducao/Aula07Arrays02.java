package academy.devdojo.maratonajava.introducao;

import java.lang.String;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[5];
        nomes[0] = "Goku";
        nomes[1] = "Piccolo";
        nomes[2] = "Kuririn";
        nomes[3] = "Buma";
        nomes[4] = "Lissandra";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }
    }
}
