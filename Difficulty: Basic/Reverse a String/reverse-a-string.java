

class Solution {
    static String revStr(String s) {
        // code here
        /* String rev ="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev = rev+s.charAt(i);
        }
        return rev; */

//working one -

        char a[] = s.toCharArray();
        char reva[] = new char[a.length];
        for(int i = a.length-1, j =0;i>=0; i--,j++)
        {
            reva[j]= a[i];
        }
        String rev = new String(reva);
        return rev;
    }
}