package nonaccess.modifier;

 class FinalModifier {
			
			final int Max = 100;
			
			void display() {
				System.out.println("show the value of max: " +Max);
			}

			public static void main(String[] args) {
				FinalModifier fd = new FinalModifier();
				fd.display();

			}

		}

		class Child extends FinalModifier{
			void display() {
				System.out.println("show the value of max: " +Max);
			}
		}



