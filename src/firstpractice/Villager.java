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
public class Villager implements LivingCreature {

    private double health;
    private String name;

    @Override
    public void speak() {
        System.out.println("Hmm");
    }

    @Override
    public void increaseHealth(int livesGainedAmnt) {
        this.health += livesGainedAmnt;
    }

    @Override
    public void decreaseHealth(int livesLostAmnt) {
        this.health -= livesLostAmnt;
    }

    @Override
    public void move(String direction) {
        System.out.println("");
    }

    public String getName() {
        return name;
    }
}
