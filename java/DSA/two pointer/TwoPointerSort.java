public class TwoPointerSort {
    public static void sortZeroesAndOnes(int[] nums) {
        // Initialize two index "pointers"
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            // Move the left pointer forward if it already points to 0
            if (nums[left] == 0) {
                left++;
            } 
            // Move the right pointer backward if it already points to 1
            else if (nums[right] == 1) {
                right--;
            } 
            // If left points to 1 and right points to 0, swap them
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 0, 0, 1};
        sortZeroesAndOnes(arr);
        
        // Output: [0, 0, 0, 1, 1, 1, 1]
        System.out.println(java.util.Arrays.toString(arr)); 
    }
}
