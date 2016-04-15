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
			if(s.charAt(0) == '/' && s.charAt(1) == '/')
			{
				return false;
			}
		}
		
		return true;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
