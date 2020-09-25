package TH_koSuDungDeQuy;

public class BinarySearch {
    static int[] list = {2, 4,5,7,11, 20, 21, 22};
    static int binarySearch(int[] list, int key) {
        int left = 0;
        int right = list.length -1;
        while (right >= left) {
            int mid = (left + right) / 2;
            if(list[mid] > key) {
                right = mid  - 1;
            } else if(list[mid] == key) {
                return mid;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,5));
    }
}
