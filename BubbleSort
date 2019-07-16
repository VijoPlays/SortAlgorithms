import java.util.Arrays;

public class BubbleSort {
    private static Comparable[] array = {2,8,4,7,1,5,9,3,6};

    public static void main(String[] args) {
    BubbleSort bubble = new BubbleSort();
    bubble.sort(array);
    System.out.println(Arrays.toString(array));
    }

    public void sort(Comparable[] array){
        boolean sorted = false;
        int elementNum = array.length;
        while(!sorted){
            sorted = true;
            for(int i=0;i<elementNum-1;i++){
                if(array[i].compareTo(array[i+1])>0){
                    Comparable temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    sorted = false;
                }       //!! If you want to understand the algorithm better, you can remove the comments here or you can click on the link in the Readme.
                // for(int j=0;j<array.length; j++){
                //    System.out.print(array[j] + ", ");
                //}
                //System.out.println();
            }
            elementNum--;
        }
    }
}
