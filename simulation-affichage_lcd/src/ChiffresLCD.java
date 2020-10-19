import java.io.IOException;
import java.util.Scanner;

public class ChiffresLCD {
	
	
	static char[] traduire(char chiffre){
		//char[] srt=new char[9];
		switch(chiffre) {
		case '0': return new char[] {'.','_','.','|','.','|','|','_','|'};
		case '1': return new char[] {'.','.','.','.','.','|','.','.','|'};
		case '2': return new char[] {'.','_','.','.','_','|','|','_','.'};
		case '3': return new char[] {'.','_','.','.','_','|','.','_','|'};
		case '4': return new char[] {'.','.','.','|','_','|','.','.','|'};
		case '5': return new char[] {'.','_','.','|','_','.','.','_','|'};
		case '6': return new char[] {'.','_','.','|','_','.','|','_','|'};
		case '7': return new char[] {'.','_','.','.','.','|','.','.','|'};
		case '8': return new char[] {'.','_','.','|','_','|','|','_','|'};
		case '9': return new char[] {'.','_','.','|','_','|','.','.','|'};
		default: return new char[] {};
		}
	}
	static void afficher(int chiffre){
        StringBuilder[] string = new StringBuilder[] {new StringBuilder(),new StringBuilder(),new StringBuilder()};
		
		for (char c : (chiffre+"").toCharArray()) {
			char [] srt=	traduire(c);
			string[0].append(srt[0]).append(srt[1]).append(srt[2]).append(" ");
			string[1].append(srt[3]).append(srt[4]).append(srt[5]).append(" ");
			string[2].append(srt[6]).append(srt[7]).append(srt[8]).append(" ");
		
			
		}
		for(int i=0;i<3;i++) System.out.println(string[i].toString());
			
	}
	
	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		
		System.out.println("Enter your number: ");
		Scanner scan = new Scanner(System.in);
		int chiffre = scan.nextInt();
        
		afficher(chiffre);
		

	}

}
