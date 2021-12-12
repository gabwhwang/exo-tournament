package me.guillaume.recruitment.tournament;

public class Swordsman extends GameRole{

    private int hitPoints = 100;
    private int damage = 5;
    public Swordsman() {
    }

    public void engage(GameRole role) {//engage method, to be complet later with the progress of test
        if(role instanceof Viking){
            Viking viking = (Viking) role;
            while(this.hitPoints()>0&&viking.hitPoints()>0){
                this.hitPoints -= role.getDamge();
                viking.setHitPoints(viking.hitPoints()-this.getDamge());
            }
        }else{
            System.out.println("Only Viking role is supported");
        }


    }

    @Override
    public int hitPoints() {
        return this.hitPoints<0? 0 : this.hitPoints;
    }

    @Override
    protected int getDamge() {
        return this.damage;
    }
}
