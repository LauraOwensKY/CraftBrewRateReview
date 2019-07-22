package com.milomouse;


public class Main {

    public static void main(String[] args) {
        int menuChoice;
        String breweryChoice;
        String[] breweryBackgroundData;

        // Display main menu and choose what to do  // TODO: Modify MenuDisplayModule.mainMenuBeerGarden() to accept user input

        menuChoice = MenuDisplayModule.mainMenuBeerGarden();
        System.out.println("You've chosen option " + menuChoice + "!");
        System.out.println();

        // Run the module the user selected from the menu ==>> FOR NOW, ONLY WORKING ON OPTION 2 TO RATE BEER

        //TODO: Create Module ==> Sample the Taps -- Record/Rate a Selected Beer Type from a Selected Brewery on a user-supplied date
        //TODO: MOVE THIS CODE TO SampleTheTaps method/class/thing

        //TODO: Create Module ==> Visit the Brew House -- Record/Rate a Brewery Visit on a user-supplied date
        //TODO: Create Module ==> Tour the Office -- Run reports, Maintain Craft Beer Tracker records, Save tracker as a spreadsheet

    } // main
} // Main class
