
public class Fraction {
	private int num;
	private int denom;
	
	public Fraction(int num, int denom)
	{
		this.num = num;
		this.denom = denom;
		
	}
	public String toString()
	{
		return Integer.toString(num) + "/" + Integer.toString(denom);
	}

}
