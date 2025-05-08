class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m=new HashMap<>();
        for(String w:strs){
            char[] c=w.toCharArray();
            Arrays.sort(c);
            String ch=new String(c);
            if(!m.containsKey(ch)){
                m.put(ch,new ArrayList<>());
            }
            m.get(ch).add(w);
        }
        return new ArrayList<>(m.values());
    }
}