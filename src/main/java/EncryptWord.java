//16. Encrypt word: ROADTOSDET [when A=F]

public class EncryptWord{
        public static void main(String[] args) {
            String word = "ROADTOSDET";
            String encryptedWord = encryptWord(word);
            System.out.println("Encrypted word: " + encryptedWord);
        }

        private static String encryptWord(String word) {
            StringBuilder encryptedWord = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (Character.isLetter(c)) {
                    int encryptedCharCode = ((c - 'A' + 5) % 26) + 'A';
                    encryptedWord.append((char) encryptedCharCode);
                } else {
                    encryptedWord.append(c);
                }
            }
            return encryptedWord.toString();
        }
}
