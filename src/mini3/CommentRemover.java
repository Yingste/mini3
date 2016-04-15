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
			
			//System.out.println(s.indexOf("//"));
			temp = s.substring(0, s.indexOf("//"));
			//System.out.println(temp);
		}else
		{
			temp = s;
		}
		//System.out.println(s);
		//System.out.println(temp);
		return temp;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
