public class BinarySearch {
    public static void main(String[] args){
        int[] array = { 12, 14, 16, 18, 20, 21, 22, 34, 56};
        int target = 15;
        System.out.println(binarySearch(array, target));
    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start<=end){
        int mid = start + ((end - start)/2);

        if(target == arr[mid]){
            return mid;
        }
        if(target<arr[mid]){
            end = mid - 1;
        }
        if(target>arr[mid]){
            start = mid+1;
        }
    }
        return start;
}}
