public class LinearSearch {

    public int searchByIterativeAlgorithm(int [] list , int key , int start){

        while (start<list.length){

            if (list[start] == key){
                System.out.println("The element exists in your array " + start + "th index");
                return 1;
            }else{
                start++;
            }
        }

        System.out.println("This element does not exist...");
        return 0;
    }

    public boolean searchByRecursiveAlgorithm(int []list,int key ,int start,int N ) {


        if (N==0){
            return false ;
        }else if (list[start] == key){
            return true;
        }

        return searchByRecursiveAlgorithm(list,key,start+1,N-1);

    }




    public static void main(String[] args) {
        int [] list = new int[]{5,14,2,70,28,145,16,51};
        LinearSearch linearSearch = new LinearSearch();
        linearSearch.searchByIterativeAlgorithm(list,10,0);
        boolean b =linearSearch.searchByRecursiveAlgorithm(list,145,0,list.length);
        System.out.println(b);

    }
}
