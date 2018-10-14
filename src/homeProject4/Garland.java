package homeProject4;

import java.util.Scanner;

public class Garland {
    public static void main(String[] args) {
        int garland = 2100000123;
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

    public static void blinkingLights(int garland) {
        for (int i = 0; i < 6; i++) {
            garland = ~garland;
            stateGarland(garland);
        }
    }

    public static void runningLights(int garland) {
        System.out.println();
        for (int i = 0; i < 5; i++) {
            garland = garland << 1;
            stateGarland(garland);
        }
    }

    public static void burningLights(int garland) {
        System.out.println();
        stateGarland(garland);
        if ((garland & 1) == 1) {
            System.out.println("lamp is on ");
        } else {
            System.out.println("lamp is off ");
        }
    }

    public static void stateGarland(int garland) {
        System.out.println("garland = " + Integer.toBinaryString(garland));
    }
}
