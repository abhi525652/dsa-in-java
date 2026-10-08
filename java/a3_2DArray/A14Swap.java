import java.util.Arrays;

public class A14Swap {
    public static void main(String[] args) {
         int[][] arr1={{1,2,3},
                     {4,5,6},
                     {7,8,9},};
        int[][] arr2={{9,8,7},
                      {6,5,4},
                      {3,2,1}};  
         int[][] temp=new int[3][3];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                temp[i][j]=arr1[i][j];
                arr1[i][j]=arr2[i][j];
                arr2[i][j]=temp[i][j];
            }
        }
        System.out.println("Array first -->");
         for(int i=0;i<arr1.length;i++){
            System.out.print(Arrays.toString(arr1[i]));
            System.out.println();
           }
        System.out.println("Array second -->");
         for(int i=0;i<arr1.length;i++){
        System.out.print(Arrays.toString(arr2[i]));
          System.out.println(); 
    }
}
}
