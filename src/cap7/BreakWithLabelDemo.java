package cap7;

public class BreakWithLabelDemo {
    public static void main(String[] args) {
        int[][] arrayOfInts = {
                {  32,   87,    3, 589 },
                {  12, 1076, 2000,   8 },
                { 622,  127,   77, 955 }
        };

        var searchfor = 12;
        boolean foundIt = false;
        int [] index = new int[2];

    search:
        for (int i = 0; i < arrayOfInts.length; i++) {
            for (int j = 0; j < arrayOfInts[i].length; j++) {
                if (searchfor == arrayOfInts[i][j]) {
                    foundIt = true;
                    index[0] = i;
                    index[1] = j;
                    break search;
                }
            }
        }

        if (foundIt)
            System.out.println("O numero " + arrayOfInts[index[0]][index[1]] + " foi encontrado!");
        else
            System.out.println("O numero não foi encontrado");


        String searchMe = "Look for a substring in me";
        String substring = "sub";
        boolean foundIt2 = false;

        int max = searchMe.length() - substring.length();

    test:
        for (int i = 0; i < max; i++) {
            int n = substring.length();
            int j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test;
                }
            }
            foundIt2 = true;
            break;
        }

        System.out.println(foundIt2 ? "Found it" : "Didn't find it");

        var test = new Test();
        System.out.println(test.calculate(Day.FRIDAY));
    }
}

class Test {
    public int calculate(Day d) {
        return switch (d) {
            case SATURDAY , SUNDAY -> 0;
            default -> {
                int r = 5 - d.ordinal();
                yield r;
            }
        };
    }
}

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
