import java.util.ArrayList;

public class Host {
    public String dominio;
    public String ip;
    ArrayList<Host> filhos;

    public Host(String dominio, String ip) {
        this.dominio = dominio;
        this.ip = ip;
        this.filhos = new ArrayList<Host>();
    }

    public Host(String dominio) {
        this.dominio = dominio;
        this.ip = null;
        this.filhos = new ArrayList<Host>();
    }

    public Host addFolha(String dominio, String ip) {
        if(containsDominio(dominio)) {
            return null;
        }
        Host tmp = new Host(dominio, ip);
        this.filhos.add(tmp);
        return tmp;
    }

    public Host add(String dominio) {
        if(containsDominio(dominio)) {
            return null;
        }
        Host tmp = new Host(dominio);
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

    public String print() {
        String result = this.dominio;

        if (this.filhos == null || this.filhos.isEmpty())
            result += "()";
        else {
            result += "(";
            for (Host tmp : this.filhos)
                result += tmp.print();
            result += ")";
        }
        return result;
    }
}
