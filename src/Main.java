package src;

public class Main {

    public String name;
    public static final String URL_TO_ADMIN = "https://agis1.aventus.work/";
    public static final String USER = "anton";

    public static void main(String[] args) {
        int j = 1;
        Integer iPhone = 1;
        int k = Integer.parseInt("100") + 1000;
        System.out.println(iPhone);
        iPhone = 2;
        System.out.println(iPhone);
        iPhone = iPhone + 2;
        iPhone +=2;
        System.out.println(iPhone);
        float fl = 30.5F;
        char f = 543;
        System.out.println(f);
        String secondF = "foo";
        String thirdString = "fighther";
        System.out.println(secondF + " " + thirdString);
        System.out.println(secondF+thirdString);

        float y = 11f;
        float h = 3f;
        float g = 3f;
        System.out.println( y / h);
        int p= 1;
        p++;
        System.out.println(p);
        System.out.println(h == g);
        System.out.println(g != h);
        System.out.println((y > g) || (h > g));
        System.out.println((y > g) & (h == g));
        System.out.println(!(y < g));

    }

    public void check() {
        long iPhone;
    }
}
