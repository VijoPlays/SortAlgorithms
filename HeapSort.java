public class HeapSort {
    private static Comparable[] array = {2,8,4,7,1,5,9,3,6};

    public static void main(String[] args) {
        HeapSort hSort = new HeapSort();
        hSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public void sort(Comparable[] array) {
        int n = array.length;
        buildMaxHeap(array, n);
        sortDown(array, n);
    }

    private void buildMaxHeap(Comparable[] a, int n) {
        for (int k = n / 2; k >= 1; k--){
            sink(a, k, n);
        }
    }

    private void sortDown(Comparable[] a, int n) {
        while (n > 1) {
            swap(a, 1, n--);
            sink(a, 1, n);
        }
    }

    private void sink(Comparable[] a, int k, int n) {
        int j;
        while (2 * k <= n) {
            j = 2 * k;

            if (j < n && less(a, j, j + 1)){
                j++;}

            if (!less(a, k, j)){
                break;}

            swap(a, k, j);

            k = j;
        }
    }

    private boolean less(Comparable[] a, int i, int j) {
        return a[i - 1].compareTo(a[j - 1]) < 0;
    }

    private void swap(Object[] a, int i, int j) {
        Object tmp = a[i - 1];
        a[i - 1] = a[j - 1];
        a[j - 1] = tmp;
    }
}
