package com.company;

public class Main {

    public static void main(String[] args) {

	// write your code here
        Weapon sword=new Weapon();
        sword.setNameWeapon("valyrian");
        sword.setTypeWeapon("edged weapons");

        Boss boss=new Boss();
        boss.setDamage(150);
        boss.setHealth(3000);
        boss.setSword(sword);
        System.out.println("Здоровья Босса "+boss.getHealth()+" урон Босса  "+boss.getDamage()+" оружия Боссa  "+ sword.getNameWeapon()+" "+sword.getTypeWeapon());
        System.out.println("-------дз на сооб-------");
        System.out.println(boss.printInfo());
        System.out.println("----------------------");

        Skeletons skelet=new Skeletons();
        Skeletons skelet2=new Skeletons();
        skelet.setHealth(250);
        skelet.setDamage(100);
       // skelet.setSword();
        skelet.sword.setTypeWeapon("магия");
        skelet.sword.setNameWeapon("огонь");
        skelet.setCountStrike(26);
        skelet2.setHealth(300);
        skelet2.setDamage(90);
        skelet2.sword.setTypeWeapon("магия");
        skelet2.sword.setNameWeapon("лёд");
        skelet2.setCountStrike(30);

        System.out.println(skelet.printInfo()+"\n"+skelet2.printInfo());


        //System.out.println(boss.printInfo()+" количество ударов "+skelet.getCountStrike());
       // System.out.println(skelet.printInfo()+" "+ skelet.getCountStrike());

    }

}
