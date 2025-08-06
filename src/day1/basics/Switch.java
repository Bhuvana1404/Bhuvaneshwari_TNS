package day1.basics;

public class Switch {

	public static void main(String[] args) {
		char x = '$';
		switch (x)
		{
		case 'a' : 
		case 'A' : 
			System.out.println(x+" is a Letter");
			break;
		case '1':
		case '2' :
			System.out.println(x+" is a Digit");
			break;
		case 'w':
		case 'W' :	
			System.out.println(x+" is White Space");
			break;
		case '&':
		case '@':
			System.out.println(x+" is Special Symbol");
		default:
			System.out.println(x+" is other than letter, digit, space or special symbol ");
			break;
		}
	
	}

	}


