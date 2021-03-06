package mini3;

import java.util.ArrayList;

import api.Combiner;
import api.IntCombiner;
import api.Selector;
import api.Transformation;

public class StringList {

	private ArrayList<java.lang.String> sList;
	private int size = 0;
	public StringList()
	{
		ArrayList<java.lang.String> temp = new ArrayList<java.lang.String>();
		this.sList = temp;
	}
	
	public StringList(java.lang.String[] strings)
	{
		ArrayList<java.lang.String> temp = new ArrayList<java.lang.String>();
		int i = 0;
		for(i = 0; i < strings.length ; i ++)
		{
			//System.out.println(strings[i]);
			temp.add(strings[i]);
		}
		this.sList = temp;
		size = 1;
	}
	
	public StringList(java.util.ArrayList<java.lang.String> strings)
	{
		size = 1;
		this.sList = strings;
	}
	
	public void append(java.lang.String s)
	{
		System.out.println(s);
		size = 1;
		if(s != null)
		{
			if(!sList.isEmpty())
			{
				sList.add(s);
				
			}else
			{
				java.lang.String[] t = null ;
				t[0] = s;
				ArrayList<java.lang.String> temp = new ArrayList<java.lang.String>();
				sList = temp;
			}
		}
		
		
	}
	
	
	
	public StringList filter(Selector selector)
	{
		ArrayList<java.lang.String> temp = new ArrayList<java.lang.String>() ;
		int i = 0;
		for(i = 0; i < sList.size() ; i ++)
		{
			//System.out.println(sList.toString());
			//
			if(selector.select(sList.get(i)))
			{
				//System.out.println(sList.get(i));
				temp.add(sList.get(i));
			}
		}
		//System.out.println(temp.get(1));
		StringList out = new StringList(temp);
		
		//System.out.println(temp.toString());
		return out;
		
	}
	
	
	public java.lang.String get(int index)
	{
		return this.sList.get(index);
	}
	
	public StringList map(Transformation transform)
	{
		ArrayList<java.lang.String> temp = new ArrayList<java.lang.String>() ;
		int i = 0;
		for(i = 0; i < this.sList.size() ; i ++)
		{
			//System.out.println(sList.toString());
			temp.add(transform.apply(this.sList.get(i)));
		}
		
		StringList out = new StringList(temp);
		
		return out;
	}
	
	public java.lang.String reduce(Combiner combiner, java.lang.String initialValue)
	{
		java.lang.String temp = initialValue;
		int i = 0;
		for(i = 0; i < sList.size() - 1; i ++)
		{
			//System.out.println(i);
			System.out.println();
			temp = combiner.combine(temp, sList.get(i));
		}
		
		
		return temp;
	}
	
	
	public int reduce(IntCombiner combiner, int initialValue)
	{
		//System.out.println(initialValue);
		int temp = initialValue;
		int i = 0;
		for(i = 0; i < sList.size() - 1; i ++)
		{
			//System.out.println(temp);
			temp = combiner.combine(temp, sList.get(i));
		}
		
		
		return temp;
	}
	
	public int size()
	{
		if(size != 0)
		{
			return sList.size();
		}
		return 0;
	}
	
	
	public java.lang.String toString()
	{
		java.lang.String temp = "[";
		int i = 0;
		for(i = 0; i < sList.size() ; i ++)
		{
			temp += sList.get(i);
			if(i == sList.size() - 1)
			{
				temp += "]";
			}else
			{
				temp += ", ";
			}
		}
		
		
		
		return temp;
	}
	
	
	
	
	
	
	
	
	
	
	
}
