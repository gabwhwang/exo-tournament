package me.guillaume.recruitment.tournament;

public class Sword extends Weapon{
    private final int damage = 5;

    @Override
    public int getDamage() {
        return damage;
    }
}
