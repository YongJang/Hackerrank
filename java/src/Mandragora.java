import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author YongJang
 */
public class Mandragora {
    public static void quickSort(int[] data, int l, int r){
        int left = l;
        int right = r;
        int pivot  = data[(l + r) / 2];

        do{
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;
            if(left <= right){
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);

        if(l < right) quickSort(data, l, right);
        if(r > left) quickSort(data, left, r);
    }

    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++){
            int n = Integer.parseInt(br.readLine());
            int hArray[] = new int[n];
            long sum = 0;

            String numbers = br.readLine();
            String number[] = numbers.split(" ");

            for(int j = 0; j < hArray.length; j++){
                hArray[j] = Integer.parseInt(number[j]);
                sum += hArray[j];
            }

            quickSort(hArray, 0, hArray.length - 1);

            long pArray[] = new long[n];
            long s = 1;
            for(int j = 0; j < hArray.length; j++){
                pArray[j] = sum * s;
                sum -= hArray[j];
                s++;
            }

            long max = pArray[0];
            for(int j = 0; j < pArray.length; j++){
                if(max < pArray[j]){
                    max = pArray[j];
                }
            }

            System.out.println(max);
        }
    }
}
