public class Main {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap(10);
        hashMap.put("key1", "value1");
        hashMap.put("key2", "value2");
        hashMap.put("key3", "value3");
        System.out.println("Size: " + hashMap.size());
        System.out.println("Get key1: " + hashMap.get("key1"));
        System.out.println("Get key2: " + hashMap.get("key2"));
        hashMap.remove("key1");
        System.out.println("Get key1 after removal: " + hashMap.get("key1"));
        System.out.println("Size after removal: " + hashMap.size());
    }
}