package module4;

public class PseudoRecursionSum_Question_A4 {

    public static void main(String[] args)
    {
        System.out.println( one(5));
    }

    static int one (int k)
    {
        if (k <= 0) {
            return 0;
        }
        return 1 + two(k-2);
    }

    static int two (int n)
    {
        if (n <= 0) {
            return 0;
        }
        return 2 + one(n-1);
    }
}
