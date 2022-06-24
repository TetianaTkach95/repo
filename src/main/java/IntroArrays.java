public class IntroArrays {

    public static int[] exampleOneDimension(){

        int[] anArray1;
        anArray1 = new int[3];
        anArray1[0] = 100;
        anArray1[1] = 200;
        anArray1[2] = 300;

        int[] anArray2 = {100,200,300};

        return anArray1;
    }

    public static String[][] exampleTwoDimension(){

        String[][] anArray1;
        anArray1 = new String[3][3];
        anArray1[0][0] = "0-0";
        anArray1[0][1] = "0-1";
        anArray1[0][2] = "0-2";

        anArray1[1][0] = "1-0";
        anArray1[1][1] = "1-1";
        anArray1[1][2] = "1-2";

        anArray1[2][0] = "2-0";
        anArray1[2][1] = "2-1";
        anArray1[2][2] = "2-2";


        String[][] anArray2 = {{"0-0","0-1","0-2"},{"1-0","1-1","1-2"},{"2-0","2-1","2-2"}};

        return anArray2;
    }

    public static void printArrayOneDimension(int[] array){
        for (int i=0;i<array.length;i++){
            System.out.print("["+array[i]+"]");
        }
    }

    public static void printArrayTwoDimension(String[][] array){

        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length;j++){
                System.out.print("["+array[i][j]+"]");
            }
            System.out.println();
        }

    }
}
