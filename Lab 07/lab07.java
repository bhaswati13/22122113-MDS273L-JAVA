import java.util.*;
import java.io.*;

public class Lab07 {
    static float mean(float[] numbers) {
        float sum = 0;
        for (float number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    static float median(float[] numbers) {
        Arrays.sort(numbers);
        if (numbers.length % 2 == 0) {
            int x = numbers.length / 2;
            int y = x - 1;
            return (numbers[x] + numbers[y]) / 2.0f;
        } else {
            return numbers[numbers.length / 2];
        }
    }

    static float mode(float[] numbers) {
        int[] numbercount = new int[numbers.length];
        float mode = 0;
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count++;
                }
            }
            numbercount[i] = count;
            if (count > max) {
                max = count;
                mode = numbers[i];
            }
        }
        return mode;
    }

    static float min(float[] numbers) {
        float min = numbers[0];
        for (float number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }

    static float max(float[] numbers) {
        float max = numbers[0];
        for (float number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }

    static void display(String[][] numbers, int count, String filename) {
        float[] sepallength = new float[count];
        float[] sepalwidth = new float[count];
        float[] petallength = new float[count];
        float[] petalwidth = new float[count];

        for (int i = 1; i <= count; i++) {
            sepallength[i - 1] = Float.parseFloat(numbers[i][1]);
            sepalwidth[i - 1] = Float.parseFloat(numbers[i][2]);
            petallength[i - 1] = Float.parseFloat(numbers[i][3]);
            petalwidth[i - 1] = Float.parseFloat(numbers[i][4]);
        }
        String[] firstrow = {"Parameters", "Mean", "Median", "Mode", "Max", "Min"};
        String[] secondrow = {"Sepal Length", mean(sepallength) + "", median(sepallength) + "",
                mode(sepallength) + "", max(sepallength) + "", min(sepallength) + ""};
        String[] thirdrow = {"Sepal Width", mean(sepalwidth) + "", median(sepalwidth) + "",
                mode(sepalwidth) + "", max(sepalwidth) + "", min(sepalwidth) + ""};
        String[] fourthrow = {"Petal Length", mean(petallength) + "", median(petallength) + "",
                mode(petallength) + "", max(petallength) + "", min(petallength) + ""};
        String[] fifthrow = {"Petal Width", mean(petalwidth) + "", median(petalwidth) + "",
                mode(petalwidth) + "", max(petalwidth) + "", min(petalwidth) + ""};

        System.out.println(Arrays.toString(firstrow));
        System.out.println(Arrays.toString(secondrow));