import java.util.*;

public class Week01and02Problems {
    private static HashMap<String, Integer> stock = new HashMap<>();
    private static LinkedList<Integer> waitingList = new LinkedList<>();

    public static void main(String[] args) {

        stock.put("IPHONE15_256GB", 100);

        System.out.println("checkStock → " + checkStock("IPHONE15_256GB"));

        purchaseItem("IPHONE15_256GB", 12345);
        purchaseItem("IPHONE15_256GB", 67890);

        stock.put("IPHONE15_256GB", 0);
        purchaseItem("IPHONE15_256GB", 99999);
    }

    public static int checkStock(String product) {
        return stock.getOrDefault(product, 0);
    }

    public static void purchaseItem(String product, int userId) {

        int available = stock.get(product);

        if (available > 0) {
            stock.put(product, available - 1);
            System.out.println("Success, remaining: " + (available - 1));
        } else {
            waitingList.add(userId);
            System.out.println("Added to waiting list, position #" + waitingList.size());
        }
    }
}
