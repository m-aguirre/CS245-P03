
public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		boolean swapped = true; //initialized as true to start loop
		
		while(swapped == true) {
			swapped = false;
			for(int i = 0; i < a.length - 1; i++) {
				if(a[i] > a[i + 1]) {
					swap(a,i,i+1);
					swapped = true;
				}
			}
		}		
	}
	
	public void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
