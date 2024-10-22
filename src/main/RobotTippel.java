package main;

import java.util.Random;

public class RobotTippel {

    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println("1. feladat:");
        System.out.println("Három különböző robot tippel egyet-egyet:");
        
        int gondoltSzam = random.nextInt(1, 11);
        System.out.println("A kitalálandó szám: " + gondoltSzam);
        
        int robot1 = random.nextInt(1, 11);
        int robot2 = random.nextInt(1, 11);
        int robot3 = random.nextInt(1, 11);

        System.out.println("1. robot tippje: " + robot1);
        System.out.println("2. robot tippje: " + robot2);
        System.out.println("3. robot tippje: " + robot3);

        boolean voltTalalat = false;
        
        if (robot1 == gondoltSzam) {
            System.out.println("A 1. robot eltalálta!");
            voltTalalat = true;
        }
        
        if (robot2 == gondoltSzam) {
            System.out.println("A 2. robot eltalálta!");
            voltTalalat = true;
        }
        
        if (robot3 == gondoltSzam) {
            System.out.println("A 3. robot eltalálta!");
            voltTalalat = true;
        }
        
        if (!voltTalalat) {
            System.out.println("Egyik robot sem találta el!");
        }
        
        
//        if (robot1 == gondoltSzam || robot2 == gondoltSzam || robot3 == gondoltSzam) {
//            System.out.println("Az egyik robot eltalálta!");
//            voltTalalat = true;
//        } else {
//            System.out.println("Az egyik robot sem találta el!");
//            voltTalalat = false;
//        }
        

        System.out.println("\n##################################################\n");
        System.out.println("2. feladat:");
        System.out.println("Egy robot tippelhet háromszor:");
        
        int gondolt = random.nextInt(1, 11);
        System.out.println("A kitalálandó szám: " + gondolt);
        
        int tipp1 = random.nextInt(1, 11);
        int tipp2 = random.nextInt(1, 11);
        int tipp3 = random.nextInt(1, 11);
        
        System.out.println("1. tipp: " + tipp1);
        System.out.println("2. tipp: " + tipp2);
        System.out.println("3. tipp: " + tipp3);
        
        if (tipp1 == gondolt) {
            System.out.println("Elsőre sikerült eltalálni!");
        }
        
        if (tipp2 == gondolt) {
            System.out.println("Másodjára sikerült eltalálni!");
        }
        
        if (tipp3 == gondolt) {
            System.out.println("Harmadjára sikerült eltalálni!");
        }
    }
    
}
