public class Hash {
    public int hash(String element) {
        int hash = 0;
        for (int i = 0; i < element.length(); i++) {
            hash += element.charAt(i) * 37;
        }
        return hash;
    }
}
