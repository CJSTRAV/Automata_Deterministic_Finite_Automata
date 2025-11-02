package automata;
import java.util.Scanner;

public class DFA_String_Acceptance_Checker {
	public static void main(String[]args) {
		String state = "q0";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input: ");
		String input = sc.nextLine();
	
		
		for (int i=0;i < input.length(); i++) {
			char symbol = input.charAt(i);
			
			switch (state) {
            case "q0":
                if (symbol == '0') state = "q1";
                else state = "q0";  // on '1'
                break;

            case "q1":
                if (symbol == '0') state = "q1";
                else state = "q2"; 
                break;

            case "q2":
                if (symbol == '0') state = "q1";
                else state = "q0";
                break;
        }
			
		}
		if (state.equals("q2")) {
			System.out.println("String accepted!");
		} else {
			System.out.println("String rejected.");
		}
		
		System.exit(0);
	}
	
	}

