package me.guillaume.recruitment.tournament;

public class Axe extends Weapon{
    private final int DAMAGE_AXE = 6;

    @Override
    public int getDamage() {
        return DAMAGE_AXE;
    }
}
