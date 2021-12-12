package me.guillaume.recruitment.tournament;

public class Viking implements GameRole{

    private int hitPoints = 0;
    public Viking() {
    }

    @Override
    public int hitPoints() {
        return hitPoints;
    }

    @Override
    public Viking equip(String buckler) {
        return this;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
