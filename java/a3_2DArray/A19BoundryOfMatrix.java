

public class A19BoundryOfMatrix {
   public static void main(String[] args) {
    int[][] arr ={{1,2,3,4},
                  {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
    int left=0;
    int right = arr[0].length - 1;   // Last column
    int top=0;
    int bottom = arr.length - 1;      // Last row
   
         
        //left--right
        for(int i=0;i<=right;i++){
        System.out.print(arr[top][i]+ " ");
    }

    //top --bottom
    for(int i=1;i<=bottom;i++){
        System.out.print(arr[i][right]+ " ");
    }

    //left --right
    if(top<=bottom){
        for(int i=right-1;i>=left;i--){
            System.out.print(arr[bottom][i]+" ");
        }
    }if (left<=right) {
        for(int i=bottom-1;i>=top;i--){
            System.out.print(arr[i][left]+ " ");
        }
    }
    }
  
   } 

