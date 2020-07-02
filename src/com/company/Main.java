package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic();
        Magic magic = new Magic();
        Warrior warrior = new Warrior();

        Hero[] heroes = {medic, magic, warrior};
        for (Hero a: heroes) {
            a.applySuperAbility();

        }

    }
}
