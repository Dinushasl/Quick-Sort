package Quick;

public class QuickSort {

	    
	    public static void quickSort(int[] array, int low, int high) {
	        if (low < high) {
	           
	            int pi = partition(array, low, high);

	           
	            quickSort(array, low, pi - 1);
	            quickSort(array, pi + 1, high);
	        }
	    }

	    
	    private static int partition(int[] array, int low, int high) {
	        
	        int pivot = array[high];

	       
	        int i = (low - 1);

	      
	        for (int j = low; j < high; j++) {
	            if (array[j] <= pivot) {
	                i++;

	                int temp = array[i];
	                array[i] = array[j];
	                array[j] = temp;
	            }
	        }

	        int temp = array[i + 1];
	        array[i + 1] = array[high];
	        array[high] = temp;

	        
	        return i + 1;
	    }

	   
	    public static void main(String[] args) {
	        int[] array = {10, 7, 8, 9, 1, 5};
	        int n = array.length;

	        System.out.println("Original array:");
	        printArray(array);

	        quickSort(array, 0, n - 1);

	        System.out.println("Sorted array:");
	        printArray(array);
	    }

	  
	    public static void printArray(int[] array) {
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }
	}



