package src;

public class Strings {
    public static void anystring() {
        String phrase = "I like Java!!!";
        System.out.println(phrase.substring(13));
        System.out.println(phrase.contains("Java"));
        System.out.println(phrase.replace("a", "o"));
        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());
        System.out.println(phrase.substring(0, 7));
    }
    public static void creamInCake() {
        String cake = "cake %s cake";
        System.out.println(String.format(cake, "cream"));
    }

    public static void main (String[] args) {
        anystring();
        creamInCake();
    }
}
