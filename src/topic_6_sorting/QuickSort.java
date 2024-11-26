package topic_6_sorting;

public class QuickSort {
    public static void quickSort(int[] numbers, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(numbers, start, end);

            // Recursively sort elements before and after partition
            quickSort(numbers, start, pivotIndex - 1);
            quickSort(numbers, pivotIndex + 1, end);
        }
    }

    private static int partition(int[] numbers, int start, int end) {
        int pivotValue = numbers[end];
        int smallerIndex = start - 1;

        for (int currentIndex = start; currentIndex < end; currentIndex++) {
            if (numbers[currentIndex] <= pivotValue) {
                smallerIndex++;
                // Swap numbers[smallerIndex] and numbers[currentIndex]
                int temp = numbers[smallerIndex];
                numbers[smallerIndex] = numbers[currentIndex];
                numbers[currentIndex] = temp;
            }
        }

        // Swap numbers[smallerIndex + 1] and numbers[end] (or pivotValue)
        int temp = numbers[smallerIndex + 1];
        numbers[smallerIndex + 1] = numbers[end];
        numbers[end] = temp;

        return smallerIndex + 1;
    }

    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {10, 80, 30, 90, 40, 50, 70};
        System.out.println("Original array:");
        printArray(numbers);

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("Sorted array:");
        printArray(numbers);
    }
}
