/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;
import java.util.ArrayList;
/**
 *
 * @author macbook
 *yann.mathet@unicaen.fr
 */
public class Mairie {
    private ArrayList <Batiment> bat;
    
    
    private String commune;
    private String Mayor;
    private int nbHabitants;
    private int nbBati;
    public Mairie(String com,String may,int nbHab,int nbBat ) {
        this.commune=com;
        this.Mayor=may;
        this.nbHabitants=nbHab;
        bat =new ArrayList<>();
        
    }
    public ArrayList<Batiment> getListBat() {
    return bat;
    }
   
    public void ajout(Batiment b){
    bat.add(b);
    }
    
    public double impots(){
    double impot=0;
    double max=0;
    Batiment plus=null;
    for (Batiment b:bat){
    impot=impot+b.impots();
    if (b.impots()>max) {
       max=b.impots();
       plus=b;
         }
    
    } 
    System.out.println("Le batiment payant le plus dimpots est: "+ plus.getNom());
    return impot;
    }   
   
}
