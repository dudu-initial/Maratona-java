package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Scanner;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public double divideDoisNumeros02(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por 0.");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    public void testaFor() {
        int carro = 100;

        for (int i = 0; i < carro; i++) {
            System.out.println(i);
        }
    }
    // Desafio: Criar uma calculadora que valida se o numero e primo ou nao
    // Retornar true se for, flase se nao for

    // Desafio2: Criar uma calculadora que recebe uma lista/array
    // Retorna a lista x2

    public int numeroPrimo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (n % 2 == 0) {
                System.out.println("Numero nao primo");
            } else {
                System.out.println("Numero primo");
            }
        }
        return n;
    }
}
