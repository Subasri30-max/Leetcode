class Solution {
    public String longestNiceSubstring(String s) {
       if(s.length()<=1)
       return ""; 
       for(int i=0;i<s.length();i++){
        if(s.indexOf(Character.toUpperCase(s.charAt(i)))!=-1&&
        s.indexOf(Character.toLowerCase(s.charAt(i)))!=-1)
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