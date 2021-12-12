package me.guillaume.recruitment.tournament;

public class Swordsman implements GameRole{

    private int hitPoints = 0;
    public Swordsman() {
    }

    public void engage(GameRole role) {//engage method, to be complet later with the progress of test
        if(role instanceof Viking){
            ((Viking)role).setHitPoints(35);
        }else{
            System.out.println("Only Viking role is supported");
        }
    }

    @Override
    public int hitPoints() {
        return hitPoints;
    }

    @Override
    public Swordsman equip(String buckler) {
        return this;
    }
}
