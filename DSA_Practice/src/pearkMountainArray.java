public class pearkMountainArray {
    public static void main(String[] args){


    }

    public int binarySearch(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //could be middle
                end = mid;
            }
            else{
                start = mid+1;
                //mid+1 element is greater than mid elemtn
            }

        }
    return 1;
    }
}
