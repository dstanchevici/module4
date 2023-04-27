package module4;

import java.util.*;

public class MergeSorted_Question_B1 {

    public static void main (String[] argv)
    {
        String[] list1 = {"a", "cat", "does", "fighting", "gnarly"};
        String[] list2 = {"big", "cat", "expect", "hyenas"};
        String[] mergedList = mergeSortArrayList (list1, list2);
        System.out.println (Arrays.toString(mergedList));

        String[] b1 = {"a", "bigger", "cat"};
        String[] b2 = {"did", "fight"};
        mergedList = mergeSortArrayList (b1, b2);
        System.out.println (Arrays.toString(mergedList));
    }

    static String[] mergeSortArrayList (String[] A, String[] B)
    {
        ArrayList<String> C = new ArrayList<>();
        int aInd = 0, bInd = 0;
        while (aInd<A.length || bInd<B.length) {
            if (aInd >= A.length)
                C.add(B[bInd++]);
            else if (bInd >= B.length)
                C.add(A[aInd++]);
            else {
                if ( A[aInd].compareTo(B[bInd]) < 0 )
                    C.add(A[aInd++]);
                else if ( A[aInd].compareTo(B[bInd]) > 0 )
                    C.add(B[bInd++]);
                else {
                    C.add(A[aInd++]);
                    bInd++;
                }
            }
        }

        String[] merged = new String [C.size()];
        for (int i=0; i<merged.length; i++) {
            merged[i] = C.get(i);
        }
        return merged;
    }

    static String[] mergeSort (String[] A, String[] B)
    {

        int duplicateCnt = 0;
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<B.length; j++) {
                if ( A[i].equals(B[j]) ) duplicateCnt++;
            }
        }

        String[] C = new String [A.length + B.length - duplicateCnt];
        int aInd = 0, bInd = 0;
        for (int cInd=0; cInd<C.length; cInd++) {
            if (aInd >= A.length) {
                C[cInd] = B[bInd++];
            }
            else if (bInd >= B.length) {
                C[cInd] = A[aInd++];
            }
            else {
                if ( A[aInd].compareTo(B[bInd]) < 0) C[cInd] = A[aInd++];
                else if ( A[aInd].compareTo(B[bInd]) > 0) C[cInd] = B[bInd++];
                else {
                    C[cInd] = A[aInd++];
                    bInd++;
                }

            }
        }

        return C;
    }


    static String[] mergeSelectionSort (String[] A, String[] B)
    {
        int bDuplicates = 0;
        for (int i=0; i<B.length; i++) {
            for (int j=0; j<A.length; j++) {
                if ( B[i].equals(A[j]) ) {
                    bDuplicates++;
                }
            }
        }
        System.out.println(bDuplicates);

        String[] merged = new String [A.length + B.length - bDuplicates];
        int merInd = 0;

        for (int i=0; i<A.length; i++) {
            merged[merInd++] = A[i];
        }
        for (int i=0; i<B.length; i++) {
            boolean duplicate = false;
            for (int j=0; j<A.length; j++) {
                if (B[i].equals(A[j])) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) merged[merInd++] = B[i];
        }

        // Selection sort
        for (int i=0; i<merged.length-1; i++) {
            int smallestInd = i;
            for (int j=i+1; j<merged.length; j++) {
                if (merged[j].compareTo(merged[smallestInd]) < 0) smallestInd = j;
            }
            if (smallestInd != i) {
                String temp = merged[i];
                merged[i] = merged[smallestInd];
                merged[smallestInd] = temp;
            }
        }
        return merged;
    }
}
