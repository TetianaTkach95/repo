public class IntroConditions {

    public static void demoIf(int a, int b) {
        if (a > b) {
            System.out.println("a>b");
        }
    }

    public static void demoIfElse(int a, int b) {
        if (a > b) {
            System.out.println("a>b");
        } else {
            System.out.println("b>a");
        }
    }

    public static void demoIfElseIf(int monthNumber) {
        if (monthNumber == 1) {
            System.out.println("Jan");
        } else if (monthNumber == 2) {
            System.out.println("Feb");
        } else if (monthNumber == 3) {
            System.out.println("Mar");
        } else {
            System.out.println("I dunno");
        }
    }

    public static void demoSwitch(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
                break;
            case 3:
                System.out.println("Mar");
                break;
            default:
                System.out.println("I dunno");
        }
    }
}
