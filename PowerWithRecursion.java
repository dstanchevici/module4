// getPwr(x,k,m) returns m*(x^k)
// Require: k>0

public class PowerWithRecursion {

    static int cnt = 0;

    public static void main (String[] argv)
    {
	System.out.println ( getPwr(2,4,1) );
    }

    static int getPwr (int x, int k, int m) {
	//System.out.println ("ENTER " + (cnt++) + ": k=" + k + " m=" + m + " m*x=" + (m*x));
	if (k==1) {
	    System.out.println ("BASE " + (cnt++) + ": k=" + k + " m=" + m + " m*x=" + (m*x));
	    return m*x;
	}

	else {
	    System.out.println ("NONBASE " + (cnt++) + ": k=" + k + " m=" + m + " m*x=" + (m*x));
	    return getPwr(x,k-1,m*x);
	}

    }
}
