
public class Assignment7 {

	
	public void selectionSort(int[] a) {
		
		//iterate backwards so you can add to the end rather than front
		for(int i = a.length - 1; i >= 0; i--) {
			
			//find index of smallest element
			int largest = i;
			//loop though remaining elements to find largest
			//when found, keep track of largest index
			for(int j = i - 1 ; j >= 0; j--) {
				if(a[j] > a[largest]) {
					largest = j;
				}
			}
			//swap values to the end
			swap(a, i, largest);
		}
	}

	
	private void swap(int[] list, int i, int j) {
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}

}


