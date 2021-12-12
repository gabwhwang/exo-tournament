package me.guillaume.recruitment.tournament;

public abstract class GameRole {

    private int hitPoints;

    private Weapon weapon;
    private Buckle buckle;
    private boolean equipedByArmor = false;

    public int hitPoints(){
        return this.hitPoints<0? 0 : this.hitPoints;
    };

    protected int getDamge(){
        int damage = this.weapon.getDamage();
        if(equipedByArmor){
            damage = this.weapon.getDamage() >=1 ?this.weapon.getDamage()-1 : 0 ;
        }
        return damage;
    };

    public GameRole equip(String equipName){
        switch(equipName){
            case "buckler" : this.buckle = createBuckle();
            break;
            case "armor" : this.equipedByArmor = true;
            break;
        }
        return this;
    }



    protected void hitPointAfterEachBlow(GameRole enemy){
        int damageByEnemy = enemy.getDamge();
        //System.out.println(this.toString() + " blew by ======" + enemy.toString()  + " ===================================");
        //System.out.println(this.toString() + " :have hitPoints before this blow : " + hitPoints);
        //System.out.println(enemy.toString() + " :give demage : " + damageByEnemy);

        if (buckle!=null&&!buckle.isDestroyed(enemy.getWeapon())&&buckle.cancalDamage()){
            if(damageByEnemy<=0){
                buckle.setCancalDamge(true);
            }
            //System.out.println("protected by buck");
        } else if (equipedByArmor){
            //System.out.println("protected by armor");
            if(damageByEnemy>=3){
                this.hitPoints = this.hitPoints-(damageByEnemy-3);
            }

        }else{
            this.hitPoints = this.hitPoints-damageByEnemy;
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
