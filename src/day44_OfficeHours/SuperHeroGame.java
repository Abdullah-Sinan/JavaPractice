package day44_OfficeHours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SuperHeroGame {
    public static void main(String[] args) {
    	
    	

    			SuperHero batman = new SuperHero();
    			SuperHero superman = new SuperHero();
    			SuperHero wonderwoman = new SuperHero();
    			SuperHero flash = new SuperHero();
    			SuperHero aquaman = new SuperHero();
    			SuperHero aladdin = new SuperHero();
    			SuperHero cyborg = new SuperHero();
    			SuperHero captainamerica = new SuperHero();
    			SuperHero sadirpalwan = new SuperHero();

    			batman.setName("Batman");
    			superman.setName("Superman");
    			wonderwoman.setName("Wonder Woman");
    			flash.setName("Flash");
    			aquaman.setName("Aquaman");
    			aladdin.setName("Aladdin");
    			cyborg.setName("Cyborg");
    			captainamerica.setName("Captain America");
    			sadirpalwan.setName("Sadir Palwan");
    			// we create list of superheroes
    			ArrayList<SuperHero> listofHeroes = new ArrayList<SuperHero>();
    			// we added all superheroes
    			// Arrays.asList() method convert array into an arraylist
    			listofHeroes.addAll(Arrays.asList(batman, superman, wonderwoman, flash, aquaman, aladdin, cyborg,
    					captainamerica, sadirpalwan));
//    			for (Superhero hero : listofHeroes) {
//    				System.out.println(hero.getName());
//    			}
    			String inputFromUser = "";
    			SuperHero randomHero = new SuperHero();
    			Random random = new Random();
    			Scanner scan = new Scanner(System.in);
    			do {
    				// if superhero name was not set, select random name from the collection
    				if (randomHero.getName() == null) {
    					randomHero = listofHeroes.get(random.nextInt(listofHeroes.size() - 1));
    				}
    				// to ask user to provide superhero name
    				System.out.print("Guess superhero name: ");
    				System.out.println(randomHero.getEncryptName());
    				System.out.print("Enter the name: ");
    				inputFromUser = scan.nextLine();
    				if (!inputFromUser.equals(randomHero.getName())) {
    					System.out.println("Try again!");
    				}
    			} while (!inputFromUser.equals(randomHero.getName()));
    			System.out.println("You win!");
    			System.out.println("WELL DONE");
    			System.out.println("Superhero name: " + randomHero.getName());

    		}
    	}