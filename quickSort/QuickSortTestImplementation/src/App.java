public class App {
    public static void main(String[] args) throws Exception {
        QuickSort quickSort = new QuickSort();
        int[] arr = {10, 7, 8, 9, 1, 5};
        quickSort.quickSort(arr);
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
