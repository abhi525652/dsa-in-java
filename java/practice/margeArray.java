 import java.util.Arrays;
 public class margeArray {
   


    public static void main(String[] args) {
        int[] array1 = {1, 6, 3};
        int[] array2 = {3, 5, 6};

        // Create a new array with the combined length
        int[] mergedArray = new int[array1.length + array2.length];

        // Copy the first array into the beginning of the merged array
      //  System.arraycopy(array1, 0, mergedArray, 0, array1.length);

        // Copy the second array into the merged array, starting where array1 ended
        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
        Arrays.sort(mergedArray);
        // Print the result: [1, 2, 3, 4, 5, 6]
        System.out.println(Arrays.toString(mergedArray));
    }
}


