package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int baseLength = (n * 2) - 1;
        for(int i = 1; i < n; i++) { //indicates what row
            int numAstericks = ((i * 2) - 1);
            int numSpaces = (((baseLength - numAstericks)/2));

            for(int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < numAstericks; k++) {
                System.out.print("*");
            }
            System.out.println();
            //row 1 1 x 2 - 1 = *
            //row 2 2 x 2 - 1 = ***
            //row 3 3 x 2 - 1 = *****
            //row 4 4 x 2 - 1 = *******
        }
        drawBaseLine(n);
    }

    private static void drawBottomOfDiamond(int n) {
        for(int i = n-1; i > 0; i--) { //indicates what row
            int length = (n*2)-1;
            int numAstericks = ((i * 2) - 1);
            int numSpaces = ((length - numAstericks)/2);


            for(int j = numSpaces; j > 0; j--) {
                System.out.print(" ");
            }

            for (int k = numAstericks; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println("");

            //row 1 1 x 2 - 1 = *
            //row 2 2 x 2 - 1 = ***
            //row 3 3 x 2 - 1 = *****
            //row 4 4 x 2 - 1 = *******
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        drawBottomOfDiamond(n);
        System.out.println();
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        String name = "FayeC";

        // top triangle (issues with repeat base line)
        int baseLength = (n * 2) - 1;
        for(int i = 1; i < n; i++) {
            int numAstericks = ((i * 2) - 1);
            int numSpaces = (((baseLength - numAstericks)/2));

            for(int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < numAstericks; k++) {
                System.out.print("*");
            }
            System.out.println();
            //row 1 1 x 2 - 1 = *
            //row 2 2 x 2 - 1 = ***
            //row 3 3 x 2 - 1 = *****
            //row 4 4 x 2 - 1 = *******
        }
        drawBaseLine(n, name);
        drawBottomOfDiamond(n);
    }

    private static void drawBaseLine(int n) {
        int baseLength = (n * 2) - 1;

        for (int j = 0; j < baseLength; j++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static void drawBaseLine(int n, String name) {
        int baseLength = (n * 2) - 1;
        name = "FayeC";
        int numSpacesBeforeName = (baseLength - name.length()) - 1;
        for (int i = 0; i < numSpacesBeforeName; i++) {
            System.out.print(" ");
        }
        System.out.print(name + "\n");
    }

    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }
    // 3 8 3
}
