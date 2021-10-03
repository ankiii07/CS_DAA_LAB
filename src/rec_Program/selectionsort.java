package rec_Program;

import java.util.Arrays;
import java.util.Scanner;

public class selectionsort {
	
	// function to swap values
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    // Function to perform selection sort on array[]
    public static void selectionSort(int[] arr)
    {
        // run `n-1` times, where `n` is array length
        for (int i = 0; i < arr.length - 1; i++)
        {
            int min = i;
 
            for (int j = i + 1; j < arr.length; j++)
            {
               
                if (arr[j] < arr[min]) {
                    min = j;  
                    
                }
            }
            swap(arr, min, i);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, l, array[];
		 Scanner s = new Scanner(System.in);
	      System.out.println("enter array length: ");
	      l = s.nextInt();
	      array = new int[l];
	      System.out.println("enter " + l + " elements");
	      for(a = 0; a < l; a++)
	      {
	         array[a] = s.nextInt();
	      }
	      selectionSort(array);
	
	      // print the sorted array
	      System.out.println(Arrays.toString(array));
	}

}
