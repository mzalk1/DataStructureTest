import java.util.Arrays;

class BubbleSort {

    //Always swap big elements to small elements
    //In Place --> YES
    //Stable --> YES
    //BigO --> O(N^2)

    public int[] sortByIterative(int[] list){

        for (int i =0; i<list.length-1; i++){

            for (int k =0; k<(list.length-1)-i; k++){

                if (list[k]>list[k+1]){
                    int big = list[k];
                    int min = list[k+1];
                    list[k+1] = big;
                    list[k]=min;
                }else{
                    continue;
                }
            }
            }

        return list;
    }


    public int[] sortByRecursive(int[] list,int leftIx, int rightIx){



        if (rightIx<list.length){

            if (list[leftIx]>list[rightIx]){
                int big = list[leftIx];
                int min = list[rightIx];

                list[rightIx]= big;
                list[leftIx]=min;
            }else {
                sortByRecursive(list,leftIx+1,rightIx+1);
            }

            sortByRecursive(list,leftIx+1,rightIx+1);

        }

        return list;
    }

    public static void main(String[] args) {
        int[] list = new int[]{1,5,2,3,10,70,42,58,14};
        BubbleSort bubbleSort = new BubbleSort();

        System.out.println(Arrays.toString(bubbleSort.sortByIterative(list)));
        System.out.println(Arrays.toString(bubbleSort.sortByRecursive(list,0,1)));


    }
}
