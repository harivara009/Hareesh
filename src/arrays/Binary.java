/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.io.*;
import java.util.*;
public class Binary {
    public static void main(String args[])
    {
         int c,first,last,middle=0,n,search,a= 0,array[];
       Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements");
    n = in.nextInt(); 
    array = new int[n];
    System.out.println("Enter " + n + " integers");
     for (c = 0; c < n; c++)
      array[c] = in.nextInt();
     System.out.println("Enter value to find");
    search = in.nextInt();
     first= 0;
     last = n - 1;
    while( first <= last )
    {
      if ( array[middle] < search )
        first = middle + 1;    
      else if ( array[middle] == search ) 
      {
        System.out.println(search + " found at location " + (middle + 1) + ".");
        break;
      }
      else
         last = middle - 1;
          middle = (first + last)/2;
   }
   if ( first > last )
      System.out.println(search + " is not present in the list.\n");
  }
}


      
