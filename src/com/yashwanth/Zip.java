package com.yashwanth;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Zip {
	
	private static ArrayList<Range> list = new ArrayList<Range>();
	
	public static void main(String[] args) {	
		
		Zip zip=new Zip();
		Range a1 = new Range(46202, 46233);
		Range a2 = new Range(46100, 46210);
		Range a3 = new Range(46250, 46819);
		Range a4 = new Range(46233, 46260);
		Range a5=new Range(92612,92614);
		
		zip.Adder(a1);
		zip.Adder(a2);
		zip.Adder(a3);
		zip.Adder(a4);
		zip.Adder(a5);
		
		Range() ;
		
	}

	public void Adder(Range toAdd) {
		if(list.size()==0)
			list.add(toAdd);
		else {
			
			ListIterator<Range> iterator = list.listIterator();
			boolean add = true; //flag
			while( iterator.hasNext()) {
				Range range = iterator.next();	
				//new range within existing range, no need to add
				if(range.getmin()<=toAdd.getmin() && range.getmax()>=toAdd.getmax()) {
					add = false;
				}
			
				else if(range.getmin()>toAdd.getmax() || range.getmax()<toAdd.getmin()) {
					add = true;
				}
				
				else {
					if(range.getmin()<toAdd.getmin())
						toAdd.setmin(range.getmin());
					if(range.getmax()>toAdd.getmax())
						toAdd.setmax(range.getmax());
					iterator.remove();
					add = true;
				}
			}
			if(add)
				list.add(toAdd);
		}
		
   }
	
   public static void Range() {
	   if(list.size()>0) {
		   for(Range range :list) {
			   System.out.println(range.toString());
		   }
	   }
	   
   }
   
   public static int size() {
	   return list.size();
   }
   
   public static List<Range> getZipRanges() {
	   return list;
   }
   
   
   public static void clear() {
	   list.clear();
   }

}
