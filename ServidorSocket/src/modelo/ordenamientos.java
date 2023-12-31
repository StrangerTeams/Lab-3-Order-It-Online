
package modelo;

public class ordenamientos {
    
    // Métodos de ordenamiento...

    // Algoritmo de ordenamiento Burbuja
    public static void ordenamientoBurbuja(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Algoritmo de ordenamiento por Inserción
    public static void ordenamientoInsercion(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }
    
    
    //Algoritmo de ordenamiento por Seleccion
    public static int [] seleccion(int [] arreglo){
        int auxiliar;
        int [] arregloOrdenado;
        for(int i = 0; i < arreglo.length-1; i++){
            for(int j = i+1;j < arreglo.length;j++){
                if(arreglo[i] > arreglo[j]){
                    auxiliar = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = auxiliar;
                }
            }
        }
        arregloOrdenado = arreglo;
        return arregloOrdenado;
    }
    
    //Algoritmo de ordenamiento por Heap sort
    public static void heapify(int [] arreglo, int n, int i){
        int mayor = i;
        int izquierda = 2*i+1;
        int derecha = 2*i+2;
        if(izquierda < n && arreglo[izquierda] > arreglo[mayor]){
            mayor = izquierda;
        }
        if(derecha < n && arreglo[derecha] > arreglo[mayor]){
            mayor = derecha;
        }
        if(mayor != i){
            int auxiliar = arreglo[i];
            arreglo[i] = arreglo[mayor];
            arreglo[mayor] = auxiliar;
            heapify(arreglo,n,mayor);
        }
    }
    
    public static int [] heapSort(int [] arreglo){
        int [] arregloOrdenado;
        int n = arreglo.length;
        for(int i = n/2-1; i >= 0; i--){
            heapify(arreglo,n,i);
        }
        for(int i = n-1; i >= 0; i--){
            int auxiliar = arreglo[0];
            arreglo[0] = arreglo[i];
            arreglo[i] = auxiliar;
            heapify(arreglo,i,0);
        }
        arregloOrdenado = arreglo;
        return arregloOrdenado;
    }
    
    // Algoritmo de ordenamiento por QuickSort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);

            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
    
    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);

        return i + 1;
    }
    
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
        

    //Algoritmo de ordenamiento por Radix-Sort
    public static int [] radixSort(int [] arreglo){
        int [] arregloOrdenado;
        int max = getMax(arreglo);
        for(int exp = 1; max/exp > 0; exp *= 10){
            countSort(arreglo,exp);
        }
        arregloOrdenado = arreglo;
        return arregloOrdenado;
    }
    private static int getMax(int [] arreglo){
        int max = arreglo[0];
        for(int i = 1; i < arreglo.length; i++){
            if(arreglo[i] > max){
                max = arreglo[i];
            }
        }
        return max;
    }
    private static void countSort(int [] arreglo, int exp){
        int n = arreglo.length;
        int [] output = new int[n];
        int [] count = new int[10];
        for(int i = 0; i < n; i++){
            count[(arreglo[i]/exp)%10]++;
        }
        for(int i = 1; i < 10; i++){
            count[i] += count[i-1];
        }
        for(int i = n-1; i >= 0; i--){
            output[count[(arreglo[i]/exp)%10]-1] = arreglo[i];
            count[(arreglo[i]/exp)%10]--;
        }
        for(int i = 0; i < n; i++){
            arreglo[i] = output[i];
        }
    }
    
    //Algoritmo de ordenamiento por Mezcla Natural
    public static int [] mezclaNatural(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            int start = 0;

            while (start < n - 1) {
                int mid = findMid(arr, start);
                merge(arr, temp, start, mid);
                start = mid + 1;
                if (start < n && arr[start - 1] > arr[start]) {
                    sorted = false;
                }
            }
        }
        return arr;
    }

    private static int findMid(int[] arr, int start) {
        int n = arr.length;
        int mid = start + 1;

        while (mid < n && arr[mid - 1] <= arr[mid]) {
            mid++;
        }
        return mid - 1;
    }

    //Algoritmo de ordenamiento por Mezcla directa
    private static void merge(int[] arr, int[] temp, int start, int mid) {
        int i = start;
        int j = mid + 1;
        int k = start;

        while (i <= mid && j < arr.length) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j < arr.length) {
            temp[k++] = arr[j++];
        }

        System.arraycopy(temp, start, arr, start, k - start);
    }

    // Algoritmo de ordenamiento Shell
    public static void ordenamientoShell(int[] array) {
        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i += 1) {
                int temp = array[i];

                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }
}
