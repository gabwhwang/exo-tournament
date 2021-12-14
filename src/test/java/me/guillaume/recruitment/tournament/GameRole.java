package me.guillaume.recruitment.tournament;

public abstract class GameRole {

    private int hitPoints;
    private double berserkThresold;
    private Weapon weapon;
    private Buckle buckle;
    private boolean equipedByArmor = false;
    private boolean isBerserk = false;
    private boolean isVicious = false;

    public int hitPoints(){
        return this.hitPoints<0? 0 : this.hitPoints;
    };

    protected int getDamge(){

        int damage = this.weapon.getDamage();
        if(equipedByArmor){
            damage = this.weapon.getDamage() >=1 ?this.weapon.getDamage()-1 : 0 ;
        }
        if(isBerserk){
            if(this.hitPoints<berserkThresold){
                damage = damage + damage;
            }

        }
        return damage;
    };

    public GameRole equip(String equipName){
        switch(equipName){
            case "buckler" : this.buckle = createBuckle();
            break;
            case "armor" : this.equipedByArmor = true;
            break;
            case "axe" : this.setWeapon(new Axe());
            break;
        }
        return this;
    }

    protected void hitPointAfterEachBlow(GameRole enemy){

        int damageByEnemy = enemy.getDamge();
        getWeapon().increBlewtimer();
        if (buckle!=null&&!buckle.isDestroyed(enemy.getWeapon())&&buckle.cancalDamage()){
            if(damageByEnemy<=0){
                buckle.setCancalDamge(true);
            }

        } else if (equipedByArmor){
            if(damageByEnemy>=3){
                this.hitPoints = this.hitPoints-(damageByEnemy-3);
            }

        }else{
            this.hitPoints = this.hitPoints-damageByEnemy;
        }
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

    public boolean isBerserk() {
        return isBerserk;
    }

    public void setBerserk(boolean berserk) {
        isBerserk = berserk;
    }

    public void setBerserkThresold(double berserkThresold) {
        this.berserkThresold = berserkThresold;
    }

    public boolean isVicious() {
        return isVicious;
    }

    public void setVicious(boolean vicious) {
        isVicious = vicious;
    }
}
