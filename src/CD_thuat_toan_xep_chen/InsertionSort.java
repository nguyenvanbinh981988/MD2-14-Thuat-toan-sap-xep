package CD_thuat_toan_xep_chen;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 8, 10, 25, 27, 1};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int value = list[i];
            int j;
            for ( j = i-1; j >= 0 && list[j]>value ; j--) {
                 list[j+1]=list[j];
            }
            list[j+1] = value;
            System.out.print("List after the  " + i + "' sort: \n");
            for (int k = 0; k < list.length; k++) {
                System.out.print(list[k] + "\t\n");
            }
        }
        return list;

    }
}
