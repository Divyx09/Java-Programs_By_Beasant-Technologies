package problems;

import java.util.*;

public class LongestSubString {

    public static int CheckString(String s) {
        int l = 0;
        int r = 0;
        int n = 0;
        Set<Character> list = new HashSet<Character>();
        while (r < s.length()) {
            char c = s.charAt(r);
            if (list.add(c)) {
                n = Math.max(n, r - l + 1);
                r++;
            } else {
                while (s.charAt(l) != c) {
                    list.remove(s.charAt(l));
                    l++;
                }
                list.remove(c);
                l++;
            }   
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String input = sc.next();
        System.out.println(CheckString(input));
        sc.close();
    }


    public static int CheckStringFor(String s) {
    int n = 0;
    int l=0;
    Set<Character> list = new HashSet<>();
        for( int r=0;r<s.length();r++){
        if (!list.contains(s.charAt(r))) {
            list.add(s.charAt(r));
            n = Math.max(n, r - l + 1);
        } else {
            while (list.contains(s.charAt(r))) {
                list.remove(s.charAt(l));
                l++;
            }
            list.add(s.charAt(r));
        }   
    }
    return n;
    }
}
