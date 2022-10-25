
public class IterativeSorting {
	public static void printArray(int [] a)
	{
		for (int i = 0; i < a.length; i ++)
		{
			System.out.print(a[i] + " ");
		}
	}
	
	public static void bubbleSort(int [] a)
	{
		for (int i = a.length - 1; i >= 1; i --)
		{
			boolean sorted = false;
			for (int j = 0; j < i; j++)
			{
				if (a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					sorted = false;
				}
			}
			if (sorted)
			{
				return;
			}
		}
	}
	
	public static void selectionSort(int [] a)
	{
		for (int i = a.length - 1; i >= 1; i --)
		{
			int index = i;
			for (int j = 0; j <= i; j ++)
			{
				if (a[j] > a[index])
				{
					index = j;
				}
			}
			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;
		}
	}
	
	public static void insertionSort(int [] a)
	{
		for (int i = 1; i < a.length; i ++)
		{
			int key = a[i];
			for (int j = i - 1; j>= 0 && a[j] > key; j --)
			{
				int temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int [] a = {2,3,1,6,5,4,9,8,7};
		selectionSort(a);
		printArray(a);
	}
}
