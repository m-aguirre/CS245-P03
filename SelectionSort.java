
public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int smallest;
		for(int i = 0; i < a.length - 1; i++) {
			smallest = smallest(a, i);
			swap(a, smallest, i);
		}
		
	}
	
	//find the smallest element in array
	public int smallest(int[] arr, int start) {
		int smallest = start;
		for(int i = start + 1; i < arr.length; i++) {
			if(arr[i] < arr[smallest]) {
				smallest = i;
			}
		}
		return smallest;
	}
	
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
