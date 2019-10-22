package hello;

public class rekursiya {
    public static  void main (String[] args) {
        int val = calkSumm(1,-1);
        System.out.println(val);

    }
    static int calkSumm(int a, int b) {
        int summ = a+b;
        if(summ==0)

        summ = calkSumm(1,1);
        return summ;
    }
}
