import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] myArray = new int[10]; // 10 numbers
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = random.nextInt(100);
        }
        for (int num : myArray) {
            System.out.print(num + " ");
        }
        System.out.println(" ");


        int minNumber = myArray[0]; // Min number
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < minNumber) {
                minNumber = myArray[i];
            }
        }

        System.out.println("The smallest number is " + minNumber);

        int maxNumber = myArray[0]; // Max number
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > minNumber) {
                maxNumber = myArray[i];
            }
        }
        System.out.println("The largest number is " + maxNumber);

        double sum = 0;   // Sum of the numbers Використовуємо дабл для більш точного обчислення середнього значення числа в подальному.
        for (int num : myArray) {
            sum += num;
        }
        System.out.println("The sum of the numbers is " + sum);

        double average = sum / myArray.length; // the average number
        System.out.println("The average number is " + average);

    }
}












