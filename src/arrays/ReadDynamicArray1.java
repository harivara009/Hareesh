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
public class ReadDynamicArray1 {
    public static void main(String args[])
    {
       Scanner scan=new Scanner(System.in);
       
        System.out.println("Enter size");
        int s=scan.nextInt();
         String dr_name[]=new String[s];
         String dr_special[]=new String[s];
         int Salary[]=new int[s];
         System.out.println("Enter Doctor Details");
         for(int i=0;i<s;i++)
         {
             dr_name[i]=scan.next();
             dr_special[i]=scan.next();
             Salary[i]=scan.nextInt();
             
         }
         
         System.out.println("Display Doctors Details");
         for(int i=0;i<s;i++)
         {
             System.out.println(dr_name[i]);
             System.out.println(dr_special[i]);
             System.out.println(Salary[i]);
             
         }
    }
    
}
