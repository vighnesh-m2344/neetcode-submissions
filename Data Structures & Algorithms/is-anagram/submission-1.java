class Solution {
    public boolean isAnagram(String s, String t) {
           if(s.length()!=t.length()){
            return false;}
        HashMap<Character,Integer> hm = new HashMap<>();
     

        
        for(int i=0;i<s.length();i++)
        {
          Character ch=s.charAt(i);
          hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++)
        {
            Character ch=t.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)-1);
        }
        for(int n : hm.values())
        {
            if(n!=0)
            {
                return false;
            }
        }
        return true;
    }
}
