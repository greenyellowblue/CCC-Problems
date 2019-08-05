import java.util.Scanner;


public class s2 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean done = false;
		int val1 [] = new int[n];
		int val2 [] = new int[n];
		
		int numbers [] = new int [n];
		for(int i = 0;  i < n; i ++){
			numbers[i] = sc.nextInt() * 2;
			val1[i] = 1;
		}
		
		for(int i = 0; i < n; i ++){
			while(done == false){
				val1[i] = val1[i] + 1;
				if(isPrime(numbers[i] - val1[i]) == true){
					if(isPrime(val1[i]) == true){
						val2[i] = numbers[i] - val1[i];
						done = true;
					}
				}
			}
			done = false;
		}
		for(int i = 0; i < n; i ++){
			System.out.println(val1[i] + " " + val2[i]);
		}
		
	}
	private static boolean isPrime(int a) {
	    for(int i = 2; i <= Math.sqrt(a)+1; i++){
	    	if(a% i == 0) {
	    		return false;
	    	}
	    }
	    return true;
	}
}
