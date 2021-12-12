package me.guillaume.recruitment.tournament;

public class Viking extends GameRole{

    private final int INIT_VIKING_HITPOINTS=120;
    public Viking() {
        setHitPoints(INIT_VIKING_HITPOINTS);
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
