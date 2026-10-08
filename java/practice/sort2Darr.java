import java.util.Arrays;
public class sort2Darr {
    public static void main(String[] args) {
        int[][] arr={{1,6},{2,3},{5,8},{9,4}};
        Arrays.sort(arr,(a,b)-> Integer.compare(a[0], b[0]));
        System.out.println(Arrays.deepToString(arr));
    }
}
