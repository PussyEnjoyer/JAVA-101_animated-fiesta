import java.util.Random;

public class main {

	public static void main(String[] args) {
		new Frame();

	}
	public String GEN(String lenght, boolean Num, boolean Sym) {
		
		Random rand = new Random();
		//zmieniamy stringa na liczbę int (i modlimy się że użytkownik wporadził liczbę xDD)
		int len = Integer.parseInt(lenght);
		//char c = (char)(r.nextInt(26) + 'a');
		String haslo="";
		//loop tworzący hasło
		for(int i = 0; i < len; i++) {
			//mamy 3 opcje (0-litera,1-liczba,2-symbol)
			int op = 0;
			char chH = 0;
			int intH = 0;
			String spH = "#";
			boolean flag = false;
			
			while(flag==false) {
				op = rand.nextInt(5);
				if(op==0||op==1){//0-LITERY
					chH=(char)(rand.nextInt('z' - 'a') + 'a');
					flag=true;
				}else if(op==2||op==3) {//1-LICZBY
					if(Num) {
						intH = rand.nextInt(9)+1;
						flag=true;
					}
				}else {//2-SYBOLE
					if(Sym) {
						int op1 = rand.nextInt(2);
						if(op1==0) {spH="#";}
						else {spH="@";}
						flag=true;
					}
				}
				
			}//While END
			if(op==0||op==1){//0-LITERY
				haslo = chH+haslo;
				
			}else if(op==2||op==3) {//1-LICZBY
				haslo = intH+haslo;
				
			}else {//2-SYBOLE
				haslo = spH+haslo;
				
			}
			flag=false;
		
		
		}//Loop END
		
		
		return haslo;
	}

}
