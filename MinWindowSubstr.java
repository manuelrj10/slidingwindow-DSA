import java.util.HashMap;

class MinWindowSubstr {
    public static void main(String[] args) {
        String S = "ADOBECODEBANC";
        String T = "ABC";

        HashMap<Character, Integer> mapT = new HashMap<>();
        HashMap<Character, Integer> mapS = new HashMap<>();

        // Build frequency map for T
        for (char c : T.toCharArray()) {
            mapT.put(c, mapT.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int have = 0;
        int need = mapT.size();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for (int right = 0; right < S.length(); right++) {
            char rchar = S.charAt(right);
            mapS.put(rchar, mapS.getOrDefault(rchar, 0) + 1);

            // Check if requirement satisfied
            if (mapT.containsKey(rchar) && mapS.get(rchar).equals(mapT.get(rchar))) {
                have++;
            }

            // Try shrinking window
            while (have == need) {
                // Update best window
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char lchar = S.charAt(left);
                mapS.put(lchar, mapS.get(lchar) - 1);

                if (mapT.containsKey(lchar) && mapS.get(lchar) < mapT.get(lchar)) {
                    have--;
                }

                left++;
            }
        }

        if (minLen == Integer.MAX_VALUE) {
            System.out.println("");
        } else {
            System.out.println(S.substring(start, start + minLen));
        }
    }
}
