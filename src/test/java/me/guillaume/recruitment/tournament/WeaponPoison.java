package me.guillaume.recruitment.tournament;

public class WeaponPoison extends Weapon{

    private static final int POISON_DAMAGE = 20;
    private static final int POISON_EFFET_TIME = 2;
    private Weapon weaponPure;

    @Override
    public int getDamage() {
        if(getBlewTimer()<= POISON_EFFET_TIME){
            return weaponPure.getDamage()+POISON_DAMAGE;
        }
        return weaponPure.getDamage();
    }

    public Weapon getWeaponPure() {
        return weaponPure;
    }

    public void setWeaponPure(Weapon weaponPure) {
        this.weaponPure = weaponPure;
    }
}
