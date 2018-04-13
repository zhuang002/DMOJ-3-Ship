/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ship;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class Ship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] parts={'B','F','T','L','C'};
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toUpperCase();
        String returnString="";
        for (int i=0;i<5;i++) {
            if (s.indexOf(parts[i]) < 0) {
                returnString+=parts[i];
            }
        }
        if (returnString.isEmpty()) {
            System.out.println("NO MISSING PARTS");
        } else {
            System.out.println(returnString);
        }
    }
    
}
