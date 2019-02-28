import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        MyArrayList myArrayList = new MyArrayList();
        MyArrayList myArrayList1;
        MyArrayList myArrayList2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("введите размер списка: ");
        int userInputListSize = scanner.nextInt();

        System.out.println("введите диапазон чисел для заполнения списка: ");
        System.out.println("диапазон списока начинается с числа: ");
        int userInputStartNumber = scanner.nextInt();

        System.out.println("диапозон списока заканчивается числом: ");
        int userInputEndNumber = scanner.nextInt();

        System.out.println("сколько будем делать попыток?");
        int userInputTryNumber = scanner.nextInt();

        scanner.close();

        ArrayList resultBubble = new ArrayList();
        ArrayList resultSelect = new ArrayList();
        ArrayList resultInsert = new ArrayList();

        for (int i = 0; i < userInputTryNumber; i++) {

            for (int j = 0; j < userInputListSize; j++) {
                int randomNum = ThreadLocalRandom.current().nextInt(userInputStartNumber, userInputEndNumber + 1);
                myArrayList.add(randomNum);
            }

            myArrayList1 = (MyArrayList) myArrayList.clone();
            myArrayList2 = (MyArrayList) myArrayList.clone();

            long startTime = System.currentTimeMillis();
            myArrayList.bubbleSort();
            long stopTime = System.currentTimeMillis();
            long elapsedTime = stopTime - startTime;
            resultBubble.add(elapsedTime);

            long startTime1 = System.currentTimeMillis();
            myArrayList1.sortSelect();
            long stopTime1 = System.currentTimeMillis();
            long elapsedTime1 = stopTime1 - startTime1;
            resultSelect.add(elapsedTime1);

            long startTime2 = System.currentTimeMillis();
            myArrayList2.sortInsert();
            long stopTime2 = System.currentTimeMillis();
            long elapsedTime2 = stopTime2 - startTime2;
            resultInsert.add(elapsedTime2);
        }

        System.out.print("\nвремя сортировки пузырьком: ");
        for (Object o : resultBubble) {
            System.out.print(o.toString()+ " ");
        }
        System.out.print("\nвремя сортировки выборкой: ");
        for (Object o : resultSelect) {
            System.out.print(o.toString()+ " ");
        }
        System.out.print("\nвремя сортировки вставкой: ");
        for (Object o : resultInsert) {
            System.out.print(o.toString()+ " ");
        }

    }
}
