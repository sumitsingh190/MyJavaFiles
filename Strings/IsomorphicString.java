package Strings;

public class IsomorphicString {
    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] mapS = new int[256]; // ASCII for s → t
        int[] mapT = new int[256]; // ASCII for t → s

        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);

            // If mapping is inconsistent, return false
            if (mapS[cs] != mapT[ct]) {
                return false;
            }

            // Use i + 1 to differentiate from default 0 value
            mapS[cs] = i + 1;
            mapT[ct] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));     // true
        System.out.println(isIsomorphic("foo", "bar"));     // false
        System.out.println(isIsomorphic("paper", "title")); // true
    }
}

    
