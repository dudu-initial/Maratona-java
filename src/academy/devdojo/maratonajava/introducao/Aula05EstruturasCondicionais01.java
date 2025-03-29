package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 16;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcoolica");
        } else {
            System.out.println("Nao autorizado a comprar bebida alcolica");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Nao autorizado a comprar bebida alcolica");
        }

        boolean c = false;
        if (c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito!");
        }

        System.out.println("Fora do if");

    }
}
