package cap8;

import java.util.Objects;

public class Bola {

    private String cor;

    public Bola(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Bola bola = (Bola) o;
        return Objects.equals(cor, bola.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cor);
    }

    @Override
    public String toString() {
        return "Bola{" +
                "cor='" + cor + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this;
    }
}
