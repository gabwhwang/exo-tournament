package me.guillaume.recruitment.tournament;

public abstract class Weapon {

    private int blewtimer =0;

    public int getBlewTimer() {
        return blewtimer;
    }


    public abstract int getDamage();

    public void setBlewTimer(int blewtier) {
        this.blewtimer = blewtier;
    }

    public void increBlewtimer() {
        this.blewtimer++;
    }
}
