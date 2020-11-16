import java.util.Arrays;

class BubbleSort {

    //Always swap big elements to small elements
    //In Place --> YES
    //Stable --> YES
    //BigO --> O(N^2)

    public int[] sortByIterative(int[] list){
        int [] tempList = list;

        for (int i =0; i<list.length-1; i++){

            for (int k =0; k<(list.length-1)-i; k++){

                if (tempList[k]>tempList[k+1]){
                    int big = tempList[k];
                    int min = tempList[k+1];
                    tempList[k+1] = big;
                    tempList[k]=min;
                }else{
                    continue;
                }
            }
            }

        return tempList;
    }


    public int[] sortByRecursive(int[] list){

        return null;
    }

    public static void main(String[] args) {
        int[] list = new int[]{1,5,2,3,10,70,42,58,14};
        BubbleSort bubbleSort = new BubbleSort();

        System.out.println(Arrays.toString(bubbleSort.sortByIterative(list)));

    }
}
