public class A14Frequent {
    
    public static void main(String[] args) {
    int[] arr = {2, 5, 2, 7, 2, 9, 5};
    int target = 2;
    int count=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            count++;
        }
       }System.out.println("Frequency = " +count);

    }
}
