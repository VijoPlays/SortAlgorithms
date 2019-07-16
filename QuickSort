import java.util.Arrays;

public class QuickSort {
    private static Comparable[] array = {5,8,4,7,1,5,9,3,6};

    public static void main(String[] args) {
        QuickSort qsort = new QuickSort();
        qsort.sort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public void sort(Comparable[] arr, int low, int high) {
        if (low < high) {
            int i = low, j = high;
            Comparable x = arr[(i + j) / 2];

            do {
                while (arr[i].compareTo(x) < 0) i++;
                while (x.compareTo(arr[j]) < 0) j--;

                if ( i <= j) {
                    Comparable tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                    i++;
                    j--;
                }

            } while (i <= j);

            //! Remove comments if you want to understand the code better, or watch the video in the Readme

            //for(int k =0; k<array.length;k++){
            //    System.out.print(array[k] + ", ");
            //}
            //System.out.println();

            sort(arr, low, j);
            sort(arr, i, high);
        }
    }
}
