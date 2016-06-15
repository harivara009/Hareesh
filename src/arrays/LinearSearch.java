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
public class LinearSearch {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter array length");
        int n=scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=scan.nextInt();
        }
        System.out.println("Enter searching element");
        int s=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==s)
            {
                System.out.println("Identified");
                break;
            }
            
        
        if(i==s)
        {
            System.out.println("Not Identified");
        }
        }
    }
    
}
