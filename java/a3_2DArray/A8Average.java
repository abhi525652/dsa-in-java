public class A8Average {
     public static void main(String[] args) {
      int[][] arr={
        {1,2,3},
        {4,5,6},
        {7,8,9}};
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               sum=sum+arr[i][j];
               count++;
            }
        }int average=sum/count;
        System.out.println(average);
    }
}
