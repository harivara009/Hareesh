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
public class MatAdd {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter n");
        int n=scan.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=scan.nextInt();
            }
                
                    
        }
        int b[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               b[i][j]=scan.nextInt();
            }
        }
        int c[][]=new int[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
        }
    }
    System.out.println("The Matrix addition");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.println(c[i][j]+"\t");
        }
    System.out.println("\n");
    }
    
    int d[][]=new int[n][n];
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            for(int k=0;k<n;k++)
            {
            d[i][j]=d[i][j]+a[i][k]*b[k][j];
        }
        }
    }
    
    System.out.println("The Matrix Multiplication");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.println(c[i][j]+"\t");
        }
    System.out.println("\n");
    }
    System.out.println("The Transpose Matrix");
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            System.out.println(c[j][i]+"\t");
        }
    System.out.println("\n");
    }
    }
    
    
}
