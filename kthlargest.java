import java.util.*;

public class kthlargest {
    public static void largest(Integer[] arr, int k) {
        if (k > arr.length) {
            System.out.println("please enter valid index");
        } else {
            int temp = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[j]);
            }
            System.out.println(k + "th largest element is:" + arr[arr.length - k + 1]);
        }
    }
    public static void main(String args[]) {
        Integer arr[] = new Integer[] { 1, 3, 2, 4, 5, 6 };
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        largest(arr, h);
    }
}