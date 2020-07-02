package com.company;

public class Warrior extends Hero {
    @Override
    public String applySuperAbility(String superAbilityType) {
        return superAbilityType;

    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность CRITICAL DAMAGE");
    }
}
