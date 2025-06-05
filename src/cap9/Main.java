package cap9;

import java.util.UUID;

class OuterClass {

    class InnerClass {

    }
}

public class Main {

    private static final String id = generateID();

    private static String generateID() {
        return UUID.randomUUID().toString();
    }

    public static void main(String[] args) {
        System.out.println(id);

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass inn = outerClass.new InnerClass();
    }
}
