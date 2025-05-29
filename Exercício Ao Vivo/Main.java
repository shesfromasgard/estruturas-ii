public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        try {
            arvore.add("larback.com.br", "192.168.0.1");
            arvore.add("github.com.br", "5200");
            arvore.add("engelmig.com", "0");
            arvore.print(arvore.getRoot());
            arvore.remove("larback.com.br");
            arvore.print(arvore.getRoot());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
