package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class FuncionarioEx {
    public String nome;
    public int idade;
    public double salario1;
    public double salario2;
    public double salario3;

    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("Salario 1: " +this.salario1);
        System.out.println("Salario 2: " +this.salario2);
        System.out.println("Salario 3: " +this.salario3);
    }

    public void mediaSalario() {
        double media = (salario1 + salario2 + salario3) / 3;
        System.out.println("média salarial: " + media);
    }
}
