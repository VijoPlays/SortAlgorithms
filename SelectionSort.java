import java.util.Arrays;

public class SelectionSort {
    private static Comparable[] array = {2,8,4,7,1,5,9,3,6};

    public static void main(String[] args) {
        SelectionSort sSort = new SelectionSort();
        sSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public void sort(Comparable[] a) {
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++)
                if (a[j].compareTo(a[minIndex]) < 0){
                    minIndex = j;
                }
            if (minIndex != i){
                Comparable temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            } //! Remove comments or go to the readMe to understand the algorithms better
            
            //for(int k =0; k<array.length;k++){
            //    System.out.print(array[k] + ", ");
            //}
            //System.out.println();
        }
    }
}
