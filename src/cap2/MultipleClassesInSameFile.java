package cap2;

public class MultipleClassesInSameFile {
    public static void main(String[] args) {
        System.out.println(GerenateMessage.generateMessage());
        System.out.println(AnotherMessage.generateAnotherMessage());
    }
}

class GerenateMessage {
    static String generateMessage() {
        return "Uma messagem";
    }
}

class AnotherMessage {
    static String generateAnotherMessage() {
        return "Outra messagem";
    }
}