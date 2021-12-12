package me.guillaume.recruitment.tournament;

public class GreatSword extends Weapon {
    private final int damage = 12;
    private int blewTmesByGreatSword = 0;

    @Override
    public int getDamage() {
        blewTmesByGreatSword++;
        if(blewTmesByGreatSword==3){
            blewTmesByGreatSword = 0;
            return 0;
        }
        return damage;
    }
}
