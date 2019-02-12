import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		
		int [] arr = {11,2,4,77,56,33,45};
		System.out.println(Arrays.toString(insertSort(arr)));
	}
	
	
	public static int [] insertSort(int [] arr)
	{
		int len = arr.length;
		
		for(int i = 1 ; i < len ; i++)
		{
			int key = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > key)
			{
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		return arr;
	}

}
