package numbersprogramming;

import java.util.Scanner;

public class PrimeScanner {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.println("plese enter any number");
		int P = read.nextInt();
		read.close();
		int N,M=0, flag=0;
		M = P/2;
		if(P==0||P==1) {
			System.out.println(P+"is not prime number");
		}
		else{for(N=2;N<=M;N++) {
			if(P%N==0) {
				System.out.println(P+"is not prime number");
				flag=1;
				break;
			}

		}
		if (flag==0) {
			System.out.println(P+"is prime number");
		}

		}
	}

}
