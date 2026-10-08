

public class A18SpiralTraversal {
     public static void main(String[] args) {
      int[][] arr={
        {1,2,3},
        {4,5,6},
        {7,8,9}};
        int left=0;
        int right=arr.length-1;
        int top=0;
        int bottom=arr[0].length-1;

        while (top<=bottom && left<=right) {
            
        
        //left -- right
        for(int j=left;j<=right;j++){
            System.out.print(arr[top][j]+" ");
        }top++;
        //top -- bottom
        for(int j=top;j<=bottom;j++){
            System.out.print(arr[j][right]+ " ");
        }right --;
        //right -- left
        if (top<=bottom) {
              for(int i=right;i>=left;i--){
            System.out.print(arr[bottom][i]+" ");
        }bottom--;
        }
        //bottom --top
        if (left<=right) {
            for(int i=top;i>=bottom;i--){
                System.out.print(arr[i][left]+ " ");
            }left++;
        }
    }
    }
}
