package CD_thuat_toan_noi_bot;

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {6, 5, -3, 8, 10, 25, 27, -5};
        bubbleSort(list);
        for (int i:list) {
            System.out.print(" "+i);
        }

    }


    public static int[] bubbleSort(int[] list) {
        boolean needNodePass = true;
        for (int i = 0; i < list.length&&needNodePass; i++) {
            needNodePass = false;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;

                    needNodePass = true;
                }
            }
        }
        return list;
    }
}

