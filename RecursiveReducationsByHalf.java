public class RecursiveReducationsByHalf {

    public static void main (String[] argv)
    {
	int N = 15;
	int k = reductions (N, 0);
	System.out.println ("N=" + N + " k=" + k);
    }

    static int reductions (int n, int count)
    {
        if (n == 0) return count;
        return reductions (n/2, count + 1);
    }

}
