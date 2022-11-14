package src;

public class IfElseSwitchCaseWhile {
    public static void ForIf() {
        for (int q = 1; q < 6; q++) {
            if (q == 1) {
                System.out.println("Один");
            } else if (q == 2) {
                System.out.println("Два");
            } else if (q == 3) {
                System.out.println("Три");
            } else if (q == 4) {
                System.out.println("Четыре");
            } else if (q == 5) {
                System.out.println("Пять");
            }
        }
    }

    public static void SwitchCase()  {
        for (int b = 0; b <= 5; b++) {
            switch (b) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
            }
        }
    }

    public static void While () {
        int min = 10;
        int max = 55;
        int sum = 0;
        while(min <= max){
            if(min % 2 == 0){
                sum = sum + min;
            }
            min++;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        ForIf();
        SwitchCase();
        While();
    }
}