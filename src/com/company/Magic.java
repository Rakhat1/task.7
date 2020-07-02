package com.company;

public class Magic extends Hero {
    @Override
    public String applySuperAbility(String superAbilityType) {
        return superAbilityType;
    }

    @Override
    public void applySuperAbility(){
        System.out.println("Magic применил суперспособность CRITICAL DAMAGE");
    }
}
