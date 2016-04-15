package mini3;

public class LocCounter implements api.IntCombiner{

	
	
	public LocCounter()
	{
		
		
	}
	
	
	
	
	public int combine(int i, java.lang.String s)
	{
		
		if(s.trim().startsWith("//") || (s.trim() == "") || (s.trim().startsWith("{")) || (s.trim().startsWith("}")))
		{
			//System.out.println(s);
			return i;
		}else
		{
			//System.out.println(s);
		}
		
		
		return i + 1;
	}
	
	
	
	
	
	
	
	
	
	
	
}
