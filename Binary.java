
public class Binary {

    public static int Binary_Search(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {1, 9, 10, 8, 20, 50};
        int key = 50;
        System.out.println("Index of the key : " + Binary_Search(numbers, key));
    }

}
