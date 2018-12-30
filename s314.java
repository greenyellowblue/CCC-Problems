import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class s314 {
	
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        
        int gate = Integer.parseInt(sc.readLine());
        int plane = Integer.parseInt(sc.readLine());
        int complete = 0;
        
        int[] toMove = new int[gate + 1]; 
        
        for (int i = 0; i < plane; i++) {
            int wanted = Integer.parseInt(sc.readLine()); 
            
            while (wanted > 0 && toMove[wanted] != 0) {  
            	wanted -= toMove[wanted]-1;
            	toMove[wanted]++; 
            }
            
            if (wanted <= 0) {
                break;
            }
            
            
            complete++; 
            toMove[wanted] = 1; 
            
        }

        System.out.print(complete);
    }
}