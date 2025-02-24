package DSAsheet.arrays;

public class ques2 {
    public static int findTarget(int arr[] , int target) {
        int n = arr.length;
        int st = 0 ; int end = n-1;

        while(st <= end) {
            int mid = (st+end)/2;
            if(arr[mid] == target) {
                return mid;
            }
            if(arr[st] <= arr[mid]) { 
                if(target >= arr[st] && target < arr[mid]) { // left half
                    end = mid-1;
                } else {
                    st = mid+1;
                }
            } else {
                if(target > arr[mid] && target <= arr[end]) { // right half
                    st = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(findTarget(arr, target));
    }
}
