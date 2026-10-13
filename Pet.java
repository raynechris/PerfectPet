
//Rayne Christopher
//This program will tell you your perfect pet.

import java.util.Scanner; // Import the Scanner class

class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter your favorite color: (Red, Blue, or Green)");
    String color = (myObj.nextLine()).toLowerCase();

    System.out.println("Enter your favorite season: (Winter, Spring, Summer, or Fall)");
    String season = (myObj.nextLine()).toLowerCase();

    System.out.println("Enter your name:");
    String name = (myObj.nextLine()).toLowerCase();

    if (!("winterspringsummerfall".indexOf(season) >= 0)) {
      // this is not a valid season
      System.out.println("Please enter a valid season.");
      return;
    }

    if (!("redbluegreen".indexOf(color.substring(0).toLowerCase()) >= 0)) {
      // this is not a color given
      System.out.println("Please enter a valid color.");
      return;
    }

    if (!("abcdefghijklmnopqrstuvwxyz".indexOf(name.substring(0, 1).toLowerCase()) >= 0)) {
      // this is not a letter
      System.out.println("Please put your real name.");
      return;
    }

    if (color.equals("blue")) {
      if (season.equals("spring")) {
        System.out.println("You get an ostrich!");
      } else if (season.equals("summer")) {
        System.out.println("You get a pony!");
      } else if (season.equals("fall")) {
        System.out.println("You get an alligator!");
      } else if ("bcdfghjklmnpqrstvwxyz".indexOf(name.substring(0, 1).toLowerCase()) >= 0 && season.equals("winter")) {
        System.out.println("You get an axolotl!");
      } else {
        System.out.println("You get a pet rock. :(");
      }
    }

    else if (color.equals("green")) {
      if ("bcdfghjklmnpqrstvwxyz".indexOf(name.substring(0, 1).toLowerCase()) >= 0 && season.equals("winter")) {
        System.out.println("You get a giraffe!");
      } else if (season.equals("winter")) {
        System.out.println("You get a dog!");
      } else if (season.equals("spring")) {
        System.out.println("You get a dog!");
      } else if (season.equals("summer")) {
        System.out.println("You get a dog!");
      } else {
        System.out.println("You get a pet rock. :(");
      }
    }

    else if (color.equals("red")) {
      if (!("bcdfghjklmnpqrstvwxyz".indexOf(name.substring(0, 1).toLowerCase()) >= 0)) {
        System.out.println("You get a porcupine!");
      } 
      else if ("bcdfghjklmnpqrstvwxyz".indexOf(name.substring(0, 1).toLowerCase()) >= 0) {
        System.out.println("You get a panda!");
    }
else {
        System.out.println("You get a pet rock. :(");
      }
  }
}}
