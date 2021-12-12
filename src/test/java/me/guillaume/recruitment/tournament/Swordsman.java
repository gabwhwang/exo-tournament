package me.guillaume.recruitment.tournament;

public class Swordsman extends GameRole{

    public Swordsman() {
        setHitPoints(100);
        setWeapon(new Sword());
    }

    public void engage(GameRole role) {//engage method, to be complet later with the progress of test
        if(role instanceof Viking){
            Viking viking = (Viking) role;
            while(this.hitPoints()>0&&viking.hitPoints()>0){

                role.hitPointAfterEachBlow(this);
                this.hitPointAfterEachBlow(role);
                //setHitPoints(this.hitPoints()-role.getDamge());
                //viking.setHitPoints(viking.hitPoints()-this.getDamge());
            }
        }else{
            System.out.println("Only Viking role is supported");
        }

    }



    @Override
    public Swordsman equip(String equipName) {
        return (Swordsman)super.equip(equipName);
    }

    @Override
    public String toString() {
        return "Swordsman";
    }
}
