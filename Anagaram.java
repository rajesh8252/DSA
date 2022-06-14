class Anagaram 
{
    public boolean isAnagram(String s, String t) {
        if(t.length()!=s.length())
        {
            return false;
        }
        
        int a[]=new int[26];
        
        for(int i=0;i<t.length();i++)
        {
            
            a[t.charAt(i)-'a']++;
            a[s.charAt(i)-'a']--;
            
        }
        for(int n:a)
        {
           if(n!=0)
           {
               return false;
           }
        }
        
        return true;
    }
    public static void main(String[] args) {
        Anagaram s1=new Anagaram();
        System.out.println(s1.isAnagram("george","egroeg"));
    }
}
