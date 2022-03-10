// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class InsertionSort {
    public static void main(String[] args) {
        int[] array = { 20, 32, 43, -12, 4, 43 };

        for (int i = 0; i < array.length; i++) {
            int newElement = array[i];
            int j;
            for (j = i; j > 0 && array[j - 1] > newElement; j--) {
                array[j] = array[j - 1];
            }
            array[j] = newElement;

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}