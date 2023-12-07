package edu.iastate.cs228.hw2;


/**
 *  
 * @author Reza Choudhury
 *
 */

/**
 * 
 * This class implements selection sort.   
 *
 */

public class SelectionSorter extends AbstractSorter
{
	// Other private instance variables if you need ... 
	
	/**
	 * Constructor takes an array of points.  It invokes the superclass constructor, and also 
	 * set the instance variables algorithm in the superclass.
	 *  
	 * @param pts  
	 */
	public SelectionSorter(Point[] pts)  
	{
		super(pts);
		algorithm = "selection sort";
	}	

	
	/** 
	 * Apply selection sort on the array points[] of the parent class AbstractSorter.  
	 * 
	 */
	@Override 
	public void sort(){
		int n = points.length;
		for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if (pointComparator.compare(points[j],points[min_idx]) < 0) {	//pts[j] < pts[min_idx]
                    min_idx = j;
                }
            // Swap the found minimum element with the first
            // element
           super.swap(i,min_idx);
        }
        }
	}
}
