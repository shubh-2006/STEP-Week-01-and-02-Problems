import java.util.*;

public class Week01and02Problems {
    private static HashMap<String, Integer> users = new HashMap<>();
    private static HashMap<String, Integer> attempts = new HashMap<>();

    public static void main(String[] args) {

        users.put("john_doe", 1);
        users.put("admin", 2);

        System.out.println("checkAvailability(\"john_doe\") → " + checkAvailability("john_doe"));
        System.out.println("checkAvailability(\"jane_smith\") → " + checkAvailability("jane_smith"));

        System.out.println("suggestAlternatives(\"john_doe\") → " + suggestAlternatives("john_doe"));

        attempts.put("admin", 10543);

        System.out.println("getMostAttempted() → " + getMostAttempted());
    }

    public static boolean checkAvailability(String username) {
        attempts.put(username, attempts.getOrDefault(username, 0) + 1);
        return !users.containsKey(username);
    }

    public static List<String> suggestAlternatives(String username) {
        List<String> suggestions = new ArrayList<>();
        suggestions.add(username + "1");
        suggestions.add(username + "2");
        suggestions.add(username.replace("_", "."));
        return suggestions;
    }

    public static String getMostAttempted() {
        return Collections.max(attempts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
