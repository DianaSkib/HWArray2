import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ///task1

        int[] inputArray1 = {15630, 3000, 87236, 5486, 90000};
        double[] outputArray1 = new double[4];
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];
        for (int payment : inputArray1) {
            sum += payment;
            if (payment > max) {
                max = payment;
            }
            if (payment < min) {
                min = payment;
            }
        }
        double average = (double) sum / inputArray1.length;
        outputArray1[0] = sum;
        outputArray1[1] = max;
        outputArray1[2] = min;
        outputArray1[3] = average;
        System.out.println("inputArray1: " + Arrays.toString(inputArray1));
        System.out.println("outputArray1: " + Arrays.toString(outputArray1));

        /// task2

        int[] inputArray2 = {64861, 4548, 58300, 78931, 48519};
        double[] outputArray2 = new double[inputArray2.length];
        final double taxRate = 0.13;
        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * taxRate;
        }
        System.out.println("inputArray2 (выплаты сотрудникам, руб.): " + Arrays.toString(inputArray2));
        System.out.println("outputArray2 (налог 13 %, руб.): " + Arrays.toString(outputArray2));

        ///task 3

        int[] inputArray3 = {3000, 4800, 5000, 7900, 8300};
        boolean[] outputArray3 = new boolean[inputArray3.length];
        for (int i = 0; i < inputArray3.length; i++) {
            outputArray3[i] = inputArray3[i] > 3000;
        }
        System.out.println("inputArray3: " + java.util.Arrays.toString(inputArray3));
        System.out.println("outputArray3: " + java.util.Arrays.toString(outputArray3));

        /// task 4

        int[] inputArray4 = {2300, 64230, -9316, 4682, 1359};
        boolean outputArray4;
        outputArray4 = true;
        for (int balance : inputArray4) {
            if (balance < 0) {
                outputArray4 = false;
                break;
            }
        }
        System.out.println("inputArray4: " + java.util.Arrays.toString(inputArray4));
        System.out.println("outputArray4: " + outputArray4);

        /// task 5

        int[] inputArray5 = {13468, -3269, 0, 13888, 13000};
        int outputArray5 = 0;
        for (int profit : inputArray5) {
            if (profit > 0) {
                outputArray5++;
            }
        }
        System.out.println("inputArray5: " + java.util.Arrays.toString(inputArray5));
        System.out.println("outputArray5 (количество рентабельных месяцев): " + outputArray5);
    }
}