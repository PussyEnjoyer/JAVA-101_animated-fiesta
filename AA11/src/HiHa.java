import java.awt.Color;
import java.util.*;
import javax.swing.JFrame;
public class HiHa {

	public static void main(String[] args) {
		/*System.out.println("Witaj zjebany świecie :D");
		Random rand = new Random();
		int d10 = rand.nextInt(10)+1;
		int d6 = rand.nextInt(6)+1;
		int d100 = rand.nextInt(100)+1;
		System.out.println("d10: "+d10+"\nd6: "+d6+"\nd100: "+d100);
		Stack<String> st = new Stack<String>();
		st.push("Jebać");
		st.push("Disa");
		st.push("Syna");
		st.push("Diabła");
		System.out.print(st);
		Scanner scn = new Scanner(System.in);
		String odp = scn.next();
		if(odp == "kurwa")
		{
			System.out.println("puść to na podwórkaaaaa");
		}
		else 
		{
			System.out.println(":D");
		}*/
		JFrame frame = new JFrame();
		
		
		frame.setSize(420,420);
		frame.setTitle("ło ale kozak");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.gray);
	}
}