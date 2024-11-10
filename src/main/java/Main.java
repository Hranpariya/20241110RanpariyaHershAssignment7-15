    import java.util.Scanner;
    import java.util.ArrayList;
    public class Main {
        public static int[] eliminateDuplicates(int[] list) {
            ArrayList<Integer> uniqueList = new ArrayList<>();

            for (int number : list) {
                if (!uniqueList.contains(number)) {
                    uniqueList.add(number);
                }
            }
            int[] result = new int[uniqueList.size()];
            for (int i = 0; i < uniqueList.size(); i++) {
                result[i] = uniqueList.get(i);
            }
            return result;
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter ten numbers: ");

            int[] numbers = new int[10];
            for (int i = 0; i < 10; i++) {
                numbers[i] = scanner.nextInt();
            }
            int[] distinctNumbers = eliminateDuplicates(numbers);
            System.out.print("The distinct numbers are: ");
            for (int number : distinctNumbers) {
                System.out.print(number + " ");
            }
        }
    }