public class HashSet {

    private No[] buckets;
    private int size;
    private Hash hash;
    private int capacity;

    public HashSet() {
        this.capacity = 17;
        this.buckets = new No[capacity];
        this.size = 0;
        this.hash = new Hash();
    }

    public boolean add(Pessoa element) {
        int index = Math.abs(hash.hash(element.email)) % capacity;
        No current = buckets[index];
        while (current != null) {
            if (current.element.nome.equals(element.email)) {
                return false;
            }
            current = current.next;
        }
        No newNode = new No(element, buckets[index]);
        buckets[index] = newNode;
        size++;
        return true;
    }

    public boolean contains(Pessoa element) {
        int index = Math.abs(hash.hash(element.email)) % capacity;
        No current = buckets[index];
        while (current != null) {
            if (current.element.nome.equals(element.email)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean remove(Pessoa element) {
        int index = Math.abs(hash.hash(element.email)) % capacity;
        No current = buckets[index];
        No prev = null;
        while (current != null) {
            if (current.element.nome.equals(element.email)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public void clear() {
        buckets = new No[capacity];
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() throws Exception {
        if (isEmpty())
            throw new Exception("HashSet is empty");

        for (int i = 0; i < capacity; i++) {
            No current = buckets[i];
            while (current != null) {
                System.out.println(current.element.nome);
                System.out.println(current.element.email);
                current = current.next;
            }
        }
    }
}