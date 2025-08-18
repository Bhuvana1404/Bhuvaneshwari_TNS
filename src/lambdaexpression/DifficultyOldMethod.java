package lambdaexpression;
	class MyCubeImpl implements MyCube
	{
		@Override
		public int getCube(int no) {
			return no*no*no;
		}
	}

	public class DifficultyOldMethod {
		public static void main(String[] args) {
			//1. Using object of implementable class
			MyCube obj=new MyCubeImpl();
			System.out.println("Cube is "+obj.getCube(3));

			//2. Using Anonymous class
			MyCube Obj=new MyCube() {	
				@Override
				public int getCube(int no) {				
					return no*no*no;
				}
			};
			System.out.println("Cube is "+Obj.getCube(5));				
		}
	}


