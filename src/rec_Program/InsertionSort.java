package rec_Program;

import java.util.*;

public class InsertionSort {
	
    public static void insertionSort(int[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            int value = arr[i];
            int j = i;
            
            while (j > 0 && arr[j - 1] > value)
            {
                arr[j] = arr[j - 1];
                j--;
            }
 
            arr[j] = value;
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
	      insertionSort(array);
	      System.out.println("Sorted Array");
	      System.out.println(Arrays.toString(array));
	}

}
