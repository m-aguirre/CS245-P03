
public class MergeSort implements SortingAlgorithm {
	
	private int[] tempArr;
	
	@Override
	public void sort(int[] a) {
		this.tempArr = new int[a.length]; //create temporary array for comparison
		//copy a contents into tempArr
		for(int i = 0; i < a.length; i++) {
			this.tempArr[i] = a[i];
		}		
		partition(a, 0, a.length-1);	
	}
	
	//divide array into sub arrays of length 1, then merge
	public void partition(int[] arr, int top, int bottom) {
		if(top < bottom) {
			int midPoint = (top + bottom) / 2;
			partition(arr, top, midPoint);
			partition(arr, midPoint + 1, bottom);
			merge(arr, top, midPoint + 1, bottom );
		}		
	}

	public void merge(int[] arr, int top, int midPoint, int bottom) {
			
		int bottomIndex = midPoint - 1;
        int topIndex = top;
        int index = bottom - top + 1;

        while(top <= bottomIndex && midPoint <= bottom) {
            if(arr[top] <= arr[midPoint]) {
                this.tempArr[topIndex] = arr[top];
        		topIndex++;
        		top++;
            }  else {
                this.tempArr[topIndex] = arr[midPoint];
                topIndex++;
                midPoint++;
            }	
        }
        while(top <= bottomIndex) { 
            this.tempArr[topIndex] = arr[top];
            topIndex++;
            top++;
        }
        while(midPoint <= bottom) { 
            this.tempArr[topIndex] = arr[midPoint];
            topIndex++;
            midPoint++;
        }

        for(int i = 0; i < index; i++, bottom--)
            arr[bottom] = this.tempArr[bottom];
		
	}

}
