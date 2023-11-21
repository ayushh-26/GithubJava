public class InvalidInputException extends Exception {
    public InvalidInputException(String message){
        super(message);
    }
}
//public class PatternPrintingProgram {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Welcome to the Pattern Printing Program!");
//            System.out.println("Patterns ->");
//            System.out.println("1. Square");
//            System.out.println("2. Right-Half Pyramid");
//            System.out.println("3. Left-Half Pyramid");
//            System.out.println("4. Triangle");
//            System.out.println("5. Hollow Triangle");
//            System.out.println("6. Reverse Hollow Triangle");
//            System.out.println("7. K-pattern");
//            System.out.println("8. Butterfly");
//            System.out.print("Select the pattern type:");
//            int patternChoice = scanner.nextInt();
//            if (patternChoice <= 0 || patternChoice > 8 ){
//                throw new InvalidInputException("Enter valid input");
//            }
//            System.out.print("Enter the size of the pattern: ");
//            int size = scanner.nextInt();
//            if (size <= 0) {
//                throw new InvalidInputException("Size must be a positive integer.");
//            }
//            System.out.print("Enter the character to be used in the pattern: ");
//            char character = scanner.next().charAt(0);
//
//            switch (patternChoice) {
//                case 1:
//                    printSquare(size, character);
//                    break;
//                case 2:
//                    printRightHalfPyramid(size, character);
//                    break;
//                case 3:
//                    printLeftHalfPyramid(size, character);
//                    break;
//                case 4:
//                    printTriangle(size, character);
//                    break;
//                case 5:
//                    printHollowTriangle(size, character);
//                    break;
//                case 6:
//                    printReverseHollowTriangle(size, character);
//                    break;
//                case 7:
//                    printKPattern(size, character);
//                    break;
//                case 8:
//                    printButterflyPattern(size, character);
//                    break;
//                default:
//                    System.out.println("Invalid choice. Please select 1 or 2 for pattern type.");
//            }
//        }catch (InvalidInputException e){
//            System.out.println("Invalid input: " + e.getMessage());
//        }
//        catch (Exception e){
//            System.out.println("Invalid input. Please use valid input");
//        }
//    }
//    public static void printSquare(int size, char character) {
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                System.out.print(character + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void printRightHalfPyramid(int size, char character) {
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print(character + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void printLeftHalfPyramid(int size, char character) {
//            for (int i = size; i >= 1; i--) {
//                for (int j = 1; j < i; j++) {
//                    System.out.print(" ");
//                }
//                for (int j = 0; j <= size - i; j++) {
//                    System.out.print(character);
//                }
//                System.out.println();
//            }
//        }
//    public static void printTriangle(int size, char character) {
//        for (int i = 0; i < size; i++) {
//            for (int j = size - i; j > 1; j--) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print(character);
//            }
//            System.out.println();
//        }
//    }
//    public static void printHollowTriangle(int size, char character) {
//        for (int i = 1; i <= size; i++) {
//            for (int j = i; j < size; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                if (k == 1 || i == size || k == (2 * i - 1)) {
//                    System.out.print(character);
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//    public static void printReverseHollowTriangle(int size, char character) {
//        for (int i = size; i >= 1; i--) {
//            for (int j = i; j < size; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= (2 * i - 1); k++) {
//                if (k == 1 || i == size || k == (2 * i - 1)) {
//                    System.out.print(character);
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//    public static void printKPattern(int size, char character) {
//        for (int i = size; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(character);
//            }
//            System.out.println();
//        }
//        for (int i = 2; i <= size; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(character);
//            }
//            System.out.println();
//        }
//    }
//
//    public static void printButterflyPattern(int size, char character) {
//        for (int i = 1; i <= size; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(character);
//            }
//            int spaces = 2 * (size - i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(character);
//            }
//            System.out.println();
//        }
//        for (int i = size; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(character);
//            }
//            int spaces = 2 * (size - i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print(character);
//            }
//            System.out.println();
//        }
//    }
//}
