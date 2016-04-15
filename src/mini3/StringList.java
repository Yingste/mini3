package mini3;

import java.util.ArrayList;

import api.Combiner;
import api.IntCombiner;
import api.Selector;
import api.Transformation;

public class StringList {

	private ArrayList<java.lang.String> sList;
	
	public StringList()
	{
		
	}
	
	public StringList(java.lang.String[] strings)
	{
		int i = 0;
		for(i = 0; i < strings.length - 1; i ++)
		{
			sList.add(strings[i]);
		}
	}
	
	public StringList(java.util.ArrayList<java.lang.String> strings)
	{
		sList = strings;
	}
	
	public void append(java.lang.String s)
	{
		sList.add(s);
	}
	
	
	
	public StringList filter(Selector selector)
	{
		StringList temp = new StringList();
		int i = 0;
		for(i = 0; i < sList.size() - 1; i ++)
		{
			if(selector.select(sList.get(i)))
			{
				temp.append(sList.get(i));
			}
		}
		return temp;
		
	}
	
	
	public java.lang.String get(int index)
	{
		return sList.get(index);
	}
	
	public StringList map(Transformation transform)
	{
		StringList temp = new StringList();
		int i = 0;
		for(i = 0; i < sList.size() - 1; i ++)
		{
			temp.append(transform.apply(sList.get(i)));
		}
		return temp;
	}
	
	public java.lang.String reduce(Combiner combiner, java.lang.String initialValue)
	{
		java.lang.String temp = initialValue;
		int i = 0;
		for(i = 0; i < sList.size() - 1; i ++)
		{
			combiner.combine(temp, sList.get(i));
		}
		
		
		return temp;
	}
	
	
	public int reduce(IntCombiner combiner, int initialValue)
	{
		int temp = initialValue;
		int i = 0;
		for(i = 0; i < sList.size() - 1; i ++)
		{
			combiner.combine(temp, sList.get(i));
		}
		
		
		return temp;
	}
	
	public int size()
	{
		return sList.size();
	}
	
	
	public java.lang.String toString()
	{
		java.lang.String temp = "[";
		int i = 0;
		for(i = 0; i < sList.size() - 1; i ++)
		{
			temp += sList.get(i);
			if(i == sList.size() - 2)
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
