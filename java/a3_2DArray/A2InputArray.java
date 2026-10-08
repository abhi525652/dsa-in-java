import java.util.*;
public class A2InputArray {
    public static void main(String[] args) {
          
     Scanner sc=new Scanner(System.in);
     int[][] arr= new int[3][3];
     System.out.println("Input your value");

     // for input
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        // for output
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }

        //Print like an array -- [1,2,3]
        //output
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        sc.close();
    }
    }

