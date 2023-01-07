public class Main {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int key=3;
        System.out.println(RecSeq(key, arr, arr.length-1));
    }
    static int RecSeq(int key, int[] arr, int n)
    {
        if(n<0) { // Base case - not found
            return -1;
        }
        if(arr[n]==key) { // Base case - found
            return n;
        }
        // Recursive case
        return RecSeq(key, arr, n-1);

    }
}