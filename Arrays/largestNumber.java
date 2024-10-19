import java.util.*;

public class largestNumber {

    public static void largestNum(int num[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<num.length; i++) {
            if(num[i] > max) {
                max = num[i];
            }

            if(num[i] < min) {
                min = num[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 6, 3, 5};
        largestNum(num);
    }
}