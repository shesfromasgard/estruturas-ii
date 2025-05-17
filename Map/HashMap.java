public class HashMap {
    private No [] table;
    private int size;
    private int capacity;
    private Hash hash;

    public HashMap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.table = new No[capacity];
        this.hash = new Hash();
    }
    
    public void put(String key, String value) {
        int index = hash.hash(key) % capacity;
        No newNode = new No(key, value);
        if (table[index] == null) {
            table[index] = newNode;
        } else {
            No current = table[index];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public String get(String key) {
        int index = hash.hash(key) % capacity;
        No current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(String key) {
        int index = hash.hash(key) % capacity;
        No current = table[index];
        No previous = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (previous == null) {
                    table[index] = current.next;
                } else {
                    previous.next = current.next;
                }
                size--;
                return;
            }
            previous = current;
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        for (int i = 0; i < capacity; i++) {
            table[i] = null;
        }
        size = 0;
    }

    public boolean containsKey(String key) {
        int index = hash.hash(key) % capacity;
        No current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean containsValue(String value) {
        for (int i = 0; i < capacity; i++) {
            No current = table[i];
            while (current != null) {
                if (current.value.equals(value)) {
                    return true;
                }
                current = current.next;
            }
        }
        return false;
    }

    public String[] keys() {
        String[] keys = new String[size];
        int index = 0;
        for (int i = 0; i < capacity; i++) {
            No current = table[i];
            while (current != null) {
                keys[index++] = current.key;
                current = current.next;
            }
        }
        return keys;
    }

    public String[] values() {
        String[] values = new String[size];
        int index = 0;
        for (int i = 0; i < capacity; i++) {
            No current = table[i];
            while (current != null) {
                values[index++] = current.value;
                current = current.next;
            }
        }
        return values;
    }

    public void print() {
        for (int i = 0; i < capacity; i++) {
            No current = table[i];
            System.out.print("Index " + i + ": ");
            while (current != null) {
                System.out.print("[" + current.key + ": " + current.value + "] -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public void resize(int newCapacity) {
        No[] newTable = new No[newCapacity];
        for (int i = 0; i < capacity; i++) {
            No current = table[i];
            while (current != null) {
                int newIndex = hash.hash(current.key) % newCapacity;
                No nextNode = current.next;
                current.next = newTable[newIndex];
                newTable[newIndex] = current;
                current = nextNode;
            }
        }
        table = newTable;
        capacity = newCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }
}
