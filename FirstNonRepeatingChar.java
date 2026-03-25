import java.util.HashMap;

class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "aabbcde";

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find first non-repeating
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                System.out.println(str.charAt(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No non-repeating character");
        }
    }
}