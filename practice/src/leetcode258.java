public class leetcode258
{
    public static void main(String[] args) {
        int n = 38;
        int k=0;
        String s= String.valueOf(n);
        for(int i=0;i<s.length()-1;i++)
        {
         k=s.charAt(i)+s.charAt(1);
        }
        System.out.println(k);
    }
}
