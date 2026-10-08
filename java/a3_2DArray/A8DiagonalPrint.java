public class A8DiagonalPrint {
     public static void main(String[] args) {
      int[][] arr={
        {1,2,3},
        {4,5,6},
        {7,8,9}};
         System.out.println("Main Diagonal ");
          for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
              if (i==j) { 
                System.out.print(" "+arr[i][j]);
              }
             
               }
            }
            System.out.println();
            System.out.println("Secondary Diagonal");
             for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
              if (i+j==2) { 
                System.out.print(" "+arr[i][j]);
              }
             
               }
            }
        } 
      
    }

