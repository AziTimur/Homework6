package com.company;

public class Skeletons extends Boss {
    private int countStrike;

    public void setCountStrike(int countStrike) {
        this.countStrike = countStrike;
    }

    public int getCountStrike() {
        return countStrike;
    }

    @Override
    public String printInfo() {
        return super.getHealth()+" "+getDamage()+" "+ sword.getNameWeapon()+" "+sword.getTypeWeapon()+" "+getCountStrike();
    }
}
