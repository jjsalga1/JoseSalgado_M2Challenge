package com.company;

import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of adjacent side of right triangle:");
        double adj = Integer.parseInt(scan.nextLine());
        System.out.println("Please enter length of opposite side of right triangle:");
        double opp = Integer.parseInt(scan.nextLine());
        double hyp = Math.sqrt((adj * adj) + (opp * opp));
        
    }
}
