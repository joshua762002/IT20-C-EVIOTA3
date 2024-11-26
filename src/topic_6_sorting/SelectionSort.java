package topic_6_sorting;

public class SelectionSort {
    public static void selectionSort(int[] numbers) {
        int length = numbers.length;
        for (int current = 0; current < length - 1; current++) {
            int smallestIndex = current;
            for (int next = current + 1; next < length; next++) {
                if (numbers[next] < numbers[smallestIndex]) {
                    smallestIndex = next;
                }
            }
            // Swap the found smallest element with the current element
            int temp = numbers[smallestIndex];
            numbers[smallestIndex] = numbers[current];
            numbers[current] = temp;
        }
    }

    public static void printArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};
        System.out.println("Original array:");
        printArray(numbers);

        selectionSort(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }
}
