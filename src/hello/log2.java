package hello;
/* && оператор и
! - оператор нет
|| - опратор или
 */

public class log2 {
    public static void main (String[] args) {
        int a = 5;
        int b = 5;
        boolean bool = false;


        if (!(a == b) && !bool || a==b ) {
            System.out.println("this is true");
        }
    }
}
