package scanner;
import java.util.Scanner;

public class Emp {

	public static void main(String[] args) {
				
				Scanner s=new Scanner(System.in);
				Scanner s1=new Scanner(System.in);

				
				
				System.out.println("enter the student regno:");
				int studentRegNo = s.nextInt();
				
				System.out.println("enter the student name:");
				String studentName = s1.nextLine();
				
				System.out.println("enter the mark1:");
				short mark1 = s.nextShort();
				
				System.out.println("enter the mark2:");
				short mark2 = s.nextShort();
				
				System.out.println("enter the mark3:");
				short mark3 = s.nextShort();
				
				System.out.println("enter the mark4:");
				short mark4 = s.nextShort();
				
				System.out.println("enter the mark5:");
				short mark5 = s.nextShort();
				
				int total=mark1+mark2+mark3+mark4+mark5;
				float avg=total/5;
				
				System.out.println("------Students Details-------");
				System.out.println("Student regno:"+studentRegNo);
				System.out.println("Student name:"+studentName);
				System.out.println("Student mark1:"+mark1);
				System.out.println("Student mark2:"+mark2);
				System.out.println("Student mark3:"+mark3);
				System.out.println("Student mark4:"+mark4);
				System.out.println("Student mark5:"+mark5);
				System.out.println("Student Total:"+total);
				System.out.println("Student avgmark:"+avg);
				
				
				
				
				
				
				
				
				
				
				
			}

		

	}


