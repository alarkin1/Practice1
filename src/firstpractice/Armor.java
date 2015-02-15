/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpractice;

/**
 *
 * @author Alex
 */
public interface Armor {



    public abstract void setArmorRating(int armorRating);

    public abstract void decreaseNumberOfUses(int amountOfUsesLost);
    
    public abstract Armor getArmor();

}
