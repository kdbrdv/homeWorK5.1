package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(40);
        boss.setDefenceType("Magical");

        System.out.println("Boss" + " Health:" + boss.getHealth() + ";" + " Damage:" + boss.getDamage() + ";"
                + " DefenceType:" + boss.getDefenceType() + ";");

        Main main = new Main();
        Hero[] heroes = main.createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getSuperpower() + "  " + heroes[i].getHealth() + "  " + heroes[i].getDamage());
        }


    }
    public static Hero[] createHeroes(){
        Hero hero1 = new Hero(350,50,"Physical");
        Hero hero2 = new Hero(320,0,"Healer");
        Hero hero3 = new Hero(360,30);

        Hero[] heroes = {hero1,hero2,hero3};

        return heroes;
    }

}
