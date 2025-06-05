package cap8;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Bola bola = new Bola("Vermelha");
        System.out.println(bola.getCor());
        mudarCorBola(bola);
        System.out.println(bola.getCor());

        Retangulo retangulo = new Retangulo(2, 2);
        System.out.println(retangulo);

        System.out.println(bola);
    }

    static void mudarCorBola(Bola bola) throws CloneNotSupportedException {
        bola.setCor("Verde");
        bola = new Bola("Azul");
        bola.setCor("Amarelo");
    }
}