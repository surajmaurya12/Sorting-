
public class bubble {

    public static void sort(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        for (int m : numbers) {
            System.out.print(m + " ");
        }
    }

    public static void main(String[] args) {
        int numbers[] = {9, 5, 6, 7, 3, 8, 1};
        sort(numbers);
    }
}

// sorting of the array in ascending order using bubble sort algorithm 
// output is {1,3,5,6,7,9}
