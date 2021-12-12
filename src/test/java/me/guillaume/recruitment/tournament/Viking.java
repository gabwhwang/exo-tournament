package me.guillaume.recruitment.tournament;

public class Viking extends GameRole{

    private int hitPoints = 120;
    private int damage = 6;
    public Viking() {
    }

    @Override
    public int hitPoints() {
        return this.hitPoints<0? 0 : this.hitPoints;
    }

    @Override
    protected int getDamge() {
        return this.damage;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
