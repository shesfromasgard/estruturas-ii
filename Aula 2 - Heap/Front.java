import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Front extends JFrame {

    JLabel jl1 = new JLabel("Nome: ");
    JLabel jl2 = new JLabel("E-mail: ");
    JLabel jl3 = new JLabel("Motivo: ");
    JLabel jl4 = new JLabel("Fator: ");
    JLabel jl5 = new JLabel("No momento, estamos atendendo a: ");
    JLabel jl6 = new JLabel("Nome: ");
    JLabel jl7 = new JLabel("Motivo: ");
    JLabel jl8 = new JLabel("Fator: ");
    JLabel jl9 = new JLabel("Nome: ");

    JTextField jtf1 = new JTextField();
    JTextField jtf2 = new JTextField();
    JTextField jtf3 = new JTextField();
    JTextField jtf4 = new JTextField();
    JTextField jtf5 = new JTextField();
    JTextField jtf6 = new JTextField();
    JTextField jtf7 = new JTextField();
    JTextField jtf8 = new JTextField();

    JButton jb1 = new JButton("Cadastrar");
    JButton jb2 = new JButton("Chamar próximo");
    JButton jb3 = new JButton("Checar previsão de espera");

    public Front() {
        setTitle("Hospital GlueBones");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(750, 750);
        setLayout(null);



        setVisible(true);
    }

    public static void main(String[] args) {
        
    }
}