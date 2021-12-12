package me.guillaume.recruitment.tournament;

public class Swordsman extends GameRole{

    public Swordsman() {
        setHitPoints(100);
        setWeapon(new Sword());
    }

    public void engage(GameRole role) {//engage method, to be complet later with the progress of test
        while(this.hitPoints()>0&&role.hitPoints()>0){
            role.hitPointAfterEachBlow(this);
            this.hitPointAfterEachBlow(role);
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
