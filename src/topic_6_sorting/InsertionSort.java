package topic_6_sorting;

public class InsertionSort {
    public static void insertionSort(int[] data) {
        int size = data.length;
        for (int index = 1; index < size; index++) {
            int currentElement = data[index];
            int position = index - 1;

            // Shift elements of data[0..index-1], that are greater than currentElement, to one position ahead
            while (position >= 0 && data[position] > currentElement) {
                data[position + 1] = data[position];
                position = position - 1;
            }
            data[position + 1] = currentElement;
        }
    }

    public static void printArray(int[] list) {
        for (int element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6};
        System.out.println("Original array:");
        printArray(data);

        insertionSort(data);

        System.out.println("Sorted array:");
        printArray(data);
    }
}
