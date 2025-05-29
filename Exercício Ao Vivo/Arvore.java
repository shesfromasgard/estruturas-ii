public class Arvore {
    private Host root = new Host("root");
    private int size = 0;

    public void add(String texto, String ip) throws Exception {
        String tmp[] = texto.split("\\.");
        Host aux = root;

        for(int i = tmp.length - 1; i >= 0; --i) {
            if(i != 0) {
                if(!aux.containsDominio(tmp[i]))
                    aux.add(tmp[i]);
                else
                    System.out.println("");
                
                aux = aux.getFilho(tmp[i]);
            } else {
                Host temp = aux.addFolha(tmp[0], ip);
                if(temp == null)
                    throw new Exception("Domínio já existe.");
                else
                    size++;
            }
        }
    }

    public Host remove(String texto) throws Exception {

        if(texto.equals("root"))
            throw new Exception("Não pode remover a raiz.");
        else if(isEmpty())
            throw new Exception("Não há domínios cadastrados.");
        else {
            String tmp[] = texto.split("\\.");
            Host aux = root;
    
            System.out.println("Remove");
    
            for(int i = tmp.length - 1; i >= 0; --i) {
                if(i != 0) {
                    if(!aux.containsDominio(tmp[i]))
                        throw new Exception("Domínio não encontrado.");
                    else
                        aux = aux.getFilho(tmp[i]);
                } else {
                    Host temp = aux.remove(tmp[0]);
                    System.out.println(tmp[0]);
                    if(temp == null)
                        throw new Exception("Domínio não encontrado.");
                    else {
                        size--;
                        return temp;
                    }
                }
            }
    
            throw new Exception("Domínio não encontrado");
        }
    }

    public String search(String texto) throws Exception {
        if(isEmpty())
            throw new Exception("Não há domínios cadastrados");
        else {
            String tmp[] = texto.split("\\.");
            Host aux = root;
    
            for(int i = tmp.length - 1; i >= 0; --i) {
                if(i != 0) {
                    if(!aux.containsDominio(tmp[i]))
                        throw new Exception("Domínio não encontrado.");
                    else
                        aux = aux.getFilho(tmp[i]);
                } else {
                    if(!aux.containsDominio(tmp[0])) {

                    }
                }
            }
    
            throw new Exception("Domínio não encontrado");
        }
    }

    public void print(Host no) {
        no.print();
    }

    public Host getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
