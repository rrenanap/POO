package Exercicio2;

public class Main {
    public class Main {
        public static void main(String[] args) {

            Retangulo retangulo1 = new BordasArredondadas("Oi");
            retangulo1.desenhar();

            Retangulo retangulo2 = new LinhasDuplas("Tudo Certo?");
            retangulo2.desenhar();

            Retangulo retangulo3 = new AsciiArt("Que bom!");
            retangulo3.desenhar();
        }
    }
}
