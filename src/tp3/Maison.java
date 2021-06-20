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
public class Maison extends Batiment{
    private int pieces;
    private boolean ispiscine;
    public Maison(String name, String add, double sur, int piece,boolean ispis) {
        super(name, add, sur);
        this.pieces=piece;
        this.ispiscine=ispis;
         
    }
    public Maison(String name, String add,double sur){
    this(name,add,sur,4,false);
    }
    @Override
        public double impots(){
            double price;
            if(ispiscine==true)
                price=50*pieces+40;
            else
                price=50*pieces;
            return price;    
    }

    @Override
    public String toString() {
        return "Maison{" + super.toString()+","  + "pieces=" + pieces + ", ispiscine=" + ispiscine + '}';
    }
    
}
