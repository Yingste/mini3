package mini3;

public class CommentRemover implements api.Transformation{

	
	
	public CommentRemover()
	{
		
	}
	
	
	
	public java.lang.String apply(java.lang.String s)
	{
		java.lang.String temp = "";
		if(s.contains("//"))
		{
			temp = s.substring(0, s.indexOf("//"));
		}
		
		return temp;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
