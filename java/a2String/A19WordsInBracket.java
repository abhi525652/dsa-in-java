public class A19WordsInBracket {
    public static void main(String[] args) {
        String str="I am the student of Tit";
        String[] num=str.split(" ");
        for(int i=0;i<num.length;i++){
            System.out.print("["+num[i]+"]"+" ");
        }
    }
}
