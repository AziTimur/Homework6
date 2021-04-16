package com.company;

public class Boss extends GameEntity {
      Weapon sword=new Weapon();

    public Weapon getSword() {
        return sword;
    }

    public void setSword(Weapon sword) {
        this.sword = sword;
    }
     public  String printInfo(){
        return "Босс: здоровья "+getHealth()+" урон "+getDamage()+" "+sword.getNameWeapon()+" "+sword.getTypeWeapon();
    }

}
