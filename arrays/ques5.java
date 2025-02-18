import java.util.*;
public class ques5 {
    public static void threeSum(int arr[]) {
        List<Integer> triplet = new ArrayList<>();

        int n = arr.length;
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    if(arr[i]+arr[j]+arr[k] == 0) {
                        triplet.add(arr[i]);
                        triplet.add(arr[j]);
                        triplet.add(arr[k]);
                    }
                    
                }
            }
        }
        System.out.println(triplet);
    }
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        threeSum(arr);
    }
}
