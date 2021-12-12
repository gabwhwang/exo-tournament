package me.guillaume.recruitment.tournament;

public class Sword extends Weapon{
    private final int DAMAGE_SWORD = 5;

    @Override
    public int getDamage() {
        return DAMAGE_SWORD;
    }
}
