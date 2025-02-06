
public class ReverseWordInPlace {

    public static void main(String[] args) {
        char[] input = "i love programming very much".toCharArray();
        ReverseWords_Range.reverseWords(input);
        System.out.println(new String(input));

    }

}
