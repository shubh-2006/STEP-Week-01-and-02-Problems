import java.util.*;

public class Week01and02Problems {
    static HashMap<String, Set<String>> index = new HashMap<>();

    public static void main(String[] args) {

        String doc1 = "this is a sample essay written by student";
        String doc2 = "this is a sample essay copied by student";

        addDocument("essay_001", doc1);
        analyzeDocument("essay_002", doc2);
    }

    static void addDocument(String id, String text) {

        String[] words = text.split(" ");

        for (int i = 0; i < words.length - 2; i++) {

            String gram = words[i] + " " + words[i + 1] + " " + words[i + 2];

            index.putIfAbsent(gram, new HashSet<>());
            index.get(gram).add(id);
        }
    }

    static void analyzeDocument(String id, String text) {

        String[] words = text.split(" ");

        int matches = 0;

        for (int i = 0; i < words.length - 2; i++) {

            String gram = words[i] + " " + words[i + 1] + " " + words[i + 2];

            if (index.containsKey(gram))
                matches++;
        }

        System.out.println("Matching n-grams: " + matches);
    }
}
