public class A9LargestWord {
      public static void main(String[] args) {
        String name="abhishek singh is programmer and jafahhdsgjdak";
        String[] ne =name.split(" ");
        String largest=ne[0];
        for(int i=1;i<ne.length;i++){
            if (ne[i].length()>largest.length()) {
                largest=ne[i];
                
            }
        }System.out.println(largest);
    }
}
