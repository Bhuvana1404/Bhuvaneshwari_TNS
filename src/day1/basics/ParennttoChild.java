package day1.basics;

public class ParennttoChild { // parent or super class
		void show() {
			System.out.println("Hii");
		}
		
		ParennttoChild(int a, int b){
			
		}
		ParennttoChild()
		{
			
		}
		class Ferrari extends ParennttoChild{	 // child or subclass
		}

		public static void main(String[] args) {
			ParennttoChild obj = new ParennttoChild();
			obj.show();
		}

	}

