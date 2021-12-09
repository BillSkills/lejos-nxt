import javax.swing.text.StyledEditorKit;

import lejos.nxt.Button;

public class pucci {

    public static void main(String[] args) {

        int primesTo = 1000;    // largest number to check for prime-ness
        long startTime = System.currentTimeMillis(); // store time at start

        for (int i = 2; i <= primesTo; i++) {
            if (isPrimeBrute(i)){System.out.println(i);}
        }

        System.out.print(System.currentTimeMillis() - startTime); // print total time taken
        System.out.print(" milis");

        Button.waitForAnyPress();   // wait for button press after program finishes
    }

    public static boolean isPrimeBrute(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0){return false;}
        }
        return true;
    }
}
