public class ceilingofNum {

    //given an array with arr = [2,3,5,9,14,16,18]
    //in ascending order and we are trying to find the ceiling of the target number
    //if target is equal to 15 (ceiling = the array find
    // the smallest number that is greater than or equal to target number)
    //for 5 if it is target 9 is the next greater than or equal to
    //ceiling(14) = 14
    //ceiling(15) find next element that is smaller but greater so 16

    static int ceilingofNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }

        return end;
    }


}
