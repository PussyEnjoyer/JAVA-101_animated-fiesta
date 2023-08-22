import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Frame extends JFrame implements ActionListener {
	
	main meta = new main();
	JButton b1;
	JCheckBox cb1;
	JCheckBox cb2;
	JTextField tf1;
	JTextField H;
	
	Frame(){
		//Liczby
		cb1 = new  JCheckBox();
		cb1.setBounds(10, 10, 20, 20);
		//
		JLabel cbl1 = new JLabel();
		cbl1.setBounds(40, 10, 150, 20);
		cbl1.setText("Liczby");
		
		//Znaki Specjalne
		cb2 = new  JCheckBox();
		cb2.setBounds(10, 40, 20, 20);
		//
		JLabel cbl2 = new JLabel();
		cbl2.setBounds(40, 40, 150, 20);
		cbl2.setText("Znaki Specjalne");
		
		//Długość hasła
		tf1 = new JTextField(2);
		tf1.setBounds(10, 70, 20, 20);
		tf1.setText("15");
		//
		JLabel tfl1 = new JLabel();
		tfl1.setBounds(40, 70, 150, 20);
		tfl1.setText("Długość Hasła");
		
		//Przycisk do Generacji
		b1 = new JButton();
		b1.setBounds(10, 100, 150, 25);
		b1.setText("Generate Password");
		b1.addActionListener(this);
		
		//Hasło
		H = new JTextField();
		H.setBounds(10, 130, 150, 20);
		
		
		
		this.setTitle("Password Generator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(185,200);
		this.setVisible(true);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.add(b1);
		this.add(cb1);
		this.add(cbl1);
		this.add(cb2);
		this.add(cbl2);
		this.add(tf1);
		this.add(tfl1);
		this.add(H);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1){		
			//meta.GEN( tf1.getText() ,cb1.isSelected(),cb2.isSelected());
			H.setText(meta.GEN( tf1.getText() ,cb1.isSelected(),cb2.isSelected()));
			
		}
		
		
	}
}
