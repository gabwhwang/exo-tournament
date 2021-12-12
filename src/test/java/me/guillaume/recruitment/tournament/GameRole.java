package me.guillaume.recruitment.tournament;

public abstract class GameRole {

    private int hitPoints;

    private Weapon weapon;
    private Buckle buckle;

    public int hitPoints(){
        return this.hitPoints<0? 0 : this.hitPoints;
    };

    protected int getDamge(){
        return this.weapon.getDamage();
    };

    public GameRole equip(String equipName){
        switch(equipName){
            case "buckler" : this.buckle = createBuckle();
        }
        return this;
    }

    protected Buckle createBuckle() {
     return new Buckle();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}
