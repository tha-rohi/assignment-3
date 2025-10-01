package binarysearch;


	public class BinarySearchGeneric<T extends Comparable<T>> {
	    public int search(T[] arr, T target) {
	        int left = 0;
	        int right = arr.length - 1;
	        
	        while (left <= right) {
	            int mid = left + (right - left) / 2;
	            int cmp = arr[mid].compareTo(target);
	            
	            if (cmp == 0) {
	                return mid;  // Found
	            } else if (cmp < 0) {
	                left = mid + 1;  // Search right half
	            } else {
	                right = mid - 1;  // Search left half
	            }
	        }
	        return -1;  // Not found
	    }
	    public int searchRecursive(T[] arr, T target) {
	        return searchHelper(arr, target, 0, arr.length - 1);
	    }
	    
	    public int searchHelper(T[] arr, T target, int left, int right) {
	        if (left > right) {
	            return -1;
	        }
	        int mid = left + (right - left) / 2;
	        int cmp = arr[mid].compareTo(target);
	        
	        if (cmp == 0) {
	            return mid;
	        } else if (cmp < 0) {
	            return searchHelper(arr, target, mid + 1, right);
	        } else {
	            return searchHelper(arr, target, left, mid - 1);}
	        }
	    
	    public void displayResult(T target, int index) {
	        if (index != -1) {
	            System.out.println("Found '" + target + "' at index " + index);
	        } else {
	            System.out.println("'" + target + "' not found");
	        }
	    
	
	}

}
