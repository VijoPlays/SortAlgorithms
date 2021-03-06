import java.util.Arrays;

public class InsertionSort{
    private static Comparable[]array = {12,13,24,10,3,6,90,70};

    public static void main(String[] args) {
        InsertionSort insert = new InsertionSort();
        insert.sort(array, 0, array.length);
        System.out.println(Arrays.toString(array));
    }

    public void sort(Object[] a, int fromIndex, int toIndex) {
        Object d;
        int j;

        for (int i = fromIndex + 1; i < toIndex; i++) {
            d = a[i];
            j = i;
            while (j > fromIndex && ((Comparable) a[j - 1]).compareTo(d) > 0) {
                a[j] = a[j - 1];
                j--;}
            a[j] = d; //! Remove comment or go to the readMe to understand the code better
            //for(int k=0;k<array.length; k++){
            //    System.out.print(array[k] + ", ");}
            //System.out.println();
        }
    }
}
