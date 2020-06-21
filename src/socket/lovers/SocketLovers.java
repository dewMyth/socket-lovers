/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket.lovers;

import java.util.ArrayList;

/**
 *
 * @author Dewmith Akalanka
 */
public class SocketLovers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text = "Somthing";
        String msg = "";
        char[] chars = text.toCharArray();
        ArrayList<String> characters = new ArrayList<String>();
       
        for(char c : chars){
            c += 1;
            characters.add( String.valueOf(c));
        }
     String newMessage = "";
     
     for(String letter : characters){
         newMessage += letter;
     }
     System.out.println(newMessage);
    }
    
}
