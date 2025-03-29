package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu","TV", 12, "Ação", "Production IG");
        //anime.init("Naruto","TV",500);
        //anime.init("Naruto","TV",500, "Ação");
        anime.imprime();
    }
}
