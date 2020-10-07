//This problem sorts numbers in an array

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class BubbleSort {
    public static void main(String[] args) {
//        Given that we have an input array
          int[] input = {5, 6, 2, 4, 1};
          int[] result = sortIn(input);
          printResult(result);
    }

    private static int[] sortIn(int[] in) {
        boolean isSorted = false;
        int lastIdx = in.length - 1;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastIdx; i++) {
                if (in[i] > in[i + 1]) {
                    int temp = in[i];
                    in[i] = in[i + 1];
                    in[i + 1] = temp;
                    isSorted = false;
                }
            }
            lastIdx--;
        }

        for (int i=0; i<in.length; i++) {
            System.out.println("The input["+ i +"]: " + in[i]);
        }

        return in;
    }
    private static void printResult(int[] in) {
        System.out.println("Printing");
        for (int i=0; i<in.length; i++) {
            System.out.println("The input["+ i +"]: " + in[i] + "\n");
        }
    }
}
