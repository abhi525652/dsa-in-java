public class A9SumOfDiagonal {
   
     public static void main(String[] args) {
      int[][] arr={
        {1,2,3},
        {4,5,6},
        {7,8,9}};
            int MainDiagoalSum=0;
            int SecondaryDiagonalSum=0;
          for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
              if (i==j) { 
                MainDiagoalSum=MainDiagoalSum+arr[i][j];
              }
             
               }
            }System.out.println(MainDiagoalSum);
             for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
              if (i+j==2) { 
               SecondaryDiagonalSum=SecondaryDiagonalSum+arr[i][j];
              }
             
               }
            } System.out.println(SecondaryDiagonalSum);
        }
      
    }



