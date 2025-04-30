public class Paciente {
    public String nome;
    public String email;
    public String motivo;
    public int prioridade;

    public Paciente(String nome, String email, String motivo, int prioridade) {
        this.nome = nome;
        this.email = email;
        this.motivo = motivo;
        this.prioridade = prioridade;
    }

    public Paciente() {

    }
}
