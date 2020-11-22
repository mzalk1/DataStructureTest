import java.util.Arrays;

class SelectionSort {


    /*Scan array and select smallest key, swap with A[1];
    scan remaining keys, select smallest and swap with A[2]; repeat until last element is reached*/
    //In Place --> YES
    //Stable --> NO
    //BigO --> O(N^2)


    public int[] sortByIterative(int[] list){

        int leftNum;
        for (int i =0; i<list.length-1; i++){
            leftNum=i; //index of our leftNumber
            for (int j =i; j<list.length-1; j++){

                if (list[i]<=list[j+1]){

                    continue;
            }else{

                    swap(list,leftNum,j+1);

                }
            }
        }
        return list;
    }

    public void swap(int[]list,int leftNum,int rightNum){

        int temp = list[leftNum];
        list[leftNum]=list[rightNum];
        list[rightNum]=temp;

    }


    public static void main(String[] args) {

        int[] list ={2,1,4,3,8,15,3,0,7};
        SelectionSort selectionSort = new SelectionSort();

        System.out.println(Arrays.toString(selectionSort.sortByIterative(list)));
    }
}
