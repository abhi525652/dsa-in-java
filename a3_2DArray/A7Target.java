public class A7Target {
   public static void main(String[] args) {
      int[][] arr={
        {1,2,3},
        {4,5,6},
        {7,8,9},
        {40,50,60}};
        int target=50;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               if (arr[i][j]==target) {
                System.out.println(i+" "+j);
                break;
               }
            }
        }
    }
}


