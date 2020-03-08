package snippet;

import java.util.Random;

//controlling execution
//generate 25 random values and use if else statement
public class Chapter3_2 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		for(int i = 0; i <= 25; i++) {
			
			
			int random1 = random.nextInt(100);
			
			int random2 = random.nextInt(100);
			
			if(random1 > random2) {
				System.out.println("random1 is greater than random 2");
			}else if(random1 == random2) {
				System.out.println("random1 is equal random 2");
			}else if (random1 < random2) {
				System.out.println("random1 is less than random 2");
			}
		}

	}

}
