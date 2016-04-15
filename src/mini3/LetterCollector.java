package mini3;

public class LetterCollector implements api.Combiner{

	
	
	
	public LetterCollector()
	{
		
	}
	
	
	
	public java.lang.String combine(java.lang.String first, java.lang.String second)
	{
		int i = 0;
		//System.out.println(first + second);
		for(i = 0; i < second.length(); i++)
		{
			//System.out.println(Character.toString(second.charAt(i)));
			if ( first.contains( Character.toString(second.charAt(i)) ) )
			{
				
				
			}else
			{
				first += Character.toString(second.charAt(i));
			}
			
			
		}
		
		//System.out.println(first);
		return first;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
