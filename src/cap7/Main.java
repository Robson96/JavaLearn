package cap7;

import java.math.BigDecimal;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 10000L;

//        double funds = 1.00;
//        int itemsBought = 0;
//        for (double price = 0.10; funds >= price; price += 0.10) {
//            funds -= price;
//            itemsBought++;
//        }
//
//        System.out.println(itemsBought);
//        System.out.println(funds);

        final BigDecimal TEN_CENTS = new BigDecimal(".10");

        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS;
                funds.compareTo(price) >= 0;
                price = price.add(TEN_CENTS)) {
            funds = funds.subtract(price);
            itemsBought++;
        }

        System.out.println(itemsBought);
        System.out.println(funds);

        var list = List.of(1, 2, 3);
        for (var element : list) {
            System.out.println(element);
        }
    }
}
