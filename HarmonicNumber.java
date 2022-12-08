package day5BasicCoreProgram;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        System.out.println("enter harmonic number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double harmonicN = 1;

        // Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n
        for (int i = 1; i <= n; i++) {

            harmonicN = (double) 1 / i;

            System.out.print(harmonicN);
            System.out.print("+ ");

        }

    }
}
