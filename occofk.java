import java.util.*;
public class occofk {
    public static void findocc(int arr[], int n, int x) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                res++;
            }
        }
        // return res;
        System.out.println(res);
    }
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 5, 6, 7 };
        int n = arr.length;
        int x = 5;
        findocc(arr, n, x);
    }
}
