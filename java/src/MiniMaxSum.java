import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author YongJang
 * https://www.hackerrank.com/challenges/mini-max-sum
 */

public class MiniMaxSum {
	public static void main(String args[]) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		String strs[] = str.split("\\s+");
		long num[] = new long[strs.length];
		for (int i = 0; i < num.length; i++) {
			num[i] = Long.parseLong(strs[i]);
		}
		
		MiniMaxSum mms = new MiniMaxSum();
		mms.mergeSort(num, 0, num.length - 1);
		
		long sum = 0;
		
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println((sum - num[num.length - 1]) + " " + (sum - num[0]));
		
	}
	
	public void mergeSort(long[] array, int left, int right) {
		int mid;
		
		if (left < right) {
			mid = (left + right) / 2;
			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);
			merge(array, left, mid, right);
		}	
	}
	
	public void merge(long[] array, int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int k = left;
		
		long tempArray[] = new long[array.length];
		while (i <= mid && j <= right) {
			if (array[i] < array[j]) {
				tempArray[k] = array[i];
				i++;
			} else {
				tempArray[k] = array[j];
				j++;
			}
			k++;
		}
		
		while (i <= mid) {
			tempArray[k++] = array[i++];
		}
		
		while (j <= right) {
			tempArray[k++] = array[j++];
		}
		
		for (int n = left; n <= right; n++) {
			array[n] = tempArray[n];
		}
	}
}
