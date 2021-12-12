package me.guillaume.recruitment.tournament;

public class Highlander extends GameRole{
    private final int INIT_HIGHLANDER_HITPOINT = 150;
    private final double BERSERK_FACTOR = 0.3;

    public Highlander() {
        setHitPoints(INIT_HIGHLANDER_HITPOINT);
        setWeapon(new GreatSword());
    }

    public Highlander(String Veteran) {
        if(Veteran.equals("Veteran")){
            setHitPoints(INIT_HIGHLANDER_HITPOINT);
            setWeapon(new GreatSword());
            setBerserk(true);
            setBerserkThresold(INIT_HIGHLANDER_HITPOINT*BERSERK_FACTOR);
        }//else create exception

    }

    @Override
    public Highlander equip(String equipName) {
        return (Highlander)super.equip(equipName);
    }

    @Override
    public String toString() {
        return "Highlander";
    }
}
