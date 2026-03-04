import java.util.*;

class DNSEntry {
    String ip;
    long expiry;

    DNSEntry(String ip, long ttl) {
        this.ip = ip;
        this.expiry = System.currentTimeMillis() + ttl;
    }
}

public class Week01and02Problems {
    static HashMap<String, DNSEntry> cache = new HashMap<>();

    public static void main(String[] args) {

        resolve("google.com");

        resolve("google.com");
    }

    public static void resolve(String domain) {

        DNSEntry entry = cache.get(domain);

        if (entry != null && entry.expiry > System.currentTimeMillis()) {
            System.out.println("Cache HIT → " + entry.ip);
        } else {

            String ip = "172.217.14.206";

            cache.put(domain, new DNSEntry(ip, 300000));

            System.out.println("Cache MISS → Query upstream → " + ip);
        }
    }
}
