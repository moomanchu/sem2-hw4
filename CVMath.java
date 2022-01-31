import pkg.*;
import java.util.ArrayList;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	
	public static void specialSquare(int i){
		int special = 1;
		int counter = 0;
		int sumcount = 1;
		// int square=0;
		// int sum = 0;
		
		while(true){
			int square=0;
			int sum = 0;
			
			square = special*special;
			sum = sum + sumcount;
			
			if(square==sum){
				counter++;
				break;
			}
			if(counter==i){
				break;
			}
			
			special++;
			sumcount++;
		}
		
	}
	
}
