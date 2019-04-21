import java.util.Arrays;
import java.util.Scanner;

public class Losujemy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Ile liczb musisz wylosowac?");
		int k = in.nextInt();
		
		System.out.println("Jaka jest najwieksza liczba?");
		int n = in.nextInt();
		
		int numbers[] = new int[n];
		for(int i = 0; i<numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		int[] result = new int[k];
		for(int i = 0; i<result.length; i++) {
			int r = (int)(Math.random()*n);
			
			result[i] = numbers[r];
			numbers[r] = numbers[n-1];
			n--;
		}
		
		Arrays.sort(result);
		System.out.println("Postaw na nastepujace liczby. Dzieki nim bedziesz bogactwo!");
		for(int r: result) {
			System.out.println(r);
		}
		

	}

}
