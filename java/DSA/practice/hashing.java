

public class hashing {
  public static void main(String[] args) {
    int[] arr = {2, 3, 2, 5, 3, 2};
    int[] freq = new int[6];               //Why size 6? Because our values are between 0 and 5.
    for (int i = 0; i < arr.length; i++) {
    freq[arr[i]]++;
}
   
System.out.println("3-> "+freq[3]);



//for complete number
// for (int i = 0; i < freq.length; i++) {
//     if (freq[i] > 0) {
//         System.out.println(i + " -> " + freq[i]);
//     }
// }


  }  
}
