public class Main {
    public static void main(String[] args){

    }

    //BinarySearch

    public static int binarySearch(int[] arr, int item) {
        int low = 0;
        int high = arr.length - 1;
        int guess;

        while (low <= high){
            int mid = (low + high) / 2;
            guess = arr[mid];
            if (guess == item){
                return mid;
            } else if (guess > item) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }

        }
        return -1;
    }

    //FindSmallest
    public static int findSmallest(int[] array){
        int smallest = array[0];
        int smallestIndex = 0;

        for (int i = 1; i < array.length; i++){
                if(array[i] < smallest){
                    smallest = array[i];
                    smallestIndex = i;
                }
        }
        return smallestIndex;
    }

    //selectionSearch
    public static int[] selectionSearch(int[] array){
        int[] newArray = new int[array.length];
        int[] copiedArray = array.clone();
        for (int i = 0;i < copiedArray.length;i++){
            int smallest = findSmallest(copiedArray);
            newArray[i] = copiedArray[smallest];
            copiedArray[smallest] = Integer.MAX_VALUE;
        }

        return newArray;
    }


}