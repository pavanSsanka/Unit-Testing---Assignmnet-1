public class UPPER {
    public static void toUppercase(char[] word) {
        for (int i = 0; i < word.length; i++) {
            if (Character.isLetter(word[i]) && Character.isLowerCase(word[i])) {
                word[i] = Character.toUpperCase(word[i]);
            }
        }
        System.out.println(word);
    }
    public static void main(String[] args) {
        char[] word = "phenom family".toCharArray();
        toUppercase(word);
    }
}
