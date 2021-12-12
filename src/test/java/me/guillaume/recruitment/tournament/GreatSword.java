package me.guillaume.recruitment.tournament;

public class GreatSword extends Weapon {
    private final int DAMAGE_GREATSWORD = 12;

    @Override
    public int getDamage() {

        if(getBlewTimer() %3 ==0){
            return 0;
        }
        return DAMAGE_GREATSWORD;
    }
}
