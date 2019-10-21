package hello;
/* if and else служвт для булевских операций сравнения
swich(оператор)
case значение -для выбора того значения которое нужно
break остановка операций
 */

public class log {

    static boolean bool1 = false;
    static int a = 1;

    public static void main(String[] args) {
        if( a == 3){
            System.out.println("a = 3");
        } else if(a>3){
            System.out.println("a>3");
        }else if(a<3){
            System.out.println("a<3");
        }

        switch (a) {
            case 5:
                System.out.println("5");
                break;
            case 6:
                 System.out.println("6");
                 break;
            case 1:
                System.out.println("1");
                break;
            case 12:
                System.out.println("12");

        }

    }
}
