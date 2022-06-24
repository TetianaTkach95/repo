public class IntroLoop {

    public static void demoFor(int number) {
        for (int i = 1; i < number; i++) {
            System.out.println("i = " + i);
        }
    }

    public static void demoWhile(int number){
        int i=5;
        while (i<number){
            System.out.println("i = " + i);
            i++;
        }
    }

    public static void demoDoWhile(int number){
        int i=5;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i<number);
    }
}
