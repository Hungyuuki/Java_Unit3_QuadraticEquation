package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("a =");
        double a = input.nextDouble();
        System.out.println("b =");
        double b = input.nextDouble();
        System.out.println("c =");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("PT của bạn là:" + quadraticEquation.toString());

        if (a == 0) {
            if (b != 0) {
                System.out.println("PT này là pt bậc nhất có nghiệm là " + -c / b);
            } else if (a == 0 && b == 0) {
                System.out.println("PT vô nghiệm");
            }
        } else if (a != 0) {
            if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("PT có 1 nghiệm là: " + quadraticEquation.getRoot1());
            }
        } else if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("PT vô nghiệm");
        } else if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("PT có 2 nghiệm là: " + quadraticEquation.getRoot1() + " và " + quadraticEquation.getRoot2());
        }
    }
}

