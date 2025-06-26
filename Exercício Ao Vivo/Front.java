import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.*;

public class Front extends JFrame {

    Arvore arvore = new Arvore();

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
    JLabel label3 = new JLabel("Consultar");
    JLabel label4 = new JLabel("Domínio: ");
    JLabel label5 = new JLabel("IP: ");

    public Front() {

        setTitle("ifDNS");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(485, 404);
        setLayout(null);
        setResizable(true);

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

        text4.setEnabled(false);

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
                String dominio = text1.getText();

                if(dominio.equals("")) {
                    JOptionPane.showMessageDialog(null, "Digite um domínio.");
                    text1.requestFocus();
                    return;
                }

                try {

                    arvore.remove(dominio);
                    JOptionPane.showMessageDialog(null, "Domínio '" + dominio + "' removido com sucesso!");
                    text1.setText("");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    return;
                }

            }
            if(ev.getSource() == cadastrar) {
                String dominio = text1.getText();
                String ip = text2.getText();

                if(dominio.equals("")) {
                    JOptionPane.showMessageDialog(null, "Digite um domínio.");
                    text1.requestFocus();
                    return;
                }
                if(ip.equals("")) {
                    JOptionPane.showMessageDialog(null, "Digite um IP.");
                    text2.requestFocus();
                    return;
                }

                try {
                    arvore.add(dominio, ip);
                    JOptionPane.showMessageDialog(null, "Domínio '" + dominio + "' adicionado com sucesso!");
                    text1.setText("");
                    text2.setText("");

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    return;
                }
            }
            if(ev.getSource() == consultar) {
                String dominio = text3.getText();

                if(dominio.equals("")) {
                    JOptionPane.showMessageDialog(null, "Digite um domínio.");
                    text3.requestFocus();
                    return;
                }

                try {
                    String ip = arvore.search(dominio);
                    text4.setText(ip);

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                    text3.setText("");
                    return;
                }

            }
            if(ev.getSource() == ver) {
                text5.setText(arvore.getRoot().print());
            }
        }
    }
}
