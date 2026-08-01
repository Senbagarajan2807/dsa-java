class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s1[i], map1.getOrDefault(s1[i], 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            map2.put(s2[i], map2.getOrDefault(s2[i], 0) + 1);
        }

        return map1.equals(map2);
    }
}