public class IntroJump {

    public static void demoForWithBreak(int number) {
        System.out.print("Function started...");
        for (int i = 1; i < number; i++) {
            System.out.println();
            System.out.print("Iteration Start... ");
            System.out.print("i = " + i);
            if (i==5) break;
            System.out.print(" Iteration End.");
        }
        System.out.println();
        System.out.println("Function completed...");

    }

    public static void demoForWithContinue(int number) {
        System.out.print("Function started...");
        for (int i = 1; i < number; i++) {
            System.out.println();
            System.out.print("Iteration Start... ");
            System.out.print("i = " + i);
            if (i==5) continue;
            System.out.print(" Iteration End.");
        }
        System.out.println();
        System.out.println("Function completed...");
    }

    public static void demoForWithReturn(int number) {
        System.out.print("Function started...");
        for (int i = 1; i < number; i++) {
            System.out.println();
            System.out.print("Iteration Start... ");
            System.out.print("i = " + i);
            if (i==5) return;
            System.out.print(" Iteration End.");
        }
        System.out.println();
        System.out.println("Function completed...");
    }
}
