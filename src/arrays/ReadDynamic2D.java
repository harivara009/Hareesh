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
public class ReadDynamic2D {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter row size");
        int x=scan.nextInt();
        System.out.println("Enter Col Size");
        int s=scan.nextInt();
         String dr_name[][]=new String[x][s];
         String dr_special[][]=new String[x][s];
         int Salary[][]=new int[x][s];
         System.out.println("Enter Doctor Details");
         for(int i=0;i<x;i++)
         {
             for(int j=0;j<s;j++)
             {
             dr_name[i][j]=scan.next();
             dr_special[i][j]=scan.next();
             Salary[i][j]=scan.nextInt();
             
         }
         }
         
         System.out.println("Display Doctors Details");
         for(int i=0;i<x;i++)
         {
             for(int j=0;j<s;j++){
             System.out.println(dr_name[i][j]);
             System.out.println(dr_special[i][j]);
            
             System.out.println(Salary[i][j]);
             
         }
         }
    }
            
}
