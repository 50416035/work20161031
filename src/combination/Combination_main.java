package combination;
import java.util.Scanner;
public class Combination_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	    System.out.print("Input Number s > ");
	    int s = Integer.parseInt(scan.next());
	        
	    System.out.print("Input Number r > ");
	    int r = Integer.parseInt(scan.next());
	    Combination_lib comlib = new Combination_lib(s,r);
	    System.out.println(s+"!="+comlib.getFactorial(s));
	    System.out.println(s+"C"+r+"="+comlib.getFactorial(s)/comlib.getFactorial(r));


	}

}