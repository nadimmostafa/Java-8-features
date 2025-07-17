package org.nadim.examples;

public class MySwitchUsingEnum {

	enum Week {
		sat, sun, mon, tue, wed, thu, fri;
	}

	public static void main(String[] args) {
		Week w = Week.sun;

		switch (w) {
		case sat:
			System.out.println("sat is holiday");
			break;
		case sun:
			System.out.println("Working Day ...");
			break;
		case mon:
			System.out.println("Working Day");
			break;
		case tue:
			System.out.println("Working day");
			break;
		case wed:
			System.out.println("Working day");
			break;
		case thu:
			System.out.println("Meeting day");
			break;
		case fri:
			System.out.println("Holiday");
			break;
		default:
			System.out.println("Invalid Day");
		}

	}

}
