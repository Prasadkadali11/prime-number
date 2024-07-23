package numbersprogramming;

public class One_To_Hundread_prime_no {

	public static void main(String[] args) {
		int p = 0;
		int n = 0;
		
		String PrimeNumbers = " ";

		for(p = 1; p <= 100; p++) {
			int c = 0;
			for(n = p; n >= 1; n--) {
				if(p%n == 0) {
					c = c+1;
				}
			}
			if(c == 2) {
				PrimeNumbers = PrimeNumbers+p+" ";
			}
		}
		System.out.println("Prime numbers from 1 to 100");
		System.out.println(PrimeNumbers);
	}

}
