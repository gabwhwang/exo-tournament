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

    protected void hitPointAfterEachBlow(GameRole enemy){
        //System.out.println(this.toString() + " blew by ======" + enemy.toString()  + " ===================================");
        //System.out.println(this.toString() + " :have hitPoints before this blow : " + hitPoints);
        if (buckle!=null&&!buckle.isDestroyed(enemy.getWeapon())&&buckle.cancalDamage()){
            //System.out.println("protected by buck");
        }else {
            this.hitPoints = this.hitPoints-enemy.getDamge();
        }
        //System.out.println(this.toString() + " :have hitPoints after this blow : " + hitPoints);
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
