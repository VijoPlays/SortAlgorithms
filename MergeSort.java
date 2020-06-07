import java.util.*;

public class MergeSort {
    private static Comparable[] array = {47, 27, 19, 64, 13, 33, 11, 7, 6, 9};

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();

        mergeSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static Comparable[] sort(Comparable[] list){
        if (list.length <= 1) {
            return list;
        }

        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        //! Remove the comments here to understand the code a bit better, by showing you how the algorithm iterates... or by clicking the video in the Readme, whichever you prefer.
        
        //System.out.print("First part: ");
        //for(int i =0; i<first.length;i++){
        //    System.out.print(first[i] + ", ");
        //}
        //System.out.println();
        //System.out.print("Second part: ");
        //for(int i =0; i<second.length;i++){
        //    System.out.print(second[i] + ", ");
        //}
        //System.out.println();

        sort(first);
        sort(second);

        merge(first, second, list);
        return list;
    }

    private static void merge(Comparable[] first, Comparable[] second, Comparable[] result){
        int iFirst = 0, iSecond = 0, iMerged = 0;

        while (iFirst < first.length && iSecond < second.length)
        {
            if (first[iFirst].compareTo(second[iSecond]) < 0)
            {
                result[iMerged] = first[iFirst];
                iFirst++;
            }
            else
            {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }
}
