package com.company;

public class Medic extends Hero {
    @Override
    public String applySuperAbility(String superAbilityType) {
        return superAbilityType;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность CRITICAL DAMAGE");
    }

}
