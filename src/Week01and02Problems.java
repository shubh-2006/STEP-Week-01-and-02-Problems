import java.util.*;

public class Week01and02Problems {
    static HashMap<String,Integer> pageViews = new HashMap<>();
    static HashMap<String,Set<String>> uniqueVisitors = new HashMap<>();
    static HashMap<String,Integer> trafficSource = new HashMap<>();

    public static void main(String[] args) {

        processEvent("/news","user1","google");
        processEvent("/news","user2","facebook");
        processEvent("/sports","user3","google");

        getDashboard();
    }

    static void processEvent(String url,String user,String source){

        pageViews.put(url,pageViews.getOrDefault(url,0)+1);

        uniqueVisitors.putIfAbsent(url,new HashSet<>());
        uniqueVisitors.get(url).add(user);

        trafficSource.put(source,trafficSource.getOrDefault(source,0)+1);
    }

    static void getDashboard(){

        System.out.println("Top Pages:");
        for(String page:pageViews.keySet()){
            System.out.println(page+" - "+pageViews.get(page)+" views");
        }

        System.out.println("\nTraffic Sources:");
        System.out.println(trafficSource);
    }
}
