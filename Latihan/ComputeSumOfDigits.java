import java.util.Scanner;
public class ComputeSumOfDigits {
  public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      System.out.print("Type an integer: ");
      int digits = in.nextInt();
	  System.out.println("Digit sum is " + sumDigits(digits));
    }

 public static int sumDigits(long n) {
		int result = 0;
		
		while(n > 0) {
			result += n % 10;
			n /= 10;
		}
		
		return result;
	}
	
 }
