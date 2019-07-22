package com.milomouse;


public class MenuDisplayModule {                // Module to display various static menus



    public static int mainMenuBeerGarden() {   // Display the main Beer Garden menu, return choice
                                                // TODO: add integer return parameter
        System.out.println();
        System.out.println("     @@ @* @@ @@ @@ * @@ @@*@@ @@ * @@ @@*@@ @@ * @ @@ @@ @@ @*  ");
        System.out.println("  @*@ @@ @@ *@                                     *@ @@ @@ @**  ");
        System.out.println("** @ @ *@ @*@      WELCOME TO THE BEER GARDEN!      @*@ ** @ @ *@");
        System.out.println("  @@* @@ @@ @@                                     @@ @* @@ @@   ");
        System.out.println("     @@ *@ @@ @@ @@ @ @@ @@*@@ @@ @ @@ @@*@@ @@ @ @ @@ *@ @@ @@  ");
        System.out.println();
        System.out.println("Welcome to the Beer Garden! Glad you stopped in. What's your poison?");
        System.out.println();
        System.out.println(" 1. Visit the Brew House (Review a Brewery)");
        System.out.println(" 2. Sample the Taps (Rate a Beer)");
        System.out.println(" 3. Relive the Magic (Run a Report)");
        System.out.println(" 4. Tour the Office (Tracker Maintenance)");
        System.out.println(" 0. Gop Grab a Cold One (EXIT)");
        System.out.println();
        System.out.print("Enter the number of your selection: ");

//        String choice = System.console().readLine();
//        return Integer.valueOf(choice);
        final int i = 2;
        return i;
    } // mainMenuBeerGarden


    public static void breweryChooserMenu() {     // Display the brewery choices menu

        //TODO: Loop through the CraftBrewRateReview.data.BreweryBackgroundData.csv file printing out the brewery choices



    } // breweryChooserMenu

    public static void beerStylesMenu() {      // Display the beer style choices menu


    } // beerStylesMenu



}  // MenuDisplayModule
