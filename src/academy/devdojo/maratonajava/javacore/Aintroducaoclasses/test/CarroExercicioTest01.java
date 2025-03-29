package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.CarroExercicio01;

public class CarroExercicioTest01 {
    public static void main(String[] args) {
        CarroExercicio01 carroExercicio01 = new CarroExercicio01();
        CarroExercicio01 carroExercicio02 = new CarroExercicio01();

        carroExercicio01.nome = "Nissan";
        carroExercicio01.modelo = "Kicks";
        carroExercicio01.ano = 2020;

        System.out.println("Nome: " + carroExercicio01.nome + " Modelo: " + carroExercicio01.modelo + " Ano: " + carroExercicio01.ano);


        carroExercicio02.nome = "Chevrolet";
        carroExercicio02.modelo = "Crosa";
        carroExercicio02.ano = 2001;

        System.out.println("Nome: " + carroExercicio02.nome + " Modelo: " + carroExercicio02.modelo + " Ano: " + carroExercicio02.ano);
    }


}
