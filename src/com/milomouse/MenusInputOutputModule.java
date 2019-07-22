package com.milomouse;

import static jdk.nashorn.internal.runtime.ScriptingFunctions.readLine;

import java.io.*;


/**************************************************************************************************
 *
 *   This module contains all the console-based menus in one convenient place.
 *
 *************************************************************************************************
 */

public class MenusInputOutputModule {

    public static int mainMenuBeerGarden() // Display the main Beer Garden menu, return menuChoice as integer
        throws IOException   {
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
            System.out.println(" 0. Go Grab a Cold One! (EXIT)");
            System.out.println();
            String menuChoiceBeerGarden = readLine("Enter the number of your selection: ");
            return Integer.parseInt(menuChoiceBeerGarden);
    } // mainMenuBeerGarden


    public static void breweryChooserMenu() {     // Display the brewery choices menu
        //TODO: Accept User input
        //TODO: Loop through the CSV file to find (map to?) the user-entered input
        //TODO: Populate Tracker Record with found information
    } // breweryChooserMenu

    public static void beerStylesMenu() {      // Display the beer style choices menu
        //TODO: Accept User input
        //TODO: Loop through the CSV file to find (map to?) the user-entered input
        //TODO: Populate Tracker Record with found information
        //TODO: Return something???
    } // beerStylesMenu


    public static void GoGrabAColdOne() {
        System.out.println();
        System.out.println("     @@ @* @@ @@ @@ * @@ @@*@@ @@ * @@ @@*@@ @@ * @ @@ @@ @@ @*     ");
        System.out.println();
        System.out.println("** @ @                Thank for stoppin' by!                  @ @ *@");
        System.out.println();
        System.out.println("        Now Go grab a cold one and let me know how it goes!         ");
        System.out.println();
        System.out.println("     @@ *@ @@ @@ @@ @ @@ @@*@@ @@ @ @@ @@*@@ @@ @ @ @@ *@ @@ @@     ");
        System.out.println();
    }
}  // MenusInputOutputModule
