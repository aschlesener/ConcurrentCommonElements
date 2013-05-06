/*Sequential program to compute number of values that 
  appear in both arrays. Arrays a and b are sorted in
  ascending order, and have distinct values.

  Author: Amy Schlesener (amy@amyschlesener.com)
  May 2, 2013
*/

import java.io.*;

 public class ArrayMatch {
      public static void main(String[] args) {
	int size_a = 10;
	int size_b = 10;
	int [] a = {2, 3, 5, 6, 8, 9, 10, 11, 12, 13};
  	int [] b = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
	int l;
	//print elements of array a
	System.out.print("Array a: ");
	for(l = 0; l < size_a; l++) {
		System.out.print(a[l]+" ");
	}
	System.out.println();
	//print elements of array b
	System.out.print("Array b: ");
	for(l = 0; l < size_b; l++) {
		System.out.print(b[l]+" ");
	}	
	System.out.println();
	//commonArray will hold the shared elements of a and b
	int[] commonArray;
	commonArray= new int[size_a+size_b];
	int sumDistinct = 0;
	int i = 0;
	int j = 0;
	int k = 0;
	long startTime = System.nanoTime();
	while((i<a.length)&&(j<b.length)) {
	  //common element found, add to commonArray
	  if(a[i] == b[j]) {
	    commonArray[k] = a[i];
	    sumDistinct++;
	    i++; 
	    j++;
	    k++;
	  }
	  else if(a[i]<b[j]) {
	      i++;
	  }
	  else {
	    j++;
	  }
	}
	
	long estimatedTime = System.nanoTime() - startTime;
	System.out.println("Number of values appearing in both arrays: " + sumDistinct);
	System.out.println("Elapsed time in nanoseconds: " + estimatedTime);
  }
}
