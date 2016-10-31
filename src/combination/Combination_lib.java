package combination;

public class Combination_lib {
	private int s,r;
	public Combination_lib(int s, int r){
		this.s = s;
		this.r = r;
	}
	public int getFactorial(int n){
		int f=1;
		for(int i = n;i >= 0;i--){
			if(i == 0)f*=1;
			else f*=i;
		}
		return f;		
	}
}
