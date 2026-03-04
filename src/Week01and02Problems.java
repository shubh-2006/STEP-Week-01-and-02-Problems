import java.util.*;

public class Week01and02Problems {
    static HashMap<String,Integer> queries = new HashMap<>();

    public static void main(String[] args) {

        queries.put("java tutorial",1234567);
        queries.put("javascript",987654);
        queries.put("java download",456789);

        search("jav");
    }

    static void search(String prefix){

        System.out.println("Suggestions:");

        for(String q:queries.keySet()){

            if(q.startsWith(prefix))
                System.out.println(q+" ("+queries.get(q)+")");
        }
    }
}
