import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Questao1 {
	
	public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(4, 7, 9, 5, 1, 6, 3, 8, 2));
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(4, 7, 9, 5, 1, 6, 3, 8, 2));
        List<Integer> arr3 = new ArrayList<>(Arrays.asList(4, 7, 9, 5, 1, 6, 3, 8, 2));
        System.out.println("Lista ordenada em ordem decrescente MergeSort:");
        mergeSort(arr, 0, arr.size() - 1);
        
        System.out.println(arr);
        
        
         System.out.println("Lista ordenada em ordem decrescente Força bruta:");
        bruteForceSort(arr2);
       
        System.out.println(arr2);
        
        System.out.println("Lista ordenada em ordem decrescente QuickSort:");
        quickSort(arr3, 0, arr3.size() - 1);
    }

    public static void mergeSort(List<Integer> arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void merge(List<Integer> arr, int left, int mid, int right) {
        List<Integer> leftList = new ArrayList<>(arr.subList(left, mid + 1));
        List<Integer> rightList = new ArrayList<>(arr.subList(mid + 1, right + 1));

        int i = 0, j = 0, k = left;
        while (i < leftList.size() && j < rightList.size()) {
            if (leftList.get(i) >= rightList.get(j)) {
                arr.set(k, leftList.get(i));
                System.out.println(arr);
                i++;
            } else {
                arr.set(k, rightList.get(j));
                System.out.println(arr);
                j++;
            }
            k++;
        }

        while (i < leftList.size()) {
            arr.set(k, leftList.get(i));
            System.out.println(arr);
            i++;
            k++;
        }

        while (j < rightList.size()) {
            arr.set(k, rightList.get(j));
            System.out.println(arr);
            j++;
            k++;
        }
        System.out.println( arr);
    }
    
    
    
    
    public static void bruteForceSort(List<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr.get(j) > arr.get(maxIndex)) {
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(maxIndex));
                arr.set(maxIndex, temp);
                System.out.println(arr);
            }
        }
    }
    
    public static void quickSort(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr.get(j) >= pivot) {
                i++;
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }

        int temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);

        System.out.println(arr);

        return i + 1;
    }
    
}
