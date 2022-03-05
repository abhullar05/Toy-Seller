import java.util.Scanner;

/**
 * * Purdue University -- CS18000 -- Fall 2021 -- Homework 04 -- Challenge
 * <p>
 * A program that determines the price of a custom-made toy.
 *
 * @author Advit Bhullar L24
 * @version September 18, 2021
 */
public class ToySeller {

    private static String welcomeMessage = "Welcome to the Custom Toy Builder!\nOur store can custom-design " +
            "3 different types of toys.";
    private static String startMessage = "Which would you like to create? (Enter a number)\n" +
            "1. Superman figurine\n" +
            "2. Robotic cyclops\n" +
            "3. Cat-shaped lamp\n" +
            "4. EXIT";
    private static String endProgram = "Thanks for using the Custom Toy Builder!";

    private static String sizeQuestion = "What size toy would you like? (Enter S, M, or L)";
    private static String supermanQ1 = "Do you want Superman to talk? (Enter Y or N)";
    private static String supermanQ2 = "Do you want to add a cape? (Enter Y or N)";
    private static String roboticCyclopsQ1 = "Do you want the Robotic Cyclops to move? (Enter Y or N)";
    private static String roboticCyclopsQ2 = "What color eye do you want? (Enter 1, 2, or 3)\n" +
            "1. Red\n" +
            "2. Yellow\n" +
            "3. Blue";
    private static String catLampQ1 = "What color Cat-shaped Lamp do you want? (Enter 1, 2, 3, or 4)\n" +
            "1. Gold\n" +
            "2. Pink\n" +
            "3. Blue\n" +
            "4. No Color";
    private static String catLampQ2 = "Do you want the Cat-shaped Lamp to glow? (Enter Y or N)";

    private static String supermanCost = "Your Superman figurine costs";
    private static String roboticCyclopsCost = "Your Robotic Cyclops costs";
    private static String catLampCost = "Your Cat-shaped Lamp costs";


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalPrice = 0;

        System.out.println(welcomeMessage);
        System.out.println(startMessage);
        int selectedToyNumber = scan.nextInt();
        scan.nextLine();

        if (selectedToyNumber == 1) {
            System.out.println(sizeQuestion);
            String selectedToySize = scan.nextLine();
            selectedToySize = selectedToySize.toUpperCase(); // can also use .equalsIgnoreCase()
            if (selectedToySize.equals("S") || selectedToySize.equals("M") || selectedToySize.equals("L")) {
                totalPrice = switch (selectedToySize) {
                    case "S" -> 5;
                    case "M" -> 10;
                    case "L" -> 15;
                    default -> 0;
                };

                System.out.println(supermanQ1);
                String selectedSupermanTalk = scan.nextLine();
                selectedSupermanTalk = selectedSupermanTalk.toUpperCase();
                if (selectedSupermanTalk.equals("Y") || selectedSupermanTalk.equals("N")) {
                    totalPrice = switch (selectedSupermanTalk) {
                        case "Y" -> totalPrice + 8;
                        case "N" -> totalPrice + 4;
                        default -> 0;
                    };
                    System.out.println(supermanQ2);
                    String selectedCapeOption = scan.nextLine();
                    selectedCapeOption = selectedCapeOption.toUpperCase();
                    if (selectedCapeOption.equals("Y") || selectedCapeOption.equals("N")) {
                        totalPrice = switch (selectedCapeOption) {
                            case "Y" -> totalPrice + 5;
                            case "N" -> totalPrice + 0;
                            default -> 0;
                        };
                        System.out.printf("%s $%d!\n", supermanCost, totalPrice);
                        System.out.println(endProgram);
                    } else {
                        System.out.println("Please enter a valid input");
                    }
                } else {
                    System.out.println("Please enter a valid input");
                }
            } else {
                System.out.println("Please enter a valid input");
            }
        } else if (selectedToyNumber == 2) {
            System.out.println(sizeQuestion);
            String selectedToySize = scan.nextLine();
            selectedToySize = selectedToySize.toUpperCase();
            if (selectedToySize.equals("S") || selectedToySize.equals("M") || selectedToySize.equals("L")) {
                totalPrice = switch (selectedToySize) {
                    case "S" -> 5;
                    case "M" -> 10;
                    case "L" -> 15;
                    default -> 0;
                };
                System.out.println(roboticCyclopsQ1);
                String selectedCyclopsMove = scan.nextLine();
                selectedCyclopsMove = selectedCyclopsMove.toUpperCase();
                if (selectedCyclopsMove.equals("Y") || selectedCyclopsMove.equals("N")) {
                    totalPrice = switch (selectedCyclopsMove) {
                        case "Y" -> totalPrice + 5;
                        case "N" -> totalPrice + 3;
                        default -> 0;
                    };
                    System.out.println(roboticCyclopsQ2);
                    int selectedCyclopsEyeColor = scan.nextInt();
                    scan.nextLine();
                    if (selectedCyclopsEyeColor == 1 || selectedCyclopsEyeColor == 2 || selectedCyclopsEyeColor == 3) {
                        totalPrice = switch (selectedCyclopsEyeColor) {
                            case 1 -> totalPrice + 5;
                            case 2 -> totalPrice + 6;
                            case 3 -> totalPrice + 7;
                            default -> 0;
                        };
                        System.out.printf("%s $%d!\n", roboticCyclopsCost, totalPrice);
                        System.out.println(endProgram);
                    } else {
                        System.out.println("Please enter a valid input");
                    }
                } else {
                    System.out.println("Please enter a valid input");
                }
            } else {
                System.out.println("Please enter a valid input");
            }
        } else if (selectedToyNumber == 3) {
            System.out.println(sizeQuestion);
            String selectedToySize = scan.nextLine();
            selectedToySize = selectedToySize.toUpperCase();
            if (selectedToySize.equals("S") || selectedToySize.equals("M") || selectedToySize.equals("L")) {
                totalPrice = switch (selectedToySize) {
                    case "S" -> 5;
                    case "M" -> 10;
                    case "L" -> 15;
                    default -> 0;
                };
                System.out.println(catLampQ1);
                int selectedCatLampColor = scan.nextInt();
                scan.nextLine();
                if (selectedCatLampColor == 1 || selectedCatLampColor == 2
                        || selectedCatLampColor == 3) {
                    totalPrice = switch (selectedCatLampColor) {
                        case 1 -> totalPrice + 10;
                        case 2 -> totalPrice + 7;
                        case 3 -> totalPrice + 7;
                        default -> 0;
                    };
                    System.out.println(catLampQ2);
                    String selectedCatLampGlow = scan.nextLine();
                    selectedCatLampGlow = selectedCatLampGlow.toUpperCase();
                    if (selectedCatLampGlow.equals("Y") || selectedCatLampGlow.equals("N")) {
                        totalPrice = switch (selectedCatLampGlow) {
                            case "Y" -> totalPrice + 10;
                            case "N" -> totalPrice + 0;
                            default -> 0;
                        };
                        System.out.printf("%s $%d!\n", catLampCost, totalPrice);
                        System.out.println(endProgram);
                    } else {
                        System.out.println("Please enter a valid input");
                    }
                } else if (selectedCatLampColor == 4) {
                    totalPrice = totalPrice + 5;
                    System.out.printf("%s $%d!\n", catLampCost, totalPrice);
                    System.out.println(endProgram);
                } else {
                    System.out.println("Please enter a valid input");
                }
            } else {
                System.out.println("Please enter a valid input");
            }
        } else if (selectedToyNumber == 4) {
            System.out.println(endProgram);
        } else {
            System.out.println("Please enter a valid input");
        }
    }
}
