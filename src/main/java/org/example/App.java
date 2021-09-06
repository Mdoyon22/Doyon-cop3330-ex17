/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Doyon
 */
package org.example;
import java.io.IOException;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner inp = new Scanner(System.in);
        String genders = "", ounces = "", weight = "", hours = "";
        int gender = 0, ounce = 0, Weight = 0, hour = 0;
        double ADR;



        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        genders = inp.nextLine();

        try
        {
            gender = Integer.parseInt(genders);
        }
        catch (Exception e)
        {
            System.out.println("Please enter a numeric value");
            return;
        }

        System.out.print("How many ounces of alcohol did you have? ");
        ounces = inp.nextLine();

        try
        {
            ounce = Integer.parseInt(ounces);
        }

        catch (Exception e)
        {
            System.out.println("Please enter a numeric value");
            return;
        }

        System.out.print("What is your weight, in pounds? ");
        weight = inp.nextLine();

        try
        {
            Weight = Integer.parseInt(weight);
        }

        catch (Exception e)
        {
            System.out.println("Please enter a numeric value");
            return;
        }

        System.out.print("How many hours has it been since your last drink? ");
        hours = inp.nextLine();

        try
        {
            hour = Integer.parseInt(hours);
        }

        catch(Exception e)
        {
            System.out.println("Please enter a numeric value");
            return;
        }

        if (gender == 1)
        {
            ADR = 0.73;
        }

        else
        {
            ADR = 0.66;
        }

        double BAC = ounce * 5.14 / Weight * ADR - (0.015*hour);
        System.out.println("Your BAC is " + String.format("%.6f", BAC));

        if (BAC < 0.08)
        {
            System.out.print("It is legal for you to drive.");
        }

        else
        {
            System.out.print("It is illegal for you to drive.");
        }

    }
}
