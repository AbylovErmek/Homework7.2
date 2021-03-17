package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic();
        magic.setTypeSuperAbility("Shoot");
        magic.setHealth(200);
        magic.setDamage(15);

        Medic medic = new Medic();
        medic.setTypeSuperAbility("Heal");
        medic.setHealth(160);
        medic.setDamage(10);

        Warrior warrior = new Warrior();
        warrior.setTypeSuperAbility("Kill");
        warrior.setHealth(250);
        warrior.setDamage(20);

        Hero[] heroes = {magic, medic, warrior};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].getTypeSuperAbility();
        }
    }
}
