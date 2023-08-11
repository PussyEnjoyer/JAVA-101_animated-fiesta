import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame obj = new JFrame();
		Gameplay game = new Gameplay();
		obj.setBounds(10, 10, 700, 700);
		obj.setTitle("Block Breaking Game :D");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(game);
		
		
		
		
	}

}
