package me.guillaume.recruitment.tournament;

public class Viking extends GameRole{

    public Viking() {
        setHitPoints(120);
        setWeapon(new Axe());
    }


    @Override
    public Viking equip(String buckler) {
        return this;
    }

}
