
public class A16ReverseColumn {
     public static void main(String[] args) {
        
           int[][] arr={{1,2,3},
                        {4,5,6},
                        {7,8,9},};
        //reverse column
        for(int j=0;j<arr[0].length;j++){
        int left=0;
        int right=arr.length-1; 
        int temp;
        while (left<right) {
        temp=arr[left][j];
        arr[left][j]=arr[right][j];
        arr[right][j]=temp;                                     //important note                    
        left++;                                                 // for Reverse column           //for reverse row
        right--;                                                // arr[left][j]                // arr[j][left]
        }
        }
        System.out.println("Reverse Column");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }System.out.println();
        }
    }
}
