package randomNumbers;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RNumbers {

	public static void main(String[] args) {
		
		System.out.println("Give me the number?");
		Scanner scan = new Scanner(System.in);
		int user1 = scan.nextInt();
				
		Set<Integer> randomValue = new TreeSet<Integer>();
		
		for(int i=0; i<500; i++) {
			randomValue.add(getRandomNumberInRange(100,999));
		}
		
		int count = 0;
		int currentElement = 0;
		Iterator<Integer> aa = randomValue.iterator();
		while(count < user1) {
			currentElement =  aa.next();
			
			count++;
			
		}
		System.out.println(currentElement);
//		while(randomValue.size()!= 500) {
//			randomValue.add(getRandomNumberInRange(100,999));
//		}
//		
		System.out.println(randomValue);
//		System.out.println(randomValue.size());
	}
	
	private static int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException ("max must be greater than min");
		}
		
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	
	}
}


