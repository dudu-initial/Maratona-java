package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.FuncionarioRes;

public class FuncionarioResTest01 {
    public static void main(String[] args) {
        FuncionarioRes funcionario = new FuncionarioRes();
        funcionario.setNome("Sanji");
        funcionario.setIdade(21);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime();
        funcionario.imprimeMediaSalarial();
    }
}
