class Solution {
    public String longestNiceSubstring(String s) {
       if(s.length()<=1)
       return "";
       HashSet<Character> set=new HashSet<>();
       for(int i=0;i<s.length();i++){
        set.add(s.charAt(i));
       } 
       for(int i=0;i<s.length();i++){
        if(set.contains(Character.toUpperCase(s.charAt(i)))&&
        set.contains(Character.toLowerCase(s.charAt(i))))
        continue;
        String s1=longestNiceSubstring(s.substring(0,i));
        String s2=longestNiceSubstring(s.substring(i+1));
        if(s1.length()>=s2.length())
        return s1;
        else
        return s2;
       }
       return s;
    }
}