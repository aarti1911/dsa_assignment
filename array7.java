import java.util.Arrays;
public class array7 {
    public static void moveZeroes(int[] nums) {
        int pos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
                pos++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        
        moveZeroes(nums);

        System.out.println("Output: " + Arrays.toString(nums));
    }
}
