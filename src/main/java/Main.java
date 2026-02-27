public class Main {
    public static void main(String[] args){

    }

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



}