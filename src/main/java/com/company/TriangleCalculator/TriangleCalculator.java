package com.company.TriangleCalculator;

import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of adjacent side of right triangle:");
        double adj = Double.parseDouble(scan.nextLine());
        System.out.println("Please enter length of opposite side of right triangle:");
        double opp = Double.parseDouble(scan.nextLine());

        // Calculate hypotenuse
        double hyp = Math.sqrt((adj * adj) + (opp * opp));

        // SOH-CAH-TOA
        double sine = opp / hyp;
        double cosine = adj / hyp;
        double tangent = opp / adj;

        System.out.println("Sine: " + sine);
        System.out.println("Cosine: " + cosine);
        System.out.println("Tangent: " + tangent);
    }
}
