package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 drakeEquation();

    }
        public static void drakeEquation() {

/*Drake equation
N = number of intelligent species that can communicate with us
R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
fl = 1 (100% of these planets will develop life)
fi = 1 (100% of which will develop intelligent life)
fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */




            Scanner keyboard;
            keyboard = new Scanner (System.in);

            int N;
            int rStar;
            double f_p;
            int numberOfExoplanets;
            double f_l;
            double f_i;
            double f_c;
            int L;

            System.out.println("rate of star formation");
            rStar = keyboard.nextInt();

            System.out.println ("Fraction of said stars with planets");
            f_p = keyboard.nextDouble();

            System.out.println("# of planets capable of supporting life");
            numberOfExoplanets = keyboard.nextInt();

            System.out.println ("Fraction of Exoplanets capable of supporting life");
            f_l = keyboard.nextDouble();

            System.out.println ("fraction of that life that develops intelligence");
            f_i = keyboard.nextDouble();

            System.out.println("Develops communication");
            f_c = keyboard.nextDouble();

            System.out.println("Longevity of communication");
            L = keyboard.nextInt();

            //equation

            N = (int)(rStar * f_p * numberOfExoplanets * f_l * f_i * f_c * L);

            System.out.println("The number of intelligent species that are out there, \n"
                    + "that can communicate with us is: " + N );




        }

}
