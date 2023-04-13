package src.main.java;

public class Main {
    
    public static void main(String[] args) {
        int array[] = {35, 10, 8, 6, 78, 47, 60};
        
        heapSort(array);
        printArray(array);
    }


    public static void heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        for (int i = n - 1; i>= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    private static void heapify(int[] array, int n, int i ) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i +2;
        if (left < n && array[left] > array[largest])
            largest = left;
            
        if (right < n && array[right] > array[largest])
            largest = right;

        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heapify(array, n, largest);
        }        
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
        }
    }
    
}

    

