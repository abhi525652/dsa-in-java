public class A5LargestElement {
   
     public static void main(String[] args) {
      int[][] arr={
        {1,2,3},
        {4,5,6},
        {7,8,9}};
        int Largest=0; //whenever element is in negative use --Largest=arr[0][0];
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (arr[i][j]>Largest) {
                    Largest=arr[i][j];
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("Largest Interger -->"+Largest);
        System.out.println("Smallest Integer -->"+min);
    }
}


