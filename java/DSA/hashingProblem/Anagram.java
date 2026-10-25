public class Anagram {
    public static void main(String[] args) {
        String s1="aabbc";
        String s2="caabb";
        int[] freq=new int[26];

        if (s1.length()!=s2.length()) {
            System.out.println("No Anagram");
            return ;
        }
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if (freq[i]!=0) {
                System.out.println("No Anagram");
                return ;
            }

        }
        System.out.println("Anagram");
        
    }
}
