package sem_3_HW;

/**
 * Реализовать алгоритм сортировки слиянием
 */

import java.util.Arrays;

public class task_1 {
    public static void main(String[] args) {
        int[] array = {5, 100, 8, 87, 23, 45, 40, 31};
        int[] result = mergeSort(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSort(int[] arr) {
        int[] buffer1 = Arrays.copyOf(arr, arr.length);
        int[] buffer2 = new int[arr.length];
        return mergeSortInner(buffer1, buffer2, 0, arr.length);
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return buffer1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
}