package implementationofarrays;

public class Arraysimplementation 
{
		public static void main(String[] args) 
		{

			//single-dimensional array
			int arr[]= {50,60,70,80,90};
			//to loop array 5 times using for loop
			for(int i=0;i<arr.length;i++) 
			{
				System.out.println("Elements of array a: "+arr[i]);
			}
					//multidimensional array
		  int[][] b = {
		              {1, 2, 5, 9}, 
		              {4, 5, 8} };
		      	System.out.println("\nLength of row 1: " + b[0].length);
		      	System.out.println("\nLength of row 2: " + b[1].length);
		      }
		
}




