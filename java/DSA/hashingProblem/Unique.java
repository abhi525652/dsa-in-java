public class Unique {
  public static void main(String[] args) {
     int[] arr={2,3,4,2,4,6,8,3,4,6,10};
        int[] freq=new int[11];

        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]==1) {
                System.out.println(i);
            }
        }
  }  
}
