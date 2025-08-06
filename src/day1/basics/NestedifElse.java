package day1.basics;

public class NestedifElse {

	public static void main(String[] args) {
		
        int t=20, q=10, s=70;
        System.out.println("The Biggest Number is:");
        if(t>q) {
        	if(s>q) {
        		System.out.println(s);
        	}
        	else {
        		System.out.println(q);
        	}
        }
        else {
        	if(q>t) {
        		System.out.println(q);
        	}
        	else {
        			System.out.println(t);
        	}
        }
        			
            } 
}