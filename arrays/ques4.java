public class ques4 {
    public static int trappedWater(int arr[]) {
        int n = arr.length;
        int water = 0; int left = 0; int right = n-1;
        int leftMax = arr[left] ; int rightMax = arr[right];

        while(left < right) {
            if(leftMax < rightMax) {
                left++;
                leftMax = Math.max(leftMax , arr[left]);
                water += leftMax - arr[left];
            } else { // rightMax > leftMax
                right--;
                rightMax = Math.max(rightMax , arr[right]);
                water += rightMax - arr[right];
            }
        }
        return water;
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        System.out.println(trappedWater(arr));
    }
}
