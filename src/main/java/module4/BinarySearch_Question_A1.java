package module4;

public class BinarySearch_Question_A1 {

    public static void main(String[] args)
    {
        char[] data = {'a', 'c', 'e', 'g', 'i', 'k'};

        char c = 'i';

        binarySearch (data, c, 0, data.length-1);
    }

    static void binarySearch (char[] data, char c, int start, int end)
    {
        if (data[start]==c || data[end]==c) {
            System.out.println("Found");
            return;
        }
        if (start>=end){
            System.out.println("NOT Found");
            return;
        }
        int mid = (end+start)/2;
        if (c<=data[mid]){
            binarySearch(data, c, start, mid);
        }
        else {
            binarySearch(data, c, mid+1, end);
        }

    }
}
