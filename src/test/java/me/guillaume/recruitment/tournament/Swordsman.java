package me.guillaume.recruitment.tournament;

public class Swordsman extends GameRole{

    private final int INIT_SWORDSMAN_HITPOINTS = 100;
    public Swordsman() {
        setHitPoints(INIT_SWORDSMAN_HITPOINTS);
        setWeapon(new Sword());
    }

    public Swordsman(String Vicious){
        if(Vicious.equals("Vicious")){
            setHitPoints(INIT_SWORDSMAN_HITPOINTS);
            WeaponPoison weaponPoison = new WeaponPoison();
            weaponPoison.setWeaponPure(new Sword());
            setWeapon(weaponPoison);
        } //else create exception

    }

    public void engage(GameRole role) {//engage method, to be complet later with the progress of test
        while(this.hitPoints()>0&&role.hitPoints()>0){
            role.hitPointAfterEachBlow(this);
            if(role.hitPoints()>0){
                this.hitPointAfterEachBlow(role);
            }
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
