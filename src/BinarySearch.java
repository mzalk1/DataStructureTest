public class BinarySearch {
    // The array which we will search on it must be sorted!!
    //Time Complexity is O(log2(N))


    public int searchByIterativeAlgorithm(int[] tempList, int leftIx, int rightIx, int key) {
        int mid;
        //this loop will continue until left element less or equal than right element
        while (leftIx <= rightIx) {
            mid = (rightIx + leftIx) / 2;
            if (tempList[mid] < key) {
                leftIx = mid + 1;
            } else if (tempList[mid] > key) {
                rightIx = mid - 1;
            } else {
                System.out.println("The element exists in your array " + mid + "th index");
                return 0;
            }
        }

        System.out.println("This element does not exist...");
        return 0;
    }

    public int searchByRecursive(int[] tempList, int leftIx, int rightIx, int key) {
        int mid = (leftIx + rightIx) / 2;

        if (leftIx <= rightIx) {

            if (tempList[mid] == key) {
                System.out.println("the element exists in your array" + mid + "th index");
                return 0;
            } else if (tempList[mid] < key) {
                return searchByRecursive(tempList, mid + 1, rightIx, key);
            } else {
                return searchByRecursive(tempList, leftIx, mid - 1, key);
            }
        }
        System.out.println("This element does not exist...");
        return 0;


    }
}
