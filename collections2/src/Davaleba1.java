import java.util.HashMap;

public class Davaleba1 {
    public static void main(String[] args) {
        String[] words = {
                "Java", "Python", "Java", "JavaScript",
                "Python", "Java", "C++", "Python",
                "Java", "Ruby", "JavaScript", "Java"
        };
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        System.out.println("sitybenis sixshire:");
        for (String key : wordCount.keySet()) {
            System.out.println(key + " = " + wordCount.get(key));
        }
    }
}