public class SwapBetweenCharacters {

    public static void swapCharacters(char[] characters, int firstIndex, int secondIndex) {

        characters[firstIndex] ^= characters[secondIndex];
        characters[secondIndex] ^= characters[firstIndex];
        characters[firstIndex] ^= characters[secondIndex];

    }

}
