/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket.lovers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dewmith Akalanka
 */
public class SocketLovers {

    /**
     * @param args the command line arguments
     */
    
    //decryption(CLI Application)
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the message to decrypt");
        String input = in.nextLine();
        
        char[] chars = input.toCharArray();
        
        for(char c : chars) {
            c -= 1;
            System.out.print(c);
        }
    }
 
    
}
