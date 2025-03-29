package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        //Dado um determinado salario, qual valor eu tenho que pagar?
        double porcentagem1 = 0.097;
        double porcentagem2 = 0.3735;
        double porcentagem3 = 0.4950;

        double salario = 10000;

        double taxa1 = salario * porcentagem1;
        double taxa2 = salario * porcentagem2;
        double taxa3 = salario * porcentagem3;

        if (salario <= 34712) {
            System.out.println("vc devera pagar isso " + taxa1);
        } else if (salario >= 34713 && salario <= 68507) {
            System.out.println("vc devera pagar isso " + taxa2);
        } else if (salario >= 68508){
            System.out.println("vc devera pagar isso " + taxa3);
        }

    }
}
