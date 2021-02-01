// i have updated the game by making more paths, using methods andadded an extra guessing game to the end.
package mygameimproved;

import java.util.Scanner;
import java.util.Random;

public class MyGameImproved {

    Scanner input = new Scanner(System.in);
    Random random = new Random();
    public static boolean game = true;
    public static int health = 100;
    public static int coins = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("You awaken and look up");
        System.out.println("There is a chest in front of you (enter \"1\" to walk towards it)");
        System.out.println();
        String con = input.next();
        int number = random.nextInt(3);

        if (con.equals("1")) {
            System.out.println();
            if (number == 0) {
                System.out.println("You open the chest and pick up the \"Rusty Sword\"");
                String weapon = new String("Rusty Sword");
            } else if (number == 1) {
                System.out.println("You open the chest and pick up the \"Blunt Knife\"");
                String weapon = new String("Blunt Knife");
            } else if (number == 2) {
                System.out.println("You open the chest and pick up the \"Broken Axe\"");
                String weapon = new String("Broken Axe");
            }
        } else {
            System.out.println();
            System.out.println("You did not walk the right way and got lost");
            System.out.println();
            System.out.println("You lose");
            game = false;
        }
        //END OF INTRO

        if (game == true) {
            firstPath();
        }
        if (game == true) {
            secondPath();
        }
        if (game == true) {
            thirdPath();
        }
    }

    public static void firstPath() {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println();
        System.out.println("There are three paths infront of you");
        System.out.println("Choose either (enter \"1\" \"2\" or \"3\")");
        System.out.println();
        String con = input.next();

        if (con.equals("1")) {
            System.out.println();
            System.out.println("You walk forward into a forest");
            System.out.println("There are coins on the floor that you decide to pick up");
            while (coins <= 0) {
                coins = coins + 10;
            }
            System.out.println();
            System.out.println(health + " Health");
            System.out.println(coins + " Coins");

        } else if (con.equals("2")) {
            System.out.println();
            System.out.println("You walk left into a forest");
            System.out.println("A man stands with his back to you");
            System.out.println("Do you approach him \"1\"(yes) or \"2\"(No)");
            System.out.println();
            String ans = input.next();
            if (ans.equals("1")) {
                System.out.println();
                System.out.println("The man turns around and greets you giving you 50 coins");
                coins = coins + 50;
            } else if (ans.equals("2")) {
                System.out.println();
                System.out.println("You sneak around the man without him noticing you");
            } else {
                System.out.println();
                System.out.println("You walked the worng way and fell in a pit");
                System.out.println("You lose");
                System.out.println("You had " + coins + "coins");
                game = false;
            }

        } else if (con.equals("3")) {
            System.out.println();
            System.out.println("You walk right onto a clear path");
            System.out.println("A wild bird lands infront of you");
            System.out.println();
            System.out.println("A battle has started between you and the bird");

            boolean bird = true;
            int bird2 = 10;
            while (bird == true) {

                int birddam = random.nextInt(6);
                System.out.println();
                System.out.println("The bird attacks dealing " + birddam + " damage");
                health = health - birddam;
                System.out.println();
                System.out.println("You have " + health + " health");

                if (health <= 0) {
                    System.out.println();
                    System.out.println("you lose");
                    System.out.println("You had " + coins + "coins");
                    game = false;
                }
                System.out.println("Your move \"1\"(Attack) or \"2\"(Run)");
                System.out.println();
                String ans = input.next();

                if (ans.equals("1")) {
                    int damage = random.nextInt(10);
                    System.out.println();
                    System.out.println("You attack the bird");
                    System.out.println("You deal " + damage + " damage to the bird");
                    bird2 = bird2 - damage;
                    System.out.println("The bird has " + bird2 + " health");
                } else if (ans.equals("2")) {
                    System.out.println();
                    System.out.println("You try to run but the bird catches you");
                } else {
                    System.out.println();
                    System.out.println("You cant decide what to do");
                }
                if (bird2 <= 0) {
                    bird = false;
                    System.out.println();
                    System.out.println("You win the battle!");
                }
            }
        } else {
            System.out.println();
            System.out.println("You walked the worng way and fell in a pit");
            System.out.println("You lose");
            System.out.println("You had " + coins + "coins");
            game = false;
        }
    }

    public static void secondPath() {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println();
        System.out.println("There are two paths infront of you");
        System.out.println("Choose either (enter \"1\" or \"2\")");
        System.out.println();
        String con = input.next();

        if (con.equals("1")) {
            System.out.println();
            System.out.println("You walk left into a cave");
            System.out.println("You hear growls all around you");
            System.out.println("A wild beast approaches you");
            System.out.println();
            System.out.println("A battle has started between you and the beast");
            System.out.println();

            boolean beast = true;
            int beast2 = 20;
            while (beast == true) {

                int beastdam = random.nextInt(16);
                System.out.println("The beast attacks dealing " + beastdam + " damage");
                health = health - beastdam;
                System.out.println();
                System.out.println("You have " + health + " health");

                if (health <= 0) {
                    System.out.println();
                    System.out.println("you lose");
                    System.out.println("You had " + coins + "coins");
                    game = false;
                }
                System.out.println("Your move \"1\"(Attack) or \"2\"(Run)");
                System.out.println();
                String ans = input.next();

                if (ans.equals("1")) {
                    int damage = random.nextInt(10);
                    System.out.println();
                    System.out.println("You attack the beast");
                    System.out.println("You deal " + damage + " damage to the beast");
                    beast2 = beast2 - damage;
                    System.out.println("The beast has " + beast2 + " health");
                } else if (ans.equals("2")) {
                    System.out.println();
                    System.out.println("You try to run but cannot find an escape from the cave");
                } else {
                    System.out.println();
                    System.out.println("You cant decide what to do");
                }
                if (beast2 <= 0) {
                    beast = false;
                    System.out.println();
                    System.out.println("You win the battle!");
                }
            }
        } else if (con.equals("2")) {
            System.out.println();
            System.out.println("You walk right onto a clear path");
            System.out.println("A warrior is walking towards you from the opposite direction");
            System.out.println("The warrior attaempts to steal you weapon but you refuse to give it to them");
            System.out.println();
            System.out.println("A battle has started between you and the warrior");
            System.out.println();

            boolean warrior = true;
            int warrior2 = 20;
            while (warrior == true) {

                int warriordam = random.nextInt(16);
                System.out.println("The warrior attacks dealing " + warriordam + " damage");
                health = health - warriordam;
                System.out.println();
                System.out.println("You have " + health + " health");

                if (health <= 0) {
                    System.out.println();
                    System.out.println("you lose");
                    System.out.println("You had " + coins + "coins");
                    game = false;
                }
                System.out.println("Your move \"1\"(Attack) or \"2\"(Run)");
                System.out.println();
                String ans = input.next();

                if (ans.equals("1")) {
                    int damage = random.nextInt(10);
                    System.out.println();
                    System.out.println("You attack the warrior");
                    System.out.println("You deal " + damage + " damage to the warrior");
                    warrior2 = warrior2 - damage;
                    System.out.println("The warrior has " + warrior2 + " health");
                } else if (ans.equals("2")) {
                    System.out.println();
                    System.out.println("You try to run but trip in your escape");
                } else {
                    System.out.println();
                    System.out.println("You cant decide what to do");
                }
                if (warrior2 <= 0) {
                    warrior = false;
                    System.out.println();
                    System.out.println("You win the battle!");
                }
            }
        } else {
            System.out.println();
            System.out.println("You walked the worng way and fell into a lake");
            System.out.println("You lose");
            System.out.println("You had " + coins + "coins");
            game = false;
        }

    }

    public static void thirdPath() {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println();
        System.out.println("You see the final room press \"1\" to enter");
        System.out.println();
        String con = input.next();
        if (!con.equals("1")) {
            System.out.println();
            System.out.println("You walk the wrong way");
            game = false;

            System.out.println();
            System.out.println("you lose");
            System.out.println("You had " + coins + "coins");
        } else {
            System.out.println();
            System.out.println("You enter the room and see the boss");
            System.out.println("The boss challenges you to a game of guessing the same number");
            System.out.println("You have 3 attempts to guess the same number as the Boss(0-5)");
            System.out.println();
            System.out.println("You battle the Boss to a game of guessing");
            System.out.println();

            int life = 3;

            while (game == true) {
                int bossNum = random.nextInt(6);
                System.out.println("Enter you number from (0-5)");
                System.out.println();
                int guess = input.nextInt();
                if (bossNum == guess) {
                    System.out.println();
                    System.out.println("You guessed " + guess);
                    System.out.println("The boss guessed " + bossNum);
                    System.out.println("You defeated the Boss");
                    System.out.println("Congratulations you won the game with " + health + " health and " + coins + " coins!");
                    game = false;
                } else {
                    System.out.println();
                    System.out.println("You guessed " + guess);
                    System.out.println("The boss guessed " + bossNum);
                    System.out.println("You lost the round");
                    life = life - 1;
                    if (life == 0) {
                        System.out.println();
                        System.out.println("you lose");
                        System.out.println("You had " + coins + " coins");
                        game = false;
                    }
                }
            }
        }

    }
}