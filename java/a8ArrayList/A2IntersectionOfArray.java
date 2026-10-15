import java.util.ArrayList;

public class A2IntersectionOfArray {
    public static void main(String[] args) {
        int[] a= {12,13,14,14,15,16,17,17,18};
        int[] b={5,6,7,8,14,17,18};
        System.out.println(intersection(a, b));
      

    }
    public static ArrayList<Integer> intersection(int[] a, int[] b){
        ArrayList<Integer> ans= new ArrayList<>();
        int i=0;
        int j=0;
        while(i<a.length && j<b.length){
            if (a[i]<b[j]) {
                i++;
            }else if (b[j]<a[i]) {
                j++;
            }else{
                ans.add(a[i]);
                i++;
                j++;
            }
        } return ans;
    }
}
