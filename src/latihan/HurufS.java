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
public class HurufS {
    public static void main(String[]args){
     int x,y;
     
   for(x=1;x<=5;x++){
            for(y=1;y<=5;y++){
                if(x==1||x==3||x==5||x==2&&y==1||x==4&&y==5){
                    System.out.print("S");
                }
                else
                    System.out.print(" ");
                }
            System.out.println();
            } 
    }
}
