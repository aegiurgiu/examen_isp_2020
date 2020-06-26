
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;
import java.util.Random;

public class Aplicatia2 extends JFrame {

	HashMap accounts = new HashMap();
	JLabel text;
    JTextField tText,tPwd;
    JTextArea tArea;
    JButton buton;

    public Aplicatia2() {
        this.setLayout(null);
        setTitle("Interfata grafica");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        init();
        setVisible(true);

    }

    public void init() {

        this.setLayout(null);
        int width=80;int height = 20;

        text = new JLabel("Text");
        text.setBounds(10, 50, width, height);
        tText = new JTextField();
        tText.setBounds(70,50,width, height);

        tPwd = new JTextField();
        tPwd.setBounds(70,100,width, height);

        buton = new JButton("Buton");
        buton.setBounds(70,100,width, height);

        buton.addActionListener(new TratareButonLoghin());

        tArea = new JTextArea();
        tArea.setBounds(50,130,150,80);

        add(text);
        add(tText);
        add(buton);
        add(tArea);

    }


    class TratareButonLoghin implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            String usr = Aplicatia2.this.tText.getText();

            if(tText.getText() != null){
            	 Random r = new Random();
                 int x = r.nextInt(10);
                 String correctPwd = (String)Aplicatia2.this.accounts.get(usr);
                	Aplicatia2.this.tArea.append(" S-a introdus numarul\n");
                }
                else{
                	Aplicatia2.this.tArea.append("Nu s-a introdus numarul\n");
                }


        }
    }


    public static void main(String[] args) {
        new Aplicatia2();
    }
    }


