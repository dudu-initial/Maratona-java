package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioEx;

public class FuncionarioExTest01 {
    public static void main(String[] args) {
        FuncionarioEx funcionario = new FuncionarioEx();
        funcionario.nome = "Eduardo";
        funcionario.idade = 19;
        funcionario.salario1 = 1500;
        funcionario.salario2 = 2000;
        funcionario.salario3 = 1300;

        funcionario.imprime();
        funcionario.mediaSalario();

    }
}
