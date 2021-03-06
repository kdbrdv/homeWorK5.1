package com.company;

public class Main {

    public static void main(String[] args) {
        Hero hero = new Hero(600, 40, "Magic");


        System.out.println("Hero" + " " + hero.getHealth() + " " + hero.getDamage() + " " + hero.getSuperpower());

        Hero hero1 = new Hero(600, 40);
        System.out.println("Hero"+ " " + hero.getHealth() + " " + hero.getDamage());

        Boss boss = new Boss(1000,60,"Magical");
        System.out.println("Boss"+ " " + boss.getHealth() + " " + boss.getDamage() + " " + boss.getDefenceType());
    }
}
