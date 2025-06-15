package cap12;

public enum Dias {
    SEGUNDA("SEG"),
    TERCA("TER");

    private final String abreviacao;

    Dias(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public String getAbreviacao() {
        return abreviacao;
    }
}
