package polymorphism;

public class MethodOveloadfinal {
	public static void main(String[] args) {

		System.out.println("Is 121 Palindrome? "+MethodOverload1.isPalindrome(121));
		System.out.println("Is 123 Palindrome? "+MethodOverload1.isPalindrome(123));
		
		System.out.println("Is CAR Palindrome? "+MethodOverload1.isPalindrome("CAR"));
		System.out.println("Is RACECAR Palindrome? "+MethodOverload1.isPalindrome("RACECAR"));

	}

}

