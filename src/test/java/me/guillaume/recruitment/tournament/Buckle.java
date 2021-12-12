package me.guillaume.recruitment.tournament;

public class Buckle {
    private boolean cancalDamge = true;
    private int blowTmesByAxe = 0;

    public boolean cancalDamage(){

        if(cancalDamge){
            cancalDamge = false;
            //System.out.println("cancale damage this time");
            return true;
        }else {
            //System.out.println("not cancale damage this time");
            cancalDamge =true;
            return false;
        }
    }

    public boolean isDestroyed(Weapon weapon){
        if(weapon instanceof Axe){
            if(!cancalDamge){
                blowTmesByAxe++;
            }
            //System.out.println("blowed by AXE time : " + blowTmesByAxe);
            if(blowTmesByAxe > 3){
                //System.out.println("buckle is destroyed!");
                return true;
            }
        }
        return false;
    }

    public void setCancalDamge(boolean cancalDamge) {
        this.cancalDamge = cancalDamge;
    }
}
