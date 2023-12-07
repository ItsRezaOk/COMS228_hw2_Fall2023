package edu.iastate.cs228.hw2;

import java.lang.NumberFormatException;


/**
 *  
 * @author Reza Choudhury
 *
 */

/**
 * 
 * This class implements insertion sort.   
 *
 */

public class InsertionSorter extends AbstractSorter 
{
	// Other private instance variables if you need ... 
	
	/**
	 * Constructor takes an array of points.  It invokes the superclass constructor, and also 
	 * set the instance variables algorithm in the superclass.
	 * 
	 * @param pts  
	 */
	public InsertionSorter(Point[] pts) 
	{
		super(pts);
		algorithm = "insertion sort";
	}	

	
	/** 
	 * Perform insertion sort on the array points[] of the parent class AbstractSorter.  
	 */
	@Override 
	public void sort()
	{
	
		Point temp = null;
		
		for(int i=1; i< points.length; i++)   {  
			temp = points[i];  
	        int j = i-1;  
	        while(j >= 0 && pointComparator.compare(points[j], temp) > 0) {   //temp <= numArray[j]{ 
	           points[j+1] = points[j];   
	            j--;  
	        }
	    points[j+1]= temp;
	    }  
	}   
}		
