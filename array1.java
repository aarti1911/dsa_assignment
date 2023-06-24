import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two elements add up to the target.");
    }
}

public class array1 {
    public static void main(String[] args) {

        System.out.println("Enter the target element");
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();

        System.out.println("Enter the size of array");
        int size =sc.nextInt();
        System.out.println("Enter the array elements");

        int [] nums=new int[size];

        for (int i=0;i<size;i++){
         nums[i] =sc.nextInt();
        }

        sc.close();
        

        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
