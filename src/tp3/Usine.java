/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author macbook
 */
public class Usine extends Batiment {
    private String nomEntr;
    private double liv;//moyenne de livraisons
    private int emp;//nbr d'employes
    public Usine(String name, String add, double sur, String nom,int employe,double livr) {
        super(name, add, sur);
        this.nomEntr=nom;  
        this.emp=employe;
        this.liv=livr;
    }
    public double Flot(){
       double flow;
       flow=0.75*emp +liv;
        
       return flow;
    }
    @Override
    public String toString() {
        
        return "Usine{ "+ super.toString()+"," + " nomEntr=" + nomEntr + " nbEmploye=" + emp + "}";
    }
    
}
