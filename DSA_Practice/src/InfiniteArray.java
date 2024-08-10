public class InfiniteArray {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6, 9, 10, 20, 22, 25, 90};
        //start with the box of size 2

        int target = 10;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);

    }

    //so this is an infinite array and we are trying to find the target
    //need to do binary search
    //arr = 2,3,4,6,8,20,24, 30, target = 15
    //since we don't know end we can check in chunks
    //we can also optimize how we find the start and end (increasing size of window)
    //just kep multipling through, apply simple binary search
    static int binarySearch(int[] nums, int target, int start, int end){

            while(start <= end){
                int mid = start + (end-start)/2;

                if(target < nums[mid]){
                    end = mid-1;
                }
                else if(target > nums[mid]){
                    start = mid+1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
    }

