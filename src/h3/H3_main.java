package h3;

public class H3_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]einheiten = 	{{50000,20000,10000,5000,2000,1000,500,200,100,50,20,10,5,2,1},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
		int input = 44900;
		int z = 0;
		int q = 0;
		
		z = 0;
		q = 0;
		while(z<15) {
			q=input/einheiten[0][z];
			einheiten[1][z]=q;
			input-=q*einheiten[0][z];
			z+=1;
		}
		z=0;
		while(z<15) {
			System.out.println(einheiten[0][z]+": "+einheiten[1][z]);
			z+=1;
		}

	}

}
