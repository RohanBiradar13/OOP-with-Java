package annonymous2;

public class Tester {
public static void main(String[] args) {
	//new Fruit()=> instance of the annonymous inner class which extends Fruit
	//name of the inner class generated by compiler: Tester$1
	Fruit f1 = new Fruit() {

		@Override
		public void taste() {
			System.out.println("in anno inner class :sweet");
			
		}
		/*
		 * public void show() {
		 * 
		 * }
		 */
		
	};
	f1.taste();
	
}
}