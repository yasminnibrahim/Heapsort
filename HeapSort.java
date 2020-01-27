
import java.util.Scanner;
import project1.Project1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yasmin
 */
public class HeapSort {
     public static void main(String[] args) {
        int n ;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of array" + " : " + "\n");
        n=s.nextInt();
         int[] arr=new int[n];
         System.out.println("Enter the array" + " : " + "\n");
         for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
            
        }
  
        Project1 ob = new Project1(); 
        ob.sort(arr); 
  
        System.out.println("Sorted array is"); 
        ob.printArray(arr);
    }
}
