import java.util.Arrays;

class SelectionSort {


    /*Scan array and select smallest key, swap with A[1];
    scan remaining keys, select smallest and swap with A[2]; repeat until last element is reached*/
    //In Place --> YES
    //Stable --> NO
    //BigO --> O(N^2)


    public int[] searchByIterative(int[] list){

        int key;
        int max;



        for (int i =0; i<list.length-1; i++){
            for (int j =i; j<list.length-1; j++){

                if (list[i]<=list[j+1]){
                    key = list[i];
                    continue;

            }else{
                    max = list[i];
                    key=list[j+1];
                    list[i]=key;
                    list[j+1]=max;

                }


            }
        }
        return list;


    }


    public static void main(String[] args) {

        int[] list ={2,1,4,3,8,15,3,0,7};
        SelectionSort selectionSort = new SelectionSort();

        System.out.println(Arrays.toString(selectionSort.searchByIterative(list)));
    }
}
