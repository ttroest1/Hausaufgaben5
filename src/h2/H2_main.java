package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10267420;
		int digits = 67;
		int[]a = {0,0,0,0,0,0,0,0,0};
		
		int z = 1;
		digits = 0;
		while(n>=z) {		//digits bestimmen
			digits+=1;
			z*=10;

		}
		System.out.println("Anzahl von Ziffern: "+digits);
		System.out.println("Wert von z: "+z);

		while((9-digits)<9) {
			z/=10;
			a[9-digits] = n/z;
			n=n-a[9-digits]*z;

			digits-=1;
		}
		for(int j = 0;j<9;j++) {
			System.out.print(a[j]+",");
		}

	}

}
	