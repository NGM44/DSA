
class SelectionSort {
    public static void main(String[] args) {
        int[] array = { 20, 32, 43, -12, 4, 43 };

        for (int i = array.length - 1; i > 0; i--) {
            int largest = 0;
            for (int j = 1; j <= i; j++) {
                if (array[j] > array[largest])
                    largest = j;
            }
            swap(array, largest, i);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void swap(int[] arr, int i, int j) {

        if (i == j)
            return;
        if (arr[i] > arr[j]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }

}