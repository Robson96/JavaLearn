package cap7;

import java.util.Arrays;

public class Matriz {
    public static void main(String[] args) {
        int[] anArray;

        anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;

        System.out.println("Element at index 0: "
                + anArray[0]);
        System.out.println("Element at index 1: "
                + anArray[1]);
        System.out.println("Element at index 2: "
                + anArray[2]);
        System.out.println("Element at index 3: "
                + anArray[3]);
        System.out.println("Element at index 4: "
                + anArray[4]);
        System.out.println("Element at index 5: "
                + anArray[5]);
        System.out.println("Element at index 6: "
                + anArray[6]);
        System.out.println("Element at index 7: "
                + anArray[7]);
        System.out.println("Element at index 8: "
                + anArray[8]);

        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans;
        char[] anArrayOfChars;
        String[] anArrayOfStrings;

        // Outra forma de se declar arrays
        // Entretanto, a convenção desencoraja esse formato;
        // os colchetes identificam o tipo de matriz e devem aparecer com a designação do tipo.
        float anArrayOfFloatss[];

        int[] anArray2 = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };

        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };
        System.out.println(names[0][0] + names[1][0]);
        System.out.println(names[0][2] + names[1][1]);

        System.out.println(anArray.length);

        System.arraycopy(anArray, 0, anArray2, 0, anArray.length);

        for (int i : anArray2) {
            System.out.print(i + " - ");
        }
        System.out.println();

        String[] copyFrom = {
                "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
                "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
                "Marocchino", "Ristretto" };

        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");
        }
        System.out.println();

        String[] result = Arrays.copyOfRange(copyFrom, 2, 9);

        for (String coffee : result) {
            System.out.print(coffee + " ");
        }
        System.out.println();

        int index = Arrays.binarySearch(copyFrom, "Espresso");
        System.out.println(index);
        System.out.println(copyFrom[index]);

        System.out.println(Arrays.toString(copyFrom));
    }
}
