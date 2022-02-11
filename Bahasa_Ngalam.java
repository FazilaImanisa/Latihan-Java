/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bahasa_ngalam;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Bahasa_Ngalam {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int i;
    for (i=0; i<4; i++) {
        System.out.println("*************");
        System.out.println("Input = ");
        StringBuffer buff = new StringBuffer(input.nextLine());
        System.out.println("Output = ");
        System.out.println(buff.reverse());
    }
    }
    
}
 