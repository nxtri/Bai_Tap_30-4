import java.util.ArrayList;
import java.util.List;

public class BaiTap30_4 {
    public static String extractSentencesWithWord(String text, String word) {

        String[] sentences = text.split("\\.");

        List<String> result = new ArrayList<String>();

        for (String sentence : sentences) {
            String[] a = sentence.split("\\ ");
            for (String b : a) {
                if (b.equalsIgnoreCase(word)) {
                    result.add(sentence.trim() + ".");
                }
            }
        }

        return String.join("\n", result);
    }

    public static void main(String[] args) {
        String text = "We are living in a yellow submarine. We don't have anything else. Inside the submarine is very tight. So we are drinking all the day. We will move out of it in 5 days .";
        String word = "in";
        String s = extractSentencesWithWord(text, word);
        System.out.println(s);
    }
}