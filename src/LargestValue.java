import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by girijah on 11/26/2016.
 */
public class LargestValue {
    public static void main (String[] args){

        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<5; i++) {
            int digit = sc.nextInt();
           if(digit >= 1 || digit <= 1000000000) {
               numbers[i]= digit;
           }
        }

        for (int i=0; i<5; i++) {
            for(int l=i+1;l<5; l++) {
                if (numbers[l] > numbers[i]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[l];
                    numbers[l] = temp;
                }
            }
        }
        int largestValue = numbers[0]+numbers[1]-numbers[4]-numbers[3];
        System.out.println(largestValue);
       }
}
