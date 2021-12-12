package me.guillaume.recruitment.tournament;

public class Buckle {
    private boolean cancalDamge = true;
    private int blewTimesByAxe = 0;

    public boolean cancalDamage(){

        if(cancalDamge){
            cancalDamge = false;
            return true;
        }else {
            cancalDamge =true;
            return false;
        }
    }

    public boolean isDestroyed(Weapon weapon){
        if(weapon instanceof Axe){
            if(!cancalDamge){
                blewTimesByAxe++;
            }
            if(blewTimesByAxe > 3){
                return true;
            }
        }
        return false;
    }

    public void setCancalDamge(boolean cancalDamge) {
        this.cancalDamge = cancalDamge;
    }
}
