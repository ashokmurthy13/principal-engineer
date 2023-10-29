package Coding.TwoPointers;

class ValidPalindrome {
    public static void main(String[] args) {
        String[] testCase = {
                "raceacar",
                "kayak",
                "A",
                "ABCDEFGFEDCBA",
                "ABC",
                "ABCBA",
                "ABBA",
        };
        for (int i = 0; i < testCase.length; i++) {
            boolean check = isValidPalindrome(testCase[i]);
            System.out.printf("Is string '%s' a palindrome? : %b%n", testCase[i], check);
        }
    }

    // TimeComplexity : Linear : O(n). But the algorithm will only run (n/2) times, since two pointers are traversing toward each other.
    // SpaceComplexity : O(1)
    static boolean isValidPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}