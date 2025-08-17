package polymorphism;

public class MethodOverridefinal extends MethodOverride{
	public void current()
	{super.current();
		System.out.println("Current----2%");
	
	}
public void  savings() {super.savings();
	System.out.println("Savings----5%");

}
public static void main(String[]args) {
	MethodOverridefinal i=new MethodOverridefinal();
	i.current();
	i.savings();
}
}
