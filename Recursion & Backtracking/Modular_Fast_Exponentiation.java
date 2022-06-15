//PepCoding Level 3
import java.io.IOException;
import java.util.Scanner;

public class Modular_Fast_Exponentiation {
	public static long xpown(long x, long n, long mod) {
	    
	    if(n == 0 ) return 1;
	    
	    long xpn2 = xpown(x,n/2,mod) % mod ;
	    
	    long res = (xpn2 * xpn2) % mod;
	    
	    if(n % 2 == 1)
	    {
	        res = (res * x) % mod;
	    }
	    
		return res;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner scn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
			long x = scn.nextInt();
			long n = scn.nextInt();
            //Tried End m ans m mod kiya but vo run nhi hua 1 test case fail hua then done this mod at each level using int this also not worked and data type long liya toh ho gya

            long ans = xpown(x,n,1000000007);
			System.out.println(ans);
		}
}
