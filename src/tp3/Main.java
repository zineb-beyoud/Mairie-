/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 *
 * @author macbook
 */
public class Main {
      public static void main (String[] args){
             
      Maison m1=new Maison("XY","120",80,4,FALSE);
      Maison m2=new Maison("Xz","120",120,5,TRUE);
      Usine u1=new Usine("xyz","130",3000,"entX",50,20);
      
      Mairie v=new Mairie("caen","XYZ",1000,3);
      v.ajout(m1);
      v.ajout(m2);
      v.ajout(u1);
      
      System.out.println("les batiments"+ v.getListBat());
      
      System.out.println ("ensemble d'impots: "+v.impots());
   }
    
}
