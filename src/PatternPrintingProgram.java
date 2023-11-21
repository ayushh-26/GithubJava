import java.io.*;
import java.util.*;

public class PatternPrintingProgram {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            while (true) {
                System.out.println("Welcome to the Pattern Printing Program!");
                System.out.println("Patterns ->");
                System.out.println("1. Square");
                System.out.println("2. Right-Half Pyramid");
                System.out.println("3. Left-Half Pyramid");
                System.out.println("4. Triangle");
                System.out.println("5. Hollow Triangle");
                System.out.println("6. Reverse Hollow Triangle");
                System.out.println("7. K-pattern");
                System.out.println("8. Butterfly");
                System.out.println("9. Reverse Right Half Pyramid");
                System.out.println("10. Reverse Left Half Pyramid");
                System.out.println("11. Diamond");
                System.out.println("12. Hollow Diamond");
                System.out.print("Select the pattern type (or enter 0 for a random pattern): ");
                int patternChoice = scanner.nextInt();

                if (patternChoice == 0) {
                    randomPattern();
                } else if (patternChoice <= 0 || patternChoice > 12) {
                    throw new InvalidInputException("Enter a valid input");
                } else {
                    processPattern(patternChoice);
                }

                System.out.print("Do you want to print another pattern? (yes/no): ");
                String continueChoice = scanner.next().toLowerCase();
                if (!continueChoice.equals("yes")) {
                    System.out.println("Thanks for using pattern printing program");
                    break;
                }
            }
        } catch (InvalidInputException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input. Please use valid input");
        }
    }
    private static void randomPattern(){
        Random random = new Random();
        int patternChoice = random.nextInt(12) + 1;
        int size = random.nextInt(16) + 5;
        char[] characters = {'+', '*', '@', '!', '#', '$', '^', '~', '|'};
        char character = characters[random.nextInt(characters.length)];

        System.out.println("Random Pattern ->");
        System.out.println("Pattern Type: " + patternChoice);
        System.out.println("Size: " + size);
        System.out.println("Character: " + character);

        printPattern(patternChoice, size, character);
 }
    private static void processPattern(int patternChoice) throws InvalidInputException {
        System.out.print("Enter the size of the pattern: ");
        int size = PatternPrintingProgram.scanner.nextInt();
        if (size <= 0) {
            throw new InvalidInputException("Size must be a positive integer.");
        }

        System.out.print("Enter the character to be used in the pattern: ");
        char character = PatternPrintingProgram.scanner.next().charAt(0);

        printPattern(patternChoice, size, character);
    }
    private static void printPattern(int patternChoice, int size, char character) {
        switch (patternChoice) {
            case 1:
                printSquare(size, character);
                break;
            case 2:
                printRightHalfPyramid(size, character);
                break;
            case 3:
                printLeftHalfPyramid(size, character);
                break;
            case 4:
                printTriangle(size, character);
                break;
            case 5:
                printHollowTriangle(size, character);
                break;
            case 6:
                printReverseHollowTriangle(size, character);
                break;
            case 7:
                printKPattern(size, character);
                break;
            case 8:
                printButterflyPattern(size, character);
                break;
            case 9:
                printReverseRightHalfPyramid(size, character);
                break;
            case 10:
                printReverseLeftHalfPyramid(size, character);
                break;
            case 11:
                printDiamond(size, character);
                break;
            case 12:
                printHollowDiamond(size, character);
                break;
            default:
                System.out.println("Invalid choice. Please select a valid pattern type.");
        }
    }

    private static void printSquare(int size, char character) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }
    private static void printRightHalfPyramid(int size, char character) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(character + " ");
            }
            System.out.println();
        }
    }
    private static void printLeftHalfPyramid(int size, char character) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= size - i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
    private static void printTriangle(int size, char character) {
        for (int i = 0; i < size; i++) {
            for (int j = size - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
    private static void printHollowTriangle(int size, char character) {
        for (int i = 1; i <= size; i++) {
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == size || k == (2 * i - 1)) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    private static void printReverseHollowTriangle(int size, char character) {
        for (int i = size; i >= 1; i--) {
            for (int j = i; j < size; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || i == size || k == (2 * i - 1)) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    private static void printKPattern(int size, char character) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
        for (int i = 2; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }

    private static void printButterflyPattern(int size, char character) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
            }
            int spaces = 2 * (size - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
            }
            int spaces = 2 * (size - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
    private static void printReverseRightHalfPyramid(int n, char character) {
        int i, j;

        for (i = n; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
    private static void printReverseLeftHalfPyramid(int n, char character) {
        int i, j;

        int num = 2 * n - 2;

        for (i = n; i > 0; i--) {
            for (j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            num = num - 2;

            for (j = 0; j < i; j++) {
                System.out.print(character);
            }

            System.out.println();
        }
    }
    private static void printDiamond(int size, char character) {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print(character);
            }
            System.out.println();
        }
    }
    private static void printHollowDiamond(int size, char character) {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = size - 1; i >= 1; i--) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (j == 1 || j == i * 2 - 1) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


