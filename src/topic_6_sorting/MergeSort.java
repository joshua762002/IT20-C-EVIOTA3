package topic_6_sorting;

public class MergeSort {
    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }

        int middle = array.length / 2;
        int[] leftHalf = new int[middle];
        int[] rightHalf = new int[array.length - middle];

        System.arraycopy(array, 0, leftHalf, 0, middle);
        System.arraycopy(array, middle, rightHalf, 0, array.length - middle);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(array, leftHalf, rightHalf);
    }

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
        int leftIndex = 0, rightIndex = 0, mergedIndex = 0;
        while (leftIndex < leftHalf.length && rightIndex < rightHalf.length) {
            if (leftHalf[leftIndex] <= rightHalf[rightIndex]) {
                array[mergedIndex++] = leftHalf[leftIndex++];
            } else {
                array[mergedIndex++] = rightHalf[rightIndex++];
            }
        }

        while (leftIndex < leftHalf.length) {
            array[mergedIndex++] = leftHalf[leftIndex++];
        }

        while (rightIndex < rightHalf.length) {
            array[mergedIndex++] = rightHalf[rightIndex++];
        }
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original array:");
        printArray(array);

        mergeSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }
}
