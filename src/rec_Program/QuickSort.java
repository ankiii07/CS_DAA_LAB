package rec_Program;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	
	  static int partition(int array[], int low, int high) 
	  {
	   
	    int pivot = array[high];
	    
	    int i = (low - 1);

	    for (int j = low; j < high; j++)
	    {
	      if (array[j] <= pivot)
	      {
	        i++;
	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	      }

	    }
	    int temp = array[i + 1];
	    array[i + 1] = array[high];
	    array[high] = temp;

	    return (i + 1);
	  }
	  
	  static void quickSort(int array[], int low, int high) {
		    if (low < high) 
		    {

		      int p = partition(array, low, high);
		      quickSort(array, low, p - 1);

		      quickSort(array, p + 1, high);
		    }
		  }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the size of array");
			int n = sc.nextInt();
			 int[] array = new int[n];
			    System.out.println("Enter the elements of the Unsorted Array");
			    for(int i = 0 ; i < n ; i++)
			    {
			    	array[i] = sc.nextInt();
			    }
			    System.out.println("Unsorted Array");
			    System.out.println(Arrays.toString(array));
			    
			    quickSort(array, 0, n - 1);
	
			    System.out.println("Sorted Array in Ascending Order ");
			    System.out.println(Arrays.toString(array));
	}

}

