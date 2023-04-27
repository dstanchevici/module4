package module4;

public class RecursionSum_Question_A3 {

    public static void main(String[] args) {
        System.out.println( sum(6) );
    }

    static int sum (int k) {
        if (k == 3) {
            return 6;
        }
        return sum(k-1) + k;
    }
}
