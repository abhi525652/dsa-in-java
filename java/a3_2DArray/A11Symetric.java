public class A11Symetric {
   


    public static void main(String[] args) {
        int[][] arr={{1,2,3},
                     {4,5,6},
                     {7,8,9},};
                     boolean IsSymetric=true;
             for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if ( arr[j][i]!=arr[i][j]) {
                  IsSymetric=false;
                  break;
                }
          }
        } if (!IsSymetric) {
            System.out.println("not symetric");
          }
    }
}


