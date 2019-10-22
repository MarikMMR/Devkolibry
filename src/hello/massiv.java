package hello;


import java.util.SplittableRandom;

public class massiv {
    static int[] numbs = new int[10];
    static String[] nu = new String[3];

    public static void main (String[] args) {
        numbs[0] = 2;
        numbs[1] = 3;
        numbs[2] = 123;
        numbs[3] = 52625;
        numbs[4] = -1234;
        numbs[5] = 5;
        numbs[6] = 3;
        numbs[7] = 2;
        numbs[8] = 13;
        numbs[9] = 44;
        for (int i=0; i<numbs.length; i++ ) {
            System.out.println(i + " : " + numbs[i]);
        }
        nu[0] = "Hello"; nu[1] = "     "; nu[2] = "World";


        for(int i = 0; i<nu.length; i++) {
            System.out.println(nu[i]);
        }
    }

}
