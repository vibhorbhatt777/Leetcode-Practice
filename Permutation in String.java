class Solution {
    public boolean checkInclusion(String s1, String s2) {
         if (s1 == null || s2 == null) return false;
        if (s2.length() < s1.length()) return false; // bcz s2 never be small than s1

        int[] arr = new int[15];
        int[] arr1 = new int[15];

        int s1Length = s1.length();
        int s2Length = s2.length();

        for (int i = 0; i < s1Length; i++) {
            arr[s1.charAt(i) - 'a']++;
            arr1[s2.charAt(i) - 'a']++;
        }

        for (int i = s1Length; i < s2Length; i++) {// sliding window over s2
            if (Arrays.equals(arr, arr1)) {
                return true;
            }
            arr1[s2.charAt(i - s1Length) - 'a']--;
            arr1[s2.charAt(i) - 'a']++;
        }

        return Arrays.equals(arr, arr1);   
            
        }
    }
