class Main {
    public static void main(String[] args) {
        int[] list = new int[]{2,5,9,10,21,92,100};

        //Binary Search objects and Searching methods
        BinarySearch binarySearch = new BinarySearch();
        //BinarySearch by Recursive
        binarySearch.searchByRecursive(list,0,list.length-1,11); // exists
        //BinarySearch by Iterative
        binarySearch.searchByIterativeAlgorithm(list,0,list.length-1,12);//d.n.e.


    }
}
