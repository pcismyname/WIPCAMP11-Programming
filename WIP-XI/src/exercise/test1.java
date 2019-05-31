
package exercise;

import java.util.Scanner;

/**
 *
 * @author WipCamp11
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name = "Ton";
        int x =10;
        System.out.println("Enter y :");
        int y = sc.nextInt();
        
        if(x>=y){
            int z=x-y;
            System.out.println(z +" Name__"+ Name);
        }
        else{
            int z=x+y ;
            System.out.printf("%d name__%s \n",z,Name);
            System.out.printf(z + " Name__"+ Name);
              }
        System.out.println("End Programe");
        
        
        
    }
    
}
