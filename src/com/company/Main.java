package com.company;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero(600, 40, "Magic");


        System.out.println("Hero" + " Health:" + hero.getHealth() + ";" + " Damage:"
                + hero.getDamage()+ ";" + " SuperPower:" + hero.getSuperpower() + ";");

        Hero hero1 = new Hero(600, 40);
        System.out.println("Hero"+ " Health:" + hero.getHealth() + ";" + " Damage:" + hero.getDamage());

        Boss boss = new Boss(1000,60,"Magical");
        System.out.println("Boss"+ " Health:" + boss.getHealth()+ ";" + " Damage:" + boss.getDamage()+ ";"
                + " DefenceType:" + boss.getDefenceType() + ";");
    }
}
