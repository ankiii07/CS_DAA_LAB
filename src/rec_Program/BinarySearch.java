package rec_Program;

import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
	int binarySearch(int array[], int ele, int p, int r) {

		 while (p <= r) 
		 {

		   int q = p + (r - p) / 2;

		   if (array[q] == ele)
		   {
		     return q;
		   }

		   if (array[q] < ele)
		   {
		     p = q + 1;
		   }
		   else
		   {
		     r = q - 1;
		   }
		 }

		 return -1;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 BinarySearch obj = new BinarySearch();
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Size of Array");
		 int n = sc.nextInt();
		 int[] array = new int[n];
		 
		 System.out.println("Enter the elements of Array");
		 for(int i=0;i<n;i++)
		 {
			 array[i] = sc.nextInt();		 
		 }
		 Arrays.sort(array); 
		 
		 System.out.println("Enter number to be searched:");
		 int ele = sc.nextInt();
		 sc.close();

		 int result = obj.binarySearch(array, ele, 0, n - 1);
		 
		 if (result == -1)
		 {
		   System.out.println("Not found");
		 }
		 else
		 {
		   System.out.println("number found at position " + result + " & the number is " + ele);
		 }
		
	}

}



