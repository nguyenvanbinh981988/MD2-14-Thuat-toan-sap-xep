package CD_thuat_toan_sap_xep_chon;

public class SellectSort {
    public static void main(String[] args) {
        int[] arr = {6,5,2,8,10,25,27,1};
        selectSort(arr);
        for (int i : arr) {
            System.out.print(i + " " );
        }
    }


    public static int[] selectSort(int[] list) {
        for (int i = 0; i < list.length-1; i++) {
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
        }
        return list;
    }
}
