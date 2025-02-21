public class QuickSort {

    public void quickSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;   
        }
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high) {
        if (low <= high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private int partition(int[] array, int low, int high) { // Lomuto scheme
        int pivot = low + (int)(Math.random() * (high - low + 1)); // int pivot = array[high]; 
        int i = low - 1;
        for (int j = low; j < high; j++) { // j itterates though all exempt the last element in the array
            if (array[j] <= pivot) {
                swap(array, ++i, j);
            }
        }
        swap(array, high, i + 1);
        return i + 1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
