import java.util.Arrays;
import java.util.Scanner;

public class array6 {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Enter the array size ");
        Scanner scanner=new Scanner(System.in);
        int size = scanner.nextInt();

        System.out.println("Enter the elements of array");
        int[] nums = new int[size];

        for (int i=0;i<size;i++){
            nums[i]=scanner.nextInt();
        }

        scanner.close();



       boolean result= containsDuplicate(nums);

        System.out.println("Output: " + result);
    }
}
