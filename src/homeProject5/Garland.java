package homeProject5;

import java.util.Scanner;
import java.util.Arrays;

public class Garland {
    public static void main(String[] args) {
        int[] garland = {0, 1, 1, 0, 1};
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1 - blinking, 2 - running, 3 - check lamp, 4 - show garland, 0 - exit");
            switch (sc.nextInt()) {
                case 1:
                    blinkingLights(garland);
                    break;
                case 2:
                    runningLights(garland);
                    break;
                case 3:
                    burningLights(garland);
                    break;
                case 4:
                    stateGarland(garland);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Try again");
                    break;
            }
        } while (true);
    }

    public static void blinkingLights(int[] garland) {
        for (int i = 0; i < 5; i++) {
            switch (garland[i]) {
                case 0:
                    garland[i] = 1;
                    break;
                case 1:
                    garland[i] = 0;
                    break;
            }
        }
        stateGarland(garland);
    }

    public static void runningLights(int[] garland) {
        int preElem = garland[0];
        int nextElem = 0;
        for (int i = 0; i < garland.length; i++) {
            if (i != garland.length - 1) {
                nextElem = garland[i + 1];
                garland[i + 1] = preElem;
                preElem = nextElem;
            }
            else {
                garland[0] = nextElem;
            }
        }
        stateGarland(garland);
    }

    public static void burningLights(int[] garland) {
        stateGarland(garland);
        if (garland[0] == 1) {
            System.out.println("lamp is on ");
        } else {
            System.out.println("lamp is off ");
        }
    }

    public static void stateGarland(int[] garland) {
        System.out.println(Arrays.toString(garland));
    }
}
