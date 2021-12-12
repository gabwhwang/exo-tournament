package me.guillaume.recruitment.tournament;

public class Buckle {
    private boolean cancalDamge = true;

    public boolean cancalDamage(){
        if(cancalDamge){
            cancalDamge = false;
            return true;
        }else {
            cancalDamge =true;
            return false;
        }
    }

    public boolean isDestroyed(){
        return true;
    }
}
