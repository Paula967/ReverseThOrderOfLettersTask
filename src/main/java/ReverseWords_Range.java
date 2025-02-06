public class ReverseWords_Range {

    public static void reverseWords(char[] characters) {
        int wordStart = 0;
        for (int index = 0; index <= characters.length; index++) {
            if (index == characters.length || characters[index] == ' ') {
                reverseRange(characters, wordStart, index - 1);
                wordStart = index + 1;
            }
        }
    }
    public static void reverseRange(char[] characters, int left, int right) {
        while (left < right) {
            SwapBetweenCharacters.swapCharacters(characters, left++, right--);
        }
    }

}
