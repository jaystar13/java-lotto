package step3.iksoo.lotto2rd;

import java.util.Scanner;

public class InputView {
    private static Scanner in = new Scanner(System.in);

    public static String inputText() {
        return in.nextLine();
    }

    public static int inputNumber() {
        int inputNum = in.nextInt();
        in.nextLine();
        return inputNum;
    }
}