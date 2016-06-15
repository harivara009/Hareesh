/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.*;

/**
 *
 * @author miracle
 */
public class BubbleSort {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
       
        int temp;
        System.out.println("Enter array size");
        int s=scan.nextInt();
        int a[]=new int[s];
        for(int i=0;i<s;i++)
        {
            a[i]=scan.nextInt();
            
        }
        for(int c=0;c<(s-1);c++)
        {
            for(int d=0;d<s-c-1;d++)
            {
                if(a[d] > a[d+1] )
                {
                    temp = a[d];
                    a[d]=a[d+1];
                    a[d+1]=temp;
                    
                    
            }
            
            }
        }
    System.out.println("Bubble Sort");
    for(int i=0;i<s;i++)
    System.out.println(a[i]);
    }
    
    
    
}
