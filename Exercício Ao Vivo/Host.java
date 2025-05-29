import java.util.ArrayList;

public class Host {
    public String dominio;
    public String ip;
    ArrayList<Host> filhos;

    public Host(String dominio, String ip) {
        this.dominio = dominio;
        this.ip = ip;
        this.filhos = null;
    }

    public Host(String dominio) {
        this.dominio = dominio;
        this.ip = null;
        this.filhos = new ArrayList<Host>();
    }

    public Host addFolha(String dominio, String ip) {
        Host tmp = new Host(dominio, ip);
        ArrayList<Host> array = this.filhos;

        for(Host aux : array)
            if(aux.dominio.equals(dominio))
                return null;

        this.filhos.add(tmp);

        return tmp;
    }

    public Host add(String dominio) {
        Host tmp = new Host(dominio);
        ArrayList<Host> array = this.filhos;

        for(Host aux : array)
            if(aux.dominio.equals(dominio))
                return null;

        this.filhos.add(tmp);

        return tmp;
    }
    
    public Host remove(String dominio) {
        Host tmp;

        for(int i = 0; i < this.filhos.size(); ++i)
            if(this.filhos.get(i).dominio.equals(dominio)) {
                tmp = this.filhos.get(i);
                this.filhos.remove(i);
                return tmp;
            }

        return null;
    }

    public ArrayList<Host> getFilhos() {
        return this.filhos;
    }

    public boolean filhoExiste(String dominio) {
        for(Host txt : this.filhos) {
            if(txt.dominio.equals(dominio))
                return true;
        }

        return false;
    }

    public Host getFilho(String dominio) {
        for(Host tmp : this.filhos)
            if(tmp.dominio.equals(dominio))
                return tmp;

        return null;
    }

    public boolean containsDominio(String dominio) {
        for(Host tmp : this.filhos)
            if(tmp.dominio.equals(dominio))
                return true;

        return false;
    }

    public void print() {
        if(this.filhos == null) {
            System.out.print(this.dominio);
            System.out.print("()");
            return;
        }
        System.out.print(this.dominio);
        System.out.print("(");
        for(Host tmp : this.filhos) {
            tmp.print();
        }
        System.out.print(")");
    }
}
