import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] denary = {6, 12, 13 ,25, 192, 255, 61, 29};
        ArrayList<Integer> denaryArray = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String guess;

        for (int i = 0; i < denary.length; i++) {
            denaryArray.add(denary[i]);
        }

        for (int i = 0; i < denaryArray.size(); i++) {
            Integer current = denaryArray.get(i);
            PaddedBinary jose = new PaddedBinary(8, current);
            String thingy = jose.toPaddedString();
            System.out.println(current);
            String binary = Integer.toBinaryString(current);
            System.out.print("What is this number in binary?: ");
            guess = scanner.nextLine();
            if (guess.equals(binary)) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect, correct answer is " + binary);
            }
            System.out.println();
        }
    }
}