package numbersprogramming;

public class PrimeNumber {

	public static void main(String[] args) {  
		int n,m=0,flag=0;      
		int p=1;
		
		m=p/2;      
		if(p==0||p==1){  
			System.out.println(p+" is not prime number");      
		}else{  
			for(n=2;n<=m;n++){      
				if(p%n==0){      
					System.out.println(p+" is not prime number");      
					flag=1;      
					break;      
				}      
			}      
			if(flag==0)  { System.out.println(p+" is prime number"); }  
		}
	}  
}

