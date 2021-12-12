package me.guillaume.recruitment.tournament;

public class Viking extends GameRole{

    public Viking() {
        setHitPoints(120);
        setWeapon(new Axe());
    }


    @Override
    public Viking equip(String equipName) {
        return (Viking)super.equip(equipName);
    }

    @Override
    public String toString() {
        return "Viking";
    }
}
