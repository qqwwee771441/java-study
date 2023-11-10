import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		packageA.A a = new packageA.A();
		
		System.out.print("InputA1> ");
		int a1 = in.nextInt();
		System.out.print("InputA2> ");
		int a2 = in.nextInt();
		System.out.print("InputA3> ");
		int a3 = in.nextInt();

		a.setAn(a1, a2, a3);
		System.out.println("A1: " + a.getA1());
		System.out.println("A2: " + a.getA2());
		System.out.println("A3: " + a.getA3());
	}
}
