public class Heap {
    private Paciente[] array;
    private int cauda;

    public Heap(int tam) {
        this.array = new Paciente[tam];
        this.cauda = -1;
    }

    public Heap(Paciente[] v) {
        this.array = v;
        this.cauda = this.array.length - 1;
        this.criaHeap();
    }

    public void add(Paciente p) throws Exception {
        if(cauda >= array.length - 1)
            throw new Exception("Sem espaço disponível");
        this.array[++cauda] = p;
        int i = cauda;
        while(i > 0 && this.array[parent(i)].prioridade < this.array[i].prioridade) {
            Paciente aux = this.array[i];
            this.array[i] = this.array[parent(i)];
            this.array[parent(i)] = aux;
            i = parent(i);
        }
    }

    public Paciente remove() throws Exception {
        if(isEmpty())
            throw new Exception("O Heap está vazio.");

        Paciente elemento = this.array[0];
        this.array[0] = this.array[cauda--];
        this.heapify(0);
        return elemento;
    }

    private void heapify(int i) {
        if(isLeaf(i) || !isValid(i))
            return;
        
        int maior = max_index(i, left(i), right(i));
        if(maior != i) {
            swap(i, maior);
            heapify(maior);
        }
    }

    private int max_index(int i, int esq, int dir) {
        int maior = i;
        if(isValid(esq) && this.array[esq].prioridade > this.array[maior].prioridade)
            maior = esq;
        if(isValid(dir) && this.array[dir].prioridade > this.array[maior].prioridade)
            maior = dir;

        return maior;
    }

    private void swap(int i, int j) {
        Paciente aux = this.array[i];
        this.array[i] = this.array[j];
        this.array[j] = aux;
    }

    private void criaHeap() {
        for(int i = parent(this.cauda); i >= 0; --i)
            heapify(i);
    }

    public void print() {
        for(int i = 0; i <= cauda; ++i)
            System.out.println(this.array[i] + " ");
    }

    private boolean isEmpty() {
        return this.cauda == -1;
    }

    private int left(int i ) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * (i + 1);
    }

    private int parent(int i ) {
        return (i - 1) / 2;
    }

    private boolean isValid(int i) {
        return i >= 0 && i <= cauda;
    }

    private boolean isLeaf(int i) {
        return i > parent(cauda) && i <= cauda;
    }
}
