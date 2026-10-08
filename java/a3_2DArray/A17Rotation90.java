public class A17Rotation90 {
    public static void main(String[] args) {
        
           int[][] arr={{1,2,3},
                        {4,5,6},
                        {7,8,9},};

        //transpose
        int[][] transpose=new int[3][3];
        for(int i=0;i<arr.length;i++){
       for(int j=0;j<arr[i].length;j++){                            //90° Clockwise rotation
            transpose[j][i]=arr[i][j];                             //Transpose + Reverse Each Row
        }
        } 
        //Reverse row
        for(int i=0;i<transpose[0].length;i++){
        int left=0;
        int right=transpose.length-1; 
        int temp;
        while (left<right) {
         temp=transpose[i][left];
        transpose[i][left]=transpose[i][right];
        transpose[i][right]=temp;
        left++;
        right--;                                            
        }
        }
        System.out.println("Rotation 90");
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[i].length;j++){
                System.out.print(transpose[i][j]+ " ");
            }System.out.println();
        }
    }
}
