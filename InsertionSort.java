
public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int j;
		for(int i = 1; i < a.length; i++) {
			j = i;
			while(j > 0 && a[j - 1] > a[j]) {
				swap(a, j, (j - 1));
				j--;
			}
		}
		
	}
	
	public void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
