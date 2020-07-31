class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s1=s.toCharArray();
        Arrays.sort(s1);
        char[] s2=t.toCharArray();
        Arrays.sort(s2);
        return String.valueOf(s1).equals(String.valueOf(s2));
    }
}
