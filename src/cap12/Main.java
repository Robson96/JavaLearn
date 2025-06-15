package cap12;

public class Main {
    public static void main(String[] args) {
        Dias dia = Dias.SEGUNDA;
        System.out.println(Dias.SEGUNDA);
        System.out.println(dia.getAbreviacao());
        System.out.println(Dias.SEGUNDA.name());
        System.out.println(Dias.SEGUNDA.ordinal());
    }
}
