import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
		q8();
		q9();
		q10();
		q11();
		q12();
	}

	public static void q1() {
		//Write question 1 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double a = input.nextDouble();
		System.out.println(Math.abs(a));
		input.nextLine();
		
	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double b = input.nextDouble();
		input.nextLine();
		System.out.print("Input another number: ");
		double c = input.nextDouble();
		input.nextLine();
		System.out.println(Math.floor(b/c));
		System.out.println(Math.ceil(b/c));
		
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int d = input.nextInt();
		System.out.println(Math.round(Math.sqrt(d)));
		input.nextLine();
		
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		int e = input.nextInt();
		input.nextLine();
		System.out.print("Input another number: ");
		int f = input.nextInt();
		input.nextLine();
		System.out.println(Math.pow(e, f));

		
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double g = input.nextDouble();
		input.nextLine();
		System.out.print("Input another number: ");
		double h = input.nextDouble();
		input.nextLine();
		System.out.print("Input one more number: ");
		double i = input.nextDouble();
		input.nextLine();
		System.out.println(Math.max(Math.max(g, h), i));
		System.out.println(Math.min(Math.min(g, h), i));

		
		
	}
	public static void q6() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String sent = input.nextLine();
		System.out.println(sent.contains("on"));
		
	}
	public static void q7() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input the word mango: ");
		String man = input.nextLine();
		System.out.println(man.equalsIgnoreCase("mango"));
		
	}
	public static void q8() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = input.nextLine();
		System.out.print("Input a letter: ");
		String ltr = input.nextLine();
		System.out.println(word.indexOf(ltr));
		System.out.println(word.lastIndexOf(ltr));

		
	}

	public static void q9() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String len = input.nextLine();
		System.out.println("Your sentence is " + len.length() + " characters long");
		
		
	}
	public static void q10() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String uno = input.nextLine();
		System.out.print("Input a word to replace: ");
		String dos = input.nextLine();
		System.out.print("What word would you like to replace it with: ");
		String tres = input.nextLine();
		System.out.println(uno.replaceAll(dos, tres));

		
	}

	public static void q11() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a sentence: ");
		String oui = input.nextLine();
		oui = oui.trim();
		System.out.println(oui.toUpperCase());
		System.out.println(oui.toLowerCase());
		
	}

	public static void q12() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String lets = input.nextLine();
		System.out.println(lets.substring(0, 4));
		System.out.println(lets.substring(lets.length() -4));
		
	}
	

}
