import java.util.*;

public class MergeSort {

    public static void main (String[] argv)
    {
	int[] A = {13, 1, 22, 11, 67, 101, -4, 89, 5, 23, 4, 48, 128};
	mergeSort (A);
	System.out.println (Arrays.toString(A));
    }

    static void mergeSort (int[] inputArray)
    {
	if (inputArray.length < 2) {
	    return;
	}

	if (inputArray.length == 2) {
	    if (inputArray[0] > inputArray[1]) {
		//System.out.println ("Before swap inputArray[0]=" + inputArray[0] + " inputArray[1]=" + inputArray[1]);
		int temp = inputArray[0];
		inputArray[0] = inputArray[1];
		inputArray[1] = temp;
		//System.out.println ("After swap inputArray[0]=" + inputArray[0] + " inputArray[1]=" + inputArray[1]);
	    }
	    return;
	}
	    
	int half = inputArray.length / 2;
	
	int[] leftHalf = new int [half];
	for (int i=0; i<half; i++) {
	    leftHalf[i] = inputArray[i];
	}
	//System.out.println (Arrays.toString(leftHalf));	
	int[] rightHalf = new int [inputArray.length - half];
	for (int i=0; i<rightHalf.length; i++) {
	    rightHalf[i] = inputArray[i+half];
	}
	//System.out.println (Arrays.toString(rightHalf));

	mergeSort (leftHalf);
	mergeSort (rightHalf);

	merge (inputArray, leftHalf, rightHalf);
    } // end-mergeSort

    static void merge (int[] inputArray, int[] leftHalf, int[] rightHalf)
    {
	int i = 0, j = 0, k = 0;

	while (i < leftHalf.length && j < rightHalf.length) {
	    if (leftHalf[i] <= rightHalf[j]) {
		inputArray[k] = leftHalf[i];
		i++;
	    }
	    else {
		inputArray[k] = rightHalf[j];
		j++;
	    }
	    k++;
	}

	while (i < leftHalf.length) {
	    inputArray[k] = leftHalf[i];
	    i++;
	    k++;
	}

	while (j < rightHalf.length) {
	    inputArray[k] = rightHalf[j];
	    j++;
	    k++;
	}
	

    } // end-merge

}
