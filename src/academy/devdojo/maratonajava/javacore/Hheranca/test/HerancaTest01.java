package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("01911-200");
        Pessoa pessoa = new Pessoa("Kakegurui");
        pessoa.setCpf("11111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Eduardo");
        funcionario.setCpf("2222222222");
        funcionario.setSalario(5599.99);
        funcionario.setEndereco(endereco);
        System.out.println("-----------------------");
        funcionario.imprime();
    }
}
