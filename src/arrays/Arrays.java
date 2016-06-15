/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author miracle
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dr_name[]={"Hareesh","uday","Lalith"};
        String specializaton[]={"MD","Cardiologist","ENT"};
        int Salary[]={20000,25000,15000};
        for(int i=0;i<dr_name.length;i++)
        {
            System.out.println(+i+")Doctor Details\n");
            System.out.println(dr_name[i]);
            System.out.println(specializaton[i]);
            System.out.println(Salary[i]);
        }
        
                
        
                
        // TODO code application logic here
    }
    
}
