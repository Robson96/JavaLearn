package cap9;

public class Main {
    public static void main(String[] args) {
        int len = switch (Day.SUNDAY) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;
        };

        System.out.println("len = " + len);

        int quarter = 2;
        var quarterLabel =
                switch (quarter) {
                    case 0 -> "Q1 - Winter";
                    case 1 -> "Q2 - Spring";
                    case 2  -> 10;
                    case 3  -> 10.30;
                    case 4  -> new Object();
                    default -> "Unknown quarter";
                };

        System.out.println(quarterLabel);

        String quarterLabel2 =
                switch (quarter) {
                    case 0 :  yield "Q1 - Winter";
                    case 1 :  yield "Q2 - Spring";
                    case 2 :  yield "Q3 - Summer";
                    case 3 :  yield "Q4 - Summer";
                    default: System.out.println("Unknown quarter");
                        yield "Unknown quarter";
                };

        System.out.println(quarterLabel2);

        var teste2 = new Teste2();
    }

    public void teste(int a, String b) {}
    public void teste(String b, int a) {}
}

class Teste {

}

class Teste2 extends Teste {

}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
