/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import static java.lang.Boolean.*;

/**
 *
 * @author macbook
 */
public class Batiment {
    private String Nom;
    private String Adresse;
    private double surface;
     
    public Batiment(String name, String add, double sur){
        this.Nom=name;
        this.Adresse=add;
        this.surface=sur;
    }

    public String getNom() {
        return Nom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public double getSurface() {
        return surface;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }
    
    public double impots(){
    double price ;
    price=5*(this.surface);
    return price;
    }

    
    public String toString() {
        return " Nom=" + Nom + ", Adresse=" + Adresse + ", surface=" + surface + ", impots=" +this.impots() +"E";
    }
    
    
 
    
}
