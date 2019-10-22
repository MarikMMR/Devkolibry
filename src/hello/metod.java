package hello;

import jdk.nashorn.internal.ir.CallNode;

public class metod {
    public static  void main (String[] args) {
        int val = calkSumm(2,9);
        System.out.println(val);

    }
    static int calkSumm(int a, int b) {
        int summ = a+b;
        return summ;
    }
}
