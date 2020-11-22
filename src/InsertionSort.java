import java.util.Arrays;

class InsertionSort {
    /*Scan array and select smallest key, swap with A[1];
    scan remaining keys, select smallest and swap with A[2]; repeat until last element is reached*/
    //In Place --> YES
    //Stable --> YES
    //BigO --> O(N^2)



    public int[] sortByIterative(int[]list){
        int temp;
        int j;
        for (int i =1; i<list.length; i++){
            temp=list[i];
            for (j = i; j>0 && list[j-1]>temp; j--){

                list[j]=list[j-1];

            }
            list[j]=temp;
        }


        return list;
    }



    public static void main(String[] args) {
        int[] list ={2,1,4,3,8,15,3,0,7};
        InsertionSort insertionSort = new InsertionSort();
        System.out.println(Arrays.toString(insertionSort.sortByIterative(list)));


    }
}
