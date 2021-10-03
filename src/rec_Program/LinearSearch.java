package rec_Program;

import java.util.Scanner;

public class LinearSearch {
	int linearRecursion(int[] arrNumber, int start, int last, int k)
	   {
	      if(last < start)
	         return -1;
	      if(arrNumber[start] == k)
	         return start;
	      return linearRecursion(arrNumber, start + 1, last, k);
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
		      LinearSearch obj = new LinearSearch();
		      int a, l, key, array[];
		      Scanner sc = new Scanner(System.in);
		      System.out.println("enter array length: ");
		      l = sc.nextInt();
		      array = new int[l];
		      System.out.println("enter " + l + " elements");
		      for(a = 0; a < l; a++)
		      {
		         array[a] = sc.nextInt();
		      }
		      System.out.println("Enter the key value: ");
		      key = sc.nextInt();
		      int index = obj.linearRecursion(array, 0, l - 1, key);
		      if(index != -1)
		      {
		         System.out.println(key + " is found at location " + (index + 1));
		      }
		      else
		      {
		         System.out.println(key + " doesn't exist in array.");
		      }
		      sc.close();
		   }
		}
	}

