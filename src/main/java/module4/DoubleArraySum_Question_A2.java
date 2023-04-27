package module4;

public class DoubleArraySum_Question_A2 {

    public static void main(String[] args) {
        int[][] A = {
                {1,2},
                {3,4}
        };

        int[][] B = new int [2][2];
        int sum = 0;
        for (int i=0; i<B.length; i++) {
            for (int j=0; j<B[0].length; j++) {
                B[i][j] = A[i][j] + 1;
                sum += B[i][j];
            }
        }
        System.out.println(sum);

        int[][] C = B;
        sum = 0;
        for (int i=0; i<2; i++) {
            for (int j=0; j<2; j++) {
                C[i][j] = 0;
                sum += B[i][j];
            }
        }
        System.out.println(sum);
    }
}
