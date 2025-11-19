package h1;

public class H1_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]myArray = {0,1,2,3,4,5,6,7,8,9};
		int n=0;
		int i=0;
		int tauschhilfe = 0;
		
		n=myArray.length;
		i=n-1;
		while(i>n/2) {
			tauschhilfe=myArray[i];
			myArray[i]=myArray[n-i-1];
			myArray[n-i-1]=tauschhilfe;
			i-=1;
		}
		for(int j = 0;j<n-1;j++) {
			System.out.print(myArray[j]+",");
		}
		System.out.print(myArray[n-1]);

	}

}
