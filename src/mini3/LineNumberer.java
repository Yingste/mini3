package mini3;

public class LineNumberer implements api.Transformation{

	
	
	
	
	private int count;
	public LineNumberer()
	{
		
	}
	
	
	
	public java.lang.String apply(java.lang.String s)
	{
		
		//System.out.println(count);
		count ++;
		//System.out.println(s.format("%-5d", 10));
		return s.format("%-5d", count) + s;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
