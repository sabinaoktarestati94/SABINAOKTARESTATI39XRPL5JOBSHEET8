/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Asus
 */
public class HurufI {
    public static void main(String[]args){
        int x,y;
        
        for(y=1;y<=5;y++){
            for(x=1;x<=5;x++){
                if(x==3){
                    System.out.print("I");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
