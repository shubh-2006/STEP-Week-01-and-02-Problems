import java.util.*;

public class Week01and02Problems {
    static HashMap<String,Integer> requests = new HashMap<>();
    static int LIMIT = 5;

    public static void main(String[] args) {

        for(int i=0;i<7;i++)
            checkRateLimit("abc123");
    }

    static void checkRateLimit(String client){

        int count = requests.getOrDefault(client,0);

        if(count < LIMIT){
            requests.put(client,count+1);
            System.out.println("Allowed ("+(LIMIT-count-1)+" remaining)");
        }
        else{
            System.out.println("Denied - limit exceeded");
        }
    }
}
