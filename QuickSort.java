
public class QuickSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int top = 0;
		int bottom = a.length - 1;
		quickSort(a, top, bottom);
		
	}
	
	public void quickSort(int[] arr, int top, int bottom) {
		int pivot = partition(arr, top, bottom );	
		if(top < (pivot - 1)) {
			quickSort(arr, top, (pivot - 1));
		}
		if(pivot < bottom) {
			quickSort(arr, pivot, bottom);
		}
	}
	
	public int partition(int [] arr, int top, int bottom) {
		
		int pivot = (top + bottom) / 2;
		int i = top;
		int j = bottom;

		while (i <= j) {
			while(arr[i] < arr[pivot]) {
				i++;
			}
			while(arr[j] > arr[pivot]) {
				j--;
			}
			if(i <= j) {
				if(i == pivot) {
					pivot = j;
				} else if (j == pivot) {
					pivot = i;
				}
				swap(arr, i, j);
				i++;
				j--;
			}
		}
		return i;
	}
	
	public void swap(int [] arr,int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
