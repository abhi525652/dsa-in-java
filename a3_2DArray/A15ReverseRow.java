public class A15ReverseRow {
    public static void main(String[] args) {
        
           int[][] arr={{1,2,3},
                        {4,5,6},
                        {7,8,9},};
        //reverse row
        for(int i=0;i<arr.length;i++){
        int left=0;
        int right=arr[i].length-1; 
        int temp;
        while (left<right) {
        temp=arr[i][left];
        arr[i][left]=arr[i][right];
        arr[i][right]=temp;
        left++;
        right--;
        }
        }

        //Print matrices
        System.out.println("New matrices");
        for (int i = 0; i < arr.length; i++) {
            for(int j=0;j<arr[i].length;j++){
                  System.out.print(arr[i][j]+ " ");
            }System.out.println();
          
        }
       
    }
}
