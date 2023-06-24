import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
       System.out.println("Enter the size of array ");

       Scanner scanner =new Scanner(System.in);
       int size=scanner.nextInt();

       List<Integer> nums =new ArrayList<>();
       System.out.println("Enter the elemets");
       for (int i=0;i<size;i++){
        int num=scanner.nextInt();
        nums.add(num);
       }

       System.out.println("Enter the value you want to remove");
       int val=scanner.nextInt();


        int result = removeElements(nums, val);

        System.out.println("Output: " + result);
        System.out.println("nums: " + nums);

        scanner.close();
        
    }

    public static int removeElements(List<Integer> nums, int val) {
        nums.removeAll(List.of(val));
        return nums.size();
}
}
