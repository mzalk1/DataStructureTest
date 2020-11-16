public class LinearSearch {

    public int searchByIterativeAlgorithm(int [] list , int key , int start,int lenght){

        while (start<lenght){

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

    public int searchByRecursiveAlgorithm(int []list,int key ,int start ) {


        if (start < list.length) {
            if (list[start] == key) {
                System.out.println("The element exists in your array " + start + "th index");
                return start;
            } else {
                return searchByRecursiveAlgorithm(list, key, ++start);
            }
        }

        System.out.println("This element does not exist...");
        return 0;


    }




    public static void main(String[] args) {
        int [] list = new int[]{5,14,2,70,28,145,16,51};
        LinearSearch linearSearch = new LinearSearch();
        //linearSearch.searchByIterativeAlgorithm(list,10,0);
        linearSearch.searchByRecursiveAlgorithm(list,70,0);


    }
}
