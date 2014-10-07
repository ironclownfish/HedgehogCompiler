import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Compiler {
	
	private ArrayList<String> tokens;
	private Association theProgramWithItsMeaning;
	
	public static void main(String[] args) {
		Compiler compiler = new Compiler();
		compiler.compile(System.in);
	}
	
	private void compile(InputStream in) {
		tokens = lex(in);
		parse(tokens);
	}
	
	private ArrayList<String> lex(InputStream in) {
		ArrayList<String> words = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			words.add(scan.next());
		}
		scan.close();
		return words;
	}
	
	private void parse(List<String> tokens) {

	}
}
