package com.LickingHeights;

public class Main {

    public static void main(String[] args) {


    }

    public static void drakeEquation(){
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
        int N;
        int rStar;
        double f_p;
        int numberOfExoplanets;
        double f_l;
        double f_i;
        double f_c;
        int l;

        N= rStar * f_p * numberOfExoplanets * f_l * f_i * f_c * l;
        System.out.println("rate of star formation");

        rStar = Keyboard.nextInt();
        System.out.println("Fraction of those stars that have planets");
         f_p = Keyboard.nextDouble();

         System.out.println("Number of those planets that can support life");
         numberOfExoplanets = Keyboard.nextInt();

         System.out.println("The Fraction of those Exoplanets that has life that evolves");
         f_l = Keyboard.nextDouble();

         System.out.println("The Fraction of that life that develops intelligence");
         f_i = Keyboard.nextDouble();

         System.out.println("The Fraction of That life that builds detectable communications");
         f_c = Keyboard.nextDouble();
         System.out.println("Longevity of the communications");
         l = Keyboard.nextInt();
        N = (int) (rStar * f_p * numberOfExoplanets * f_l * f_i * l * f_c);
        System.out.println("The Number of intelligent species that are out there that can communicate with us is: " + N);



    }

}
