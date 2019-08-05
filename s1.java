import java.util.Scanner;

public class s1 {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		String flips = sc.nextLine();
		int array[][] = new int [2][2];
		array[0][0] = 1;
		array[0][1] = 2;
		array[1][0] = 3;
		array[1][1] = 4;
		
		
		for(int i = 0; i < flips.length(); i++){
			if(flips.charAt(i) == 'H'){
				int temp = array[0][0];
				array[0][0] = array[1][0];
				array[1][0] = temp;
				temp = array[0][1];
				array[0][1] = array[1][1];
				array[1][1] = temp;
			} else {
				int temp = array[0][0];
				array[0][0] = array[0][1];
				array[0][1] = temp;
				temp = array[1][0];
				array[1][0] = array[1][1];
				array[1][1] = temp;
			}
			
		}
		
		System.out.println(array[0][0] + " " + array[0][1]);
		System.out.println(array[1][0] + " " + array[1][1]);
		
	}
}
