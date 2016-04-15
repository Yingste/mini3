package mini3;

public class NonCommentLineSelector implements api.Selector{

	
	
	public NonCommentLineSelector()
	{
		
	}
	
	
	public boolean select(java.lang.String s)
	{
		
		s = s.trim();
		if(s.length() >= 2)
		{
			if(s.startsWith("//"))
			{
				//System.out.println(s);
				return false;
			}
		}
		
		return true;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
