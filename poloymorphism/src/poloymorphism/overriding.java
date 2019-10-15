package poloymorphism;



class abc   {
	
	
	public int writedata(int a, int b) {
		return a;
		

	}

	public  int writedata(int a, int b, int c) {
		return c;

	}
}
	public class overriding extends abc{

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a = 10, b = 20;
			abc ab=new abc();
			System.out.println(ab.writedata(a, b));
			
			
		}

	

}

