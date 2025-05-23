package cap7;

public class Operadores {
    public static void main(String[] args) {
        int i = 3;
        i++;

        System.out.println(i);// prints 4
        ++i;

        System.out.println(i);// prints 5

        System.out.println(++i);// prints 6

        System.out.println(i++);// prints 6

        System.out.println(i);// prints 7

        int value1 = 1;
        int value2 = 2;
        int result;
        boolean someCondition = true;
        result = someCondition ? value1 : value2;

        System.out.println(result);
    }
}
