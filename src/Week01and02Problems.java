import java.util.*;

public class Week01and02Problems {
    static HashMap<String,String> L1 = new HashMap<>();
    static HashMap<String,String> L2 = new HashMap<>();

    public static void main(String[] args){

        L2.put("video_123","SSD_DATA");

        getVideo("video_123");
        getVideo("video_123");
    }

    static void getVideo(String id){

        if(L1.containsKey(id)){
            System.out.println("L1 Cache HIT");
        }
        else if(L2.containsKey(id)){
            System.out.println("L2 Cache HIT → promoted to L1");
            L1.put(id,L2.get(id));
        }
        else{
            System.out.println("Database HIT");
        }
    }
}
