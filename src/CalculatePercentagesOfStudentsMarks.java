import java.util.Scanner;

public class CalculatePercentagesOfStudentsMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] marksArr;

        System.out.println("How many subjects does the student have: ");
        int size = input.nextInt();
        marksArr = new float[size];
        float total = 0;
        float avg;

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the marks of subject " + (i + 1));
            marksArr[i] = input.nextFloat();
            total = total + marksArr[i];
        }

        avg = total / size;
        System.out.println("The average percentage is " + avg);
    }
}
