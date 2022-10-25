import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class IterativeSortingTest {
	
	@Test
	void testBubbleSort() {
		int [] sorted = {1,2,3,4,5,6,7,8,9};
		int [] a = {2,3,1,6,5,4,9,8,7};
		boolean test = true;
		IterativeSorting.bubbleSort(a);
		for(int i = 0; i < a.length; i ++)
		{
			if (a[i] != sorted[i])
			{
				test = false;
				break;
			}
		}
		Assert.assertTrue(test);
	
	}

	@Test
	void testSelectionSort() {
		int [] sorted = {1,2,3,4,5,6,7,8,9};
		int [] a = {2,3,1,6,5,4,9,8,7};
		boolean test = true;
		IterativeSorting.selectionSort(a);
		for(int i = 0; i < a.length; i ++)
		{
			if (a[i] != sorted[i])
			{
				test = false;
				break;
			}
		}
		Assert.assertTrue(test);
	}

	@Test
	void testInsertionSort() {
		int [] sorted = {1,2,3,4,5,6,7,8,9};
		int [] a = {2,3,1,6,5,4,9,8,7};
		boolean test = true;
		IterativeSorting.insertionSort(a);
		for(int i = 0; i < a.length; i ++)
		{
			if (a[i] != sorted[i])
			{
				test = false;
				break;
			}
		}
		Assert.assertTrue(test);
	}

}
