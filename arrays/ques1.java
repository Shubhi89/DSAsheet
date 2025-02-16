import java.util.*;

public class ques1 {
    public static boolean fun(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) {
            if(!set.add(num)) {
                return true; // contains duplicates
            }
        }
        return false;    
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 2 , 1};
        System.out.println(fun(nums));
    }
}