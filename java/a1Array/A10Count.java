public class A10Count {
    public static void main(String[] args) {
      int[] arr = {-5, 8, 0, -2, 7, 0, 10, -1};
      int positive=0;
      int negative=0;
      int zero=0;
       for(int i=0;i<arr.length;i++){
       if(arr[i]<0){
        negative ++;
       }else if (arr[i]>0) {
        positive ++;
       }
       else if(arr[i]==0){
        zero ++;
       }
       }
       System.out.println("num of nagative =" + negative);
       System.out.println("num of positive =" + positive);
       System.out.println("num of zero =" + zero);

    }

}
