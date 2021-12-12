package me.guillaume.recruitment.tournament;

public class Highlander extends GameRole{
    public Highlander() {
        setHitPoints(150);
        setWeapon(new GreatSword());
    }

    @Override
    public Highlander equip(String equipName) {
        return (Highlander)super.equip(equipName);
    }

    @Override
    public String toString() {
        return "Highlander";
    }
}
