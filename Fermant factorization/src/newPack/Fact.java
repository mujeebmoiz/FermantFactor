package newPack;
import java.io.IOException;
import java.util.Scanner;
public class Fact {
	//Checking if N is a perfect square
	public static boolean square(int N)
	    {
	        int sq = (int) Math.sqrt(N);
	        if (sq * sq == N || (sq + 1) * (sq + 1) == N)
	            return true;
	        return false;
	    }
	
	public static void main(String[] args) throws IOException{
//		pseudocode 
//		FermatFactor(N): // N should be odd
//		    a ← ceiling(sqrt(N))
//		    b2 ← a*a - N
//		    repeat until b2 is a square:
//		        a ← a + 1
//		        b2 ← a*a - N 
//		     // equivalently: 
//		     // b2 ← b2 + 2*a + 1 
//		     // a ← a + 1
//		    return a - sqrt(b2) // or a + sqrt(b2)
		System.out.println("Welcome to Fermat's Factorization Calculator!");
		System.out.print("Enter an odd N : ");
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		//take square root of N as a 
		int a = (int) Math.sqrt(N); 
		//b2 is a times a - N
		int b2 = a * a - N;
	
//repeat until b2 is a square:
	while(!square(b2)) {
		a++; 
		b2 = a * a - N;
		
	}
	
	//Printout
	 int root1 = a - (int)Math.sqrt(b2);
     int root2 = N / root1;
     System.out.println("\nRoots = "+ root1 +" , "+ root2);
	}

}
