package hello;

public class cikl {

    public static void main(String[] args) {

        for (int i = 5; i>0; i--) {

            System.out.println(i);
        }
        while (6>2) {
            System.out.println("Text");
            break;
        }
        int j = 0;
        while (j<5) {
            System.out.println(j);
            j++;
        }
        String[] st = "hello world ".split(" ");
        for (String s : st) {
            System.out.println(s);

        }
    }
}
