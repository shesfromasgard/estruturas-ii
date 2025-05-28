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

    JButton button1 = new JButton("Botão");
    JButton button2 = new JButton("Botão");
    JButton button3 = new JButton("Botão");
    JButton button4 = new JButton("Botão");

    JLabel label1 = new JLabel("Texto: ");
    JLabel label2 = new JLabel("Texto: ");
    JLabel label3 = new JLabel("Texto: ");
    JLabel label4 = new JLabel("Texto: ");
    JLabel label5 = new JLabel("Texto: ");

    public Front() {

        setTitle("Título");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(470, 400);
        setLayout(null);

        label1.setBounds(5, 5, 150, 30);
        add(label1);

        text1.setBounds(160, 5, 305, 35);
        add(text1);

        label2.setBounds(5, 45, 150, 35);
        add(label2);

        text2.setBounds(160, 45, 305, 35);
        add(text2);

        button1.setBounds(160, 85, 150, 35);
        add(button1);

        button2.setBounds(315, 85, 150, 35);
        add(button2);

        label3.setBounds(5, 125, 150, 35);
        add(label3);

        label4.setBounds(5, 165, 150, 35);
        add(label4);

        text3.setBounds(160, 165, 305, 35);
        add(text3);

        button3.setBounds(315, 205, 150, 35);
        add(button3);

        label5.setBounds(5, 245, 150, 35);
        add(label5);

        text4.setBounds(160, 245, 305, 35);
        add(text4);

        button4.setBounds(5, 285, 460, 35);
        add(button4);

        text5.setBounds(5, 325, 460, 35);
        add(text5);

        button1.addActionListener(new Handler());
        button2.addActionListener(new Handler());
        button3.addActionListener(new Handler());
        button4.addActionListener(new Handler());

        setVisible(true);

    }

    public class Handler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ev) {
            if(ev.getSource() == button1) {

            }
            if(ev.getSource() == button2) {
                
            }
            if(ev.getSource() == button3) {
                
            }
            if(ev.getSource() == button4) {
                
            }
        }
    }

    public static void main(String[] args) {
        new Front();
    }
}
