//15. Count number of words, number of characters without spaces, number of vowels and consonant from the given string:
//        "I live in Bangladesh"

public class StringExample {
    public static void main(String[] args) {
        String input = "I live in Bangladesh";
        int wordCount = 0;
        int charCountWithoutSpaces = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (Character.isLetter(c)) {
                charCountWithoutSpaces++;
                if (isVowel(c)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            } else if (Character.isWhitespace(c)) {
                wordCount++;
            }
        }

        wordCount++;

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of chars without spaces: " + charCountWithoutSpaces);
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

