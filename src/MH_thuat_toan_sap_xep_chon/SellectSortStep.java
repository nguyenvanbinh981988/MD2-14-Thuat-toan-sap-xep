package MH_thuat_toan_sap_xep_chon;

import java.util.Scanner;

public class SellectSortStep {
    public static void main(String[] args) {
        int[] arr = {6, 5, 2, 8, 10, 25, 27, 1};
        System.out.print("Your input list: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println("\nBegin sort processing...");
        selectSort(arr);
    }


    public static int[] selectSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int minValue = list[i];
            int minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (minValue > list[j]) {
                    minValue = list[j];
                    minIndex = j;
                }
            }
            list[minIndex] = list[i];
            list[i] = minValue;
            System.out.print("List after the  " + i + "' sort: \n");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t\n");
            }
        }
        return list;
    }
}
