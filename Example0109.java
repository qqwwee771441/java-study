package com.fxmx.exam;

import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
// java.lang.ArithmeticException
import java.util.InputMismatchException;
// java.lang.ArrayIndexOutOfBoundsException
// java.lang.ClassCastException
// java.lang.NullPointerException
/* java.io.IOException */ /* throws IOException, ... */
// IndexOutofBoundsException

class Example0109 {
	static List<User> userList;
	static User currentVisitor = null;

	static {
		userList = new LinkedList<User>();
	}

	public static void main(String[] args) {
		System.out.println("Running Main Method");

		System.out.println("Registering Operator Account");
		User operatorAccount = new User("ChoiKwangJin", "000926-3906410", 
					"qqwwee41", "aassdd41",
					"010-2789-4783", "qqwwee41@naver.com");
		userList.add(operatorAccount);
		System.out.println("Registering Paid Member Account");
		User paidMember = new PaidUser("ChoiKwangJin", "000926-3906410", 
					"qqwwee4873", "aassdd4873",
					"010-2789-4783", "qqwwee41@naver.com", "A");
		userList.add(paidMember);

		System.out.println("Main Menu");
		while(true) {
			System.out.println("1. Login");
			System.out.println("2. Sign Up");
			int select=0;

			try {
				select = readSelect();
			}
			catch(InputMismatchException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			catch(Throwable e) {
				e.printStackTrace();
			}
			
			boolean logged = false;
			switch(select) {
			case 1:
				logged = login();
				break;
			case 2:
				System.out.println("Not Implemented");
				break;
			default:
				System.out.println("Not Implemented");
				break;
			}

			if(logged == true) online();
		}
	}
	public static int readSelect() throws ReadSelectException, InputMismatchException {
		Scanner in = new Scanner(System.in);
		System.out.print("Input> ");
		int select = in.nextInt();
		if(select!=1 && select!=2)
			throw new ReadSelectException();
		return select;
	}

	public static boolean login() {
		System.out.println("Running Login Method");
		Scanner in = new Scanner(System.in);

		System.out.print("ID> ");
		String id = in.nextLine();
		System.out.print("PASSWORD> ");
		String password = in.nextLine();

		User search = new User(id, password);
		for(User u : userList) {
			if(search.equals(u)) {
				currentVisitor = u;
				System.out.println("Login Succeed");
				System.out.printf("Welcome %s \n", currentVisitor);
				return true;
			}
		}
		return false;
	}
	public static void online() {
		System.out.println("Online Access Complete");
		Scanner in = new Scanner(System.in);
		String input;

		while(true) {
			System.out.print("Input> ");
			input = in.nextLine();

			switch(input) {
			case "mypage":
				System.out.println("My Page");
				System.out.println(currentVisitor);
				if(currentVisitor instanceof PaidUser)
					System.out.println("Paid Member");
				break;
			case "end":
				System.out.println("Log Out");
				currentVisitor = null;
				return;
			default:
				break;
			}
		}
	}
}

class User {
	static int userNum = 0;
	String name;
	String residentNumber;
	String id;
	String password;
	String phoneNumber;
	String email;
		
	public User(String name, String resi, String id, String pass, String phone, String email) {
		this.name = name;
		this.residentNumber = resi;
		this.id = id;
		this.password = pass;
		this.phoneNumber = phone;
		this.email = email;
		userNum++;
	}
	public User(String id, String pass) {
		this(null, null, id, pass, null, null);
	}

	@Override
	public boolean equals(Object u) {
		User user = (User)u;
		return (this.id).equals(user.id) && (this.password).equals(user.password);
	}

	@Override
	public String toString() {
		return name;
	}
}

final class PaidUser extends User {
	private String membershipLevel;
	public PaidUser(String name, String resi, String id, String pass, 
			String phone, String email, String level) {
		super(name, resi, id, pass, phone, email);
		membershipLevel = level;
	}
	@Override
	public String toString() {
		return super.toString() + "(" + membershipLevel + ")";
	}
}

class ReadSelectException extends Exception {
	public ReadSelectException() {
		super("Invalid Selection");
	}
}
