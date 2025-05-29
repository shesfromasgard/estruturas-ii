import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.*;

public class Front extends JFrame {

    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JTextField text3 = new JTextField();
    JTextField text4 = new JTextField();
    JTextField text5 = new JTextField();

    JButton remover = new JButton("Remover");
    JButton cadastrar = new JButton("Cadastrar");
    JButton consultar = new JButton("Consultar");
    JButton ver = new JButton("Ver servidor DNS");

    JLabel label1 = new JLabel("Domínio: ");
    JLabel label2 = new JLabel("IP: ");
    JLabel label3 = new JLabel("Consultar: ");
    JLabel label4 = new JLabel("Domínio: ");
    JLabel label5 = new JLabel("IP: ");

    public Front() {

        setTitle("ifDNS");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(470, 400);
        setLayout(null);
        setResizable(false);

        label1.setBounds(5, 5, 150, 30);
        add(label1);

        text1.setBounds(160, 5, 305, 35);
        add(text1);

        label2.setBounds(5, 45, 150, 35);
        add(label2);

        text2.setBounds(160, 45, 305, 35);
        add(text2);

        remover.setBounds(160, 85, 150, 35);
        add(remover);

        cadastrar.setBounds(315, 85, 150, 35);
        add(cadastrar);

        label3.setBounds(5, 125, 150, 35);
        add(label3);

        label4.setBounds(5, 165, 150, 35);
        add(label4);

        text3.setBounds(160, 165, 305, 35);
        add(text3);

        consultar.setBounds(315, 205, 150, 35);
        add(consultar);

        label5.setBounds(5, 245, 150, 35);
        add(label5);

        text4.setBounds(160, 245, 305, 35);
        add(text4);

        ver.setBounds(5, 285, 460, 35);
        add(ver);

        text5.setBounds(5, 325, 460, 35);
        add(text5);

        remover.addActionListener(new Handler());
        cadastrar.addActionListener(new Handler());
        consultar.addActionListener(new Handler());
        ver.addActionListener(new Handler());

        setVisible(true);

    }

    public class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ev) {
            if(ev.getSource() == remover) {

            }
            if(ev.getSource() == cadastrar) {
                
            }
            if(ev.getSource() == consultar) {
                
            }
            if(ev.getSource() == ver) {
                
            }
        }
    }
}
