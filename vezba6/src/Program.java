import collections.map.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(5);

        map.put("123", "abc");
        map.put("abc", "123");
        map.put("qwe", "345");

        System.out.println(map.get("123"));
        System.out.println(map.get("abc"));
        System.out.println(map.get("qwe"));

        System.out.println(map.get("qwe1"));

        System.out.println(map.containsKey("qwe"));
        System.out.println(map.containsKey("hfhg"));
        System.out.println(map.containsValue("abc"));

        map.put("123", "789");
        System.out.println(map.containsValue("abc"));

        map.remove("123");
        System.out.println(map.containsKey("123"));
        System.out.println(map.getOrDefault("123", "Hello"));
    }
}
