package package1;

public class statement {

	public static void main(String[] args) {

		int a = 100;
		int b = 150;
		
		String city1 = "Newyork";
		String city2 = "Las Vegas";
		
		/*System.out.println( a + b );
		System.out.println(city1 + " " + city2);
		
		System.out.println( a + b + city1 + city2);
		System.out.println( city1 + city2 + a + b);*/
		
		/*if(a<50) {
			System.out.println(a);
		}
		
		else{
			System.out.println(b);
		}*/
		
		if(a==50) {
			System.out.println(city1);
		}
		else if(a==100) {
			System.out.println(city2);
		}
		else if(a>100) {
			System.out.println("GUI");
		}
		else if(b==150) {
			System.out.println("Ginigathhena");
		}
		else {
			System.out.println("yui");
		}
	}

}
